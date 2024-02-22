package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class profController {
	  @FXML
	    private TableColumn<studiant,String> colCNE;
	  @FXML
	    private Button btnRetour;

	    @FXML
	    private TableColumn<studiant,String> colMatiere;
	    

	    @FXML
	    private TableColumn<studiant,String> colNom;

	    @FXML
	    private TableColumn<studiant,String> colNote;

	    @FXML
	    private ComboBox<String> combFilere;

	    @FXML
	    private ComboBox<String> combMatiere;

	    @FXML
	    private TableView<studiant> tableNote;

	    @FXML
	    private TextField textNote;
	    @FXML
	    private void initialize() throws SQLException {
	    	Statement st1 = null;
	    	ResultSet rst1 = null;
	    	st1=base.getConnection().createStatement();
	    	String query="SELECT * FROM gestion_note1.matiere_professeur WHERE ID_PROFESSEUR='"+SampleController.id_prof+"'";
	    	rst1=st1.executeQuery(query);
	    	while(rst1.next()) {
	    		combFilere.getItems().add(rst1.getString("ID_FILIERE"));
	    		
	    	}
	    	st1 = null;
	    	 rst1 = null;
	    	st1=base.getConnection().createStatement();
	    	
	    	rst1=st1.executeQuery(query);
	    	while(rst1.next()) {
	    		
	    		combMatiere.getItems().add(rst1.getString("ID_MAtiere"));
	    	}
	    	colCNE.setCellValueFactory(new PropertyValueFactory<studiant,String>("cne"));
	    	colMatiere.setCellValueFactory(new PropertyValueFactory<studiant,String>("matiere"));
	    	colNom.setCellValueFactory(new PropertyValueFactory<studiant,String>("nom"));
	    	colNote.setCellValueFactory(new PropertyValueFactory<studiant,String>("note"));
	    	 
	    }
	    

	    @FXML
	    void btnAff(ActionEvent event) throws SQLException {
	    	Statement st1 = null;
	    	ResultSet rst1 = null;
	    	tableNote.getItems().clear();
	    	
	    	 if(combFilere.getValue()!=null&&combMatiere.getValue()!=null) {
	    		 st1=base.getConnection().createStatement();
			    	String query="SELECT *"
			    			+ " FROM gestion_note1.etudiant_matiere m ,gestion_note1.etudiant e WHERE"
			    			+ " e.ID_ETUDIANT=m.ID_ETUDIANT and e.ID_FILIERE='"+combFilere.getValue()+"' and m.ID_MATIERE='"+combMatiere.getValue()+"'  ";
			    	rst1=st1.executeQuery(query);
			    	while(rst1.next()) {
			    		if(rst1.getString("m.NOTE")==null)
			    		tableNote.getItems().add(new studiant(rst1.getString("e.ID_ETUDIANT"),rst1.getString("e.NOM_ETUDIANT"),null,rst1.getString("m.ID_MATIERE")));
			    		
			    		
			    	}
	    	 }
	    	
	    }

	    @FXML
	    void btnAjoute(ActionEvent event) throws SQLException {
              int i=tableNote.getSelectionModel().getSelectedIndex();
              PreparedStatement ps5=null;
              studiant s=tableNote.getItems().get(i);
              if(textNote.getText()!=null &&i>=0) {
            	  String query11="UPDATE etudiant_matiere set NOTE='"+Float.parseFloat(textNote.getText())+"' WHERE ID_MATIERE='"+combMatiere.getValue()+"'and ID_ETUDIANT='"+s.getCne()+"'";
      	    	ps5=base.getConnection().prepareStatement(query11); 
      	    	ps5.executeUpdate();
      	    	tableNote.getItems().remove(i);
      	    	s.setNote(textNote.getText());
      	    	tableNote.getItems().add(s);
      	    	
              }
	    }
	    @FXML
	    void retour(ActionEvent event) {
              Main m=new Main();
              m.start(new Stage());
              btnRetour.getScene().getWindow().hide();
	    }


}
