package application;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController{
	 static String id_prof;
	 static String id_etudiant;
    @FXML
    private Label Etud;

    @FXML
    private AnchorPane PanEtud;

    @FXML
    private AnchorPane PanProf;

    @FXML
    private AnchorPane PanRes;

    @FXML
    private Label Prof;

    @FXML
    private Label Res;
    @FXML
    private Button btnEtu;
    @FXML
    private Button btnprof;

    @FXML
    private Button btnres;
    @FXML
    private PasswordField passprof;

    @FXML
    private PasswordField passres;

    @FXML
    private TextField textprof;

    @FXML
    private TextField textres;

    @FXML
    private PasswordField passetud;
    @FXML
    private TextField textetu;
    @FXML
    
    void VisibleEtu(MouseEvent event) {
               PanEtud.setVisible(true);
               PanProf.setVisible(false);
               PanRes.setVisible(false);
    }

    @FXML
    void VisibleProf(MouseEvent event) {
    	PanEtud.setVisible(false);
        PanProf.setVisible(true);
        PanRes.setVisible(false);
    }

    @FXML
    void VisibleRes(MouseEvent event) {
    	PanEtud.setVisible(false);
        PanProf.setVisible(false);
        PanRes.setVisible(true);
    }
    @FXML
    void LoginEtud(ActionEvent event) throws SQLException {
        
        PreparedStatement ps=null ;
		ResultSet rs = null;
        if(!textres.getText().equals(null)&&!passres.getText().equals(null)) {
      	  String query="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=? AND NOM_ETUDIANT=?;";
      	  ps=base.getConnection().prepareStatement(query);
				ps.setString(1,passetud.getText());
				ps.setString(2,textetu.getText());
				rs=ps.executeQuery();
			
				if(rs.next()) {
					id_etudiant=passetud.getText();
					classEtud l=new classEtud();
					  l.start(new Stage());
		           btnEtu.getScene().getWindow().hide();
		            
				}
				else {
					Alert erreur=new Alert(Alert.AlertType.ERROR);
					erreur.setTitle("les donnees que vous avez saisi n'est pas correcte");
					erreur.setContentText("No connectees");
					erreur.show();
				}
        }
        else {
      	  Alert erreur=new Alert(Alert.AlertType.ERROR);
				erreur.setTitle("remplissez tous les donn�es");
				erreur.setContentText("No connect�es");
				erreur.show();
        }
        
    }

    @FXML
   
    void LoginProf(ActionEvent event) throws SQLException {
    	 PreparedStatement ps=null ;
 		ResultSet rs = null;
         if(!textres.getText().equals(null)&&!passres.getText().equals(null)) {
       	  String query="SELECT * FROM gestion_note1.professeur WHERE ID_PROFESSEUR=? AND NOM=?;";
       	  ps=base.getConnection().prepareStatement(query);
 				ps.setString(1,passprof.getText());
 				ps.setString(2,textprof.getText());
 				rs=ps.executeQuery();
 			
 				if(rs.next()) {
 		           id_prof=passprof.getText();
 					prof l=new prof();
 					  l.start(new Stage());
 		         btnres.getScene().getWindow().hide();
 	
 		            
 				}
 				else {
 					Alert erreur=new Alert(Alert.AlertType.ERROR);
 					erreur.setTitle("les donn�es que vous avez saisi n'est pas correcte");
 					erreur.setContentText("No connect�es");
 					erreur.show();
 				}
         }
         else {
       	  Alert erreur=new Alert(Alert.AlertType.ERROR);
 				erreur.setTitle("remplissez tous les donn�es");
 				erreur.setContentText("No connect�es");
 				erreur.show();
         }
    }
    @FXML
    
    void loginRes(ActionEvent event) throws SQLException {
              
              PreparedStatement ps=null ;
  			ResultSet rs = null;
              if(!textres.getText().equals(null)&&!passres.getText().equals(null)) {
            	  String query="SELECT * FROM gestion_note1.responsable WHERE ID_RESPONSABLE=? AND NOM=?;";
            	  ps=base.getConnection().prepareStatement(query);
					ps.setString(1,passres.getText());
					ps.setString(2,textres.getText());
					rs=ps.executeQuery();
				
					if(rs.next()) {
						page_responsable l=new page_responsable();
						  l.start(new Stage());
			           btnres.getScene().getWindow().hide();
			            
					}
					else {
						Alert erreur=new Alert(Alert.AlertType.ERROR);
						erreur.setTitle("les donnees que vous avez saisi n'est pas correcte");
						erreur.setContentText("No connectees");
						erreur.show();
					}
              }
              else {
            	  Alert erreur=new Alert(Alert.AlertType.ERROR);
					erreur.setTitle("remplissez tous les donn�es");
					erreur.setContentText("No connect�es");
					erreur.show();
              }
              
    }





}