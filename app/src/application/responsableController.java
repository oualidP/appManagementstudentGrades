package application;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class responsableController {
     
    @FXML
    private TableColumn<etudiant, String> CNE_Col;
    
    @FXML
    private Pane pane_listEtud;
    @FXML
    private Button btnRetour;
    @FXML
    private TableView<AffFiliere> tableaffFiliere;

    
    @FXML
    private ComboBox<String> comb_Filiere;
    @FXML
    private TableColumn<AffFiliere, String> col_id_f;

    @FXML
    private TableColumn<AffFiliere,String> col_nom_filiere;

    @FXML
    private ComboBox<String> comb_Semstre;

    @FXML
    private TableColumn<etudiant, String> Filiere_col1;
    @FXML
    private TableColumn<etudiant, String> CNE_Col1;


    @FXML
    private TableColumn<etudiant, String> Filiere_col;

    @FXML
    private ComboBox<String> Filiere_comb;
    @FXML
    private TableColumn<etudiant, String> Nom_Col1;

    @FXML
    private TableColumn<etudiant, String> Pren_Col1;
    @FXML
    private TableView<etudiant> tableEtude1;

    @FXML
    private TableColumn<etudiant, String> Nom_Col;

    @FXML
    private TableColumn<etudiant, String> Pren_Col;

    @FXML
    private TextField id_etud;

    @FXML
    private TextField nom_etud;

    @FXML
    private Pane pane_etud;
  
    @FXML
    private TableColumn<matiereProf,String> col_CINPM;

    @FXML
    private TableColumn<matiereProf,String> col_MatiereM;

    @FXML
    private TextField prenom_etud;
    @FXML
    private TableView<etudiant> tableEtude;
    @FXML
    private TableColumn<professeur,String> col_NomP;

    @FXML
    private TableColumn<professeur,String> col_cinP;

    @FXML
    private TableColumn<professeur,String> col_filiereP;

    @FXML
    private TableColumn<professeur,String> col_prenomP;
    @FXML
    private TableColumn<professeur,String> col_NomP1;

    @FXML
    private TableColumn<professeur,String> col_cinP1;

    @FXML
    private TableColumn<professeur,String> col_filiereP1;

    @FXML
    private TableColumn<professeur,String> col_prenomP1;

    @FXML
    private ComboBox<String> comb_FilereProf;
    @FXML
    private TableView<professeur> tableProf;
    @FXML
    private TableView<professeur> tableProf1;
    @FXML
    private TextField M_IdMatiere;
    @FXML
    private TextField M_IdMatiere1;
    @FXML
    private TableColumn<matiere, String> M_colidF;
    @FXML
    private TableColumn<matiere, String> M_colidF1;

    @FXML
    private TableColumn<matiere, String> M_colidM;
    @FXML
    private TableColumn<matiere, String> M_colidM1;

    @FXML
    private TableColumn<matiere, String> M_colidS;

    @FXML
    private TableColumn<matiere, String> M_colidS1;
    @FXML
    private TableColumn<matiere, String> Mcol_nomM;
    @FXML
    private TableColumn<matiere, String> Mcol_nomM1;

    @FXML
    private ComboBox<String> M_combIdF1;

    @FXML
    private ComboBox<String> M_combIdS;
    @FXML
    private TableView<matiere> tableMatiere;
    @FXML
    private TableView<matiere> tableMatiere1;
    @FXML
    private TableColumn<Filiere,String> F_idFiliere;
    @FXML
    private TextField F_idFiliere1;

    @FXML
    private ComboBox<String> F_idRes;

    @FXML
    private TableColumn<Filiere,String> F_idResponsable;

    @FXML
    private TableColumn<Filiere,String> F_nomFiliere;
    @FXML
    private TextField F_NomFiliere;
    @FXML
    private Pane paneAffFiliere;
   
  

    @FXML
    private TextField M_NamMatiere;

    @FXML
    private Pane panelistprof;

    @FXML
    private TextField txt_NomProf;

    @FXML
    private TextField txt_cinProf;

    @FXML
    private TextField txt_prenProf;
    @FXML
    private Pane paneMprof;

    @FXML
    private Pane paneajoutP;
    @FXML
    private ComboBox<String> comb_cinpm;

    @FXML
    private ComboBox<String> comb_idmp;
    @FXML
    private TableView<matiereProf> tableMPF;
    @FXML
    private TableColumn<matiereProf,String> col_FilierePM;
    @FXML
    private ComboBox<String> comb_Fpm;

    @FXML
    private Pane paneMatiere;
    @FXML
    private Pane paneAffMatiere;
    @FXML
    private Pane paneFiliere;

    @FXML
    private TableView<Filiere> tableFiliere;
    

    
    @FXML
    void AjoutMProf(ActionEvent event) {
             paneajoutP.setVisible(true);
    }

    @FXML
    void affMFiliere(ActionEvent event) {
             paneAffFiliere.setVisible(true);
    }

   

    @FXML
    void affMlistEtud(ActionEvent event) {
              pane_listEtud.setVisible(true);
    }

    @FXML
    void affichMmatiere(ActionEvent event) {
           paneAffMatiere.setVisible(true);
    }

    @FXML
    void afflisteMprof(ActionEvent event) {

        panelistprof.setVisible(true);
    }

    @FXML
    void ajoutMenuEtud(ActionEvent event) {
            pane_etud.setVisible(true);
    }

    @FXML
    void ajoutMmatiere(ActionEvent event) {
       paneMatiere.setVisible(true);
    }
    @FXML
    void AjouteMmprof(ActionEvent event) {
           paneMprof.setVisible(true);
    }
    @FXML
    private void initialize() throws SQLException {
    	Statement st = null;
    	ResultSet rst = null;
    	st=base.getConnection().createStatement();
    	rst=st.executeQuery("SELECT * FROM gestion_note1.filiere;");
    	while(rst.next()) {
    		Filiere_comb.getItems().add(rst.getString("ID_FILIERE"));
    		comb_Filiere.getItems().add(rst.getString("ID_FILIERE"));
    		comb_Fpm.getItems().add(rst.getString("ID_FILIERE"));
    		M_combIdF1.getItems().add(rst.getString("ID_FILIERE"));
    	}
    	st=base.getConnection().createStatement();
    	rst=st.executeQuery("SELECT * FROM gestion_note1.semestre;");
    	while(rst.next()) {
    		comb_Semstre.getItems().add(rst.getString("ID_SEMESTRE"));
    		M_combIdS.getItems().add(rst.getString("ID_SEMESTRE"));
    	}
    	Statement st1 = null;
    	ResultSet rst1 = null;
    	st1=base.getConnection().createStatement();
    	rst1=st1.executeQuery("SELECT * FROM gestion_note1.professeur;");
    	while(rst1.next()) {
    		comb_cinpm.getItems().add(rst1.getString("ID_PROFESSEUR"));
    	}
    	st = null;
    	rst = null;
    	st=base.getConnection().createStatement();
    	rst=st.executeQuery("SELECT * FROM gestion_note1.matiere;");
    	while(rst.next()) {
    		comb_idmp.getItems().add(rst.getString("ID_MATIERE"));
    	}
    	st = null;
    	rst = null;
    	st=base.getConnection().createStatement();
    	rst=st.executeQuery("SELECT * FROM gestion_note1.responsable;");
    	while(rst.next()) {
    		F_idRes.getItems().add(rst.getString("ID_RESPONSABLE"));
    	}
    	
    	CNE_Col.setCellValueFactory(new PropertyValueFactory<etudiant,String>("CNE"));
   	 Nom_Col.setCellValueFactory(new PropertyValueFactory<etudiant,String>("nom"));
   	 Pren_Col.setCellValueFactory(new PropertyValueFactory<etudiant,String>("prenom"));
   	 Filiere_col.setCellValueFactory(new PropertyValueFactory<etudiant,String>("filiere"));
   	CNE_Col1.setCellValueFactory(new PropertyValueFactory<etudiant,String>("CNE"));
  	 Nom_Col1.setCellValueFactory(new PropertyValueFactory<etudiant,String>("nom"));
  	 Pren_Col1.setCellValueFactory(new PropertyValueFactory<etudiant,String>("prenom"));
  	 Filiere_col1.setCellValueFactory(new PropertyValueFactory<etudiant,String>("filiere"));
  	 col_cinP.setCellValueFactory(new PropertyValueFactory<professeur,String>("cin"));
  	 col_NomP.setCellValueFactory(new PropertyValueFactory<professeur,String>("nom"));
  	 col_prenomP.setCellValueFactory(new PropertyValueFactory<professeur,String>("prenom"));
  	 col_CINPM.setCellValueFactory(new PropertyValueFactory<matiereProf,String>("cin"));
  	 col_MatiereM.setCellValueFactory(new PropertyValueFactory<matiereProf,String>("matiere"));
  	col_FilierePM.setCellValueFactory(new PropertyValueFactory<matiereProf,String>("filiere"));
  	 col_cinP1.setCellValueFactory(new PropertyValueFactory<professeur,String>("cin"));
  	 col_NomP1.setCellValueFactory(new PropertyValueFactory<professeur,String>("nom"));
  	 col_prenomP1.setCellValueFactory(new PropertyValueFactory<professeur,String>("prenom"));
  	M_colidF.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_filiere"));
  	M_colidM.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_matiere"));
  	M_colidS.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_semestre"));
  	Mcol_nomM.setCellValueFactory(new PropertyValueFactory<matiere,String>("nom_matiere"));
  	M_colidF1.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_filiere"));
  	M_colidM1.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_matiere"));
  	M_colidS1.setCellValueFactory(new PropertyValueFactory<matiere,String>("id_semestre"));
  	Mcol_nomM1.setCellValueFactory(new PropertyValueFactory<matiere,String>("nom_matiere"));
  	F_idFiliere.setCellValueFactory(new PropertyValueFactory<Filiere,String>("id_filiere"));
  	F_idResponsable.setCellValueFactory(new PropertyValueFactory<Filiere,String>("id_responsable"));
  	F_nomFiliere.setCellValueFactory(new PropertyValueFactory<Filiere,String>("nom_filiere"));
  	col_id_f.setCellValueFactory(new PropertyValueFactory<AffFiliere,String>("id_filiere"));
  	col_nom_filiere.setCellValueFactory(new PropertyValueFactory<AffFiliere,String>("nom_filiere"));
 
    }
    
    @FXML
    void invisible(MouseEvent event) {
         pane_etud.setVisible(false);
         tableEtude.getItems().clear();
         pane_listEtud.setVisible(false);
         tableEtude1.getItems().clear();
         paneajoutP.setVisible(false);
         tableProf.getItems().clear();
         paneMprof.setVisible(false);
         tableMPF.getItems().clear();
         panelistprof.setVisible(false);
         tableProf1.getItems().clear();
         paneMatiere.setVisible(false);
         tableMatiere.getItems().clear();
         paneAffMatiere.setVisible(false);
         tableMatiere1.getItems().clear();
         paneFiliere.setVisible(false);
         tableFiliere.getItems().clear();
         paneAffFiliere.setVisible(false);
         tableaffFiliere.getItems().clear();
        
         
        
         
    }
    @FXML
    void selection(MouseEvent event) {
    	int i=tableEtude.getSelectionModel().getSelectedIndex();
    	int j=tableMPF.getSelectionModel().getSelectedIndex();
    	
      	 if(i>=0) {
      		 etudiant c=tableEtude.getItems().get(i);
      		 id_etud.setText(c.getCNE());
      		 prenom_etud.setText(c.getPrenom());
      		 nom_etud.setText(c.getNom());
      		 Filiere_comb.setValue(c.getFiliere());
      		
      	 }
      	 if(j>=0) {
           matiereProf prof=tableMPF.getItems().get(j);
    		
    		comb_cinpm.setValue(prof.getCin());
    		comb_Fpm.setValue(prof.getFiliere());
    		comb_idmp.setValue(prof.getMatiere());
      	 }
    }

    @FXML
    void modifierEtudiant(ActionEvent event) throws SQLException {
    	int i=tableEtude.getSelectionModel().getSelectedIndex();
     	 etudiant c=tableEtude.getItems().get(i);
     	 if(i>=0) {
     		 //ID_ETUDIANT,ID_FILIERE,NOM_ETUDIANT,PRENOM_ETUDIANT
     		PreparedStatement ps4=null;
     		String queryLL="DELETE FROM `gestion_note1`.`etudiant` WHERE (`ID_ETUDIANT`"
					+ " = '"+c.getCNE()+"')";
           	ps4=base.getConnection().prepareStatement(queryLL);
       		ps4.execute();
       		
       		PreparedStatement ps5=null;
       		tableEtude.getItems().remove(i);
       	    
        	
        	if(!id_etud.getText().equals(null)&&!nom_etud.getText().equals(null)&&Filiere_comb.getValue()!=null) {
        		tableEtude.getItems().add(new etudiant(nom_etud.getText(), prenom_etud.getText(),id_etud.getText(),Filiere_comb.getValue()));
        		 String query11="INSERT INTO gestion_note1.etudiant(ID_ETUDIANT,ID_FILIERE,NOM_ETUDIANT,PRENOM_ETUDIANT)VALUES(?,?,?,?);";
        	    	ps5=base.getConnection().prepareStatement(query11);
        		ps5.setString(1, id_etud.getText());
        		ps5.setString(2,Filiere_comb.getValue());
        		ps5.setString(3, nom_etud.getText());
        		ps5.setString(4,prenom_etud.getText());
        		if(ps5.executeUpdate()!=1) {
        			Alert erreur=new Alert(Alert.AlertType.ERROR);
    				erreur.setTitle("Error");
    				erreur.setContentText("L'etudiant existe");
    				erreur.show();
        		}
        		else {
        			tableEtude.getItems().add(new etudiant(nom_etud.getText(), prenom_etud.getText(),id_etud.getText(),Filiere_comb.getValue()));
            		nom_etud.setText(null);
            		prenom_etud.setText(null);
            		id_etud.setText(null);
            		Filiere_comb.setValue(null);
        		}
        		
        		
        		
        	}
        	else {
        		Alert erreur=new Alert(Alert.AlertType.ERROR);
    			erreur.setTitle("Error");
    			erreur.setContentText("Remplissez tous les donn�es de l'etudiant");
    			erreur.show();
        	}
       		
     	 }
        
    }
    @FXML
    void AjouterEtudiant(ActionEvent event) throws SQLException {
    	PreparedStatement ps5=null;
    	
    
    	
    	if(!id_etud.getText().equals(null)&&!nom_etud.getText().equals(null)&&Filiere_comb.getValue()!=null) {
    		
    		 String query11="INSERT INTO gestion_note1.etudiant(ID_ETUDIANT,ID_FILIERE,NOM_ETUDIANT,PRENOM_ETUDIANT)VALUES(?,?,?,?);";
    	    	ps5=base.getConnection().prepareStatement(query11);
    		ps5.setString(1, id_etud.getText());
    		ps5.setString(2,Filiere_comb.getValue());
    		ps5.setString(3, nom_etud.getText());
    		ps5.setString(4,prenom_etud.getText());
    		ps5.executeUpdate();
    	
    			tableEtude.getItems().add(new etudiant(nom_etud.getText(), prenom_etud.getText(),id_etud.getText(),Filiere_comb.getValue()));
        		
        		ps5=null;
        		 String query12="INSERT INTO gestion_note1.etudiant_semstre(ID_ETUDIANT,ID_SEMESTRE)VALUES(?,?);";
     	    	ps5=base.getConnection().prepareStatement(query12);
     		ps5.setString(1, id_etud.getText());
     		ps5.setString(2,"Semestre1");
     		ps5.executeUpdate();
     		ps5=null;
     		 query12="INSERT INTO gestion_note1.etudiant_semstre(ID_ETUDIANT,ID_SEMESTRE)VALUES(?,?);";
  	    	ps5=base.getConnection().prepareStatement(query12);
  		ps5.setString(1, id_etud.getText());
  		ps5.setString(2,"Semestre2");
  		ps5.executeUpdate();
  		
		ArrayList<String>matiere=new ArrayList<String>();
		Statement st1= null;
     	ResultSet rst1 = null;
		 String query="SELECT * FROM gestion_note1.semestre_t"
		 		+ " WHERE ID_SEMESTRE='Semestre1' and  ID_FILIERE= '"+Filiere_comb.getValue()+"'"
		 		
		 				
		 				+ "UNION"+ "  SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE='Semestre2' and ID_FILIERE= '"+Filiere_comb.getValue()+"';";
		 st1=base.getConnection().createStatement();
      	rst1=st1.executeQuery(query);
      	
      	while(rst1.next()) {
				matiere.add(rst1.getString("ID_MATIERE"));
				
      	}
      	String  query13="INSERT INTO gestion_note1.etudiant_matiere(ID_MATIERE,ID_ETUDIANT)VALUES(?,?);";
	    	ps5=base.getConnection().prepareStatement(query13);
		
		
		int i=0;
		while(i<matiere.size()) {
			
		
			ps5.setString(1,matiere.get(i));
			
			ps5.setString(2, id_etud.getText());
			ps5.executeUpdate();
			i++;
			
		};
		
      	

			

           
    		
    	}
    	else {
    		Alert erreur=new Alert(Alert.AlertType.ERROR);
			erreur.setTitle("Error");
			erreur.setContentText("Remplissez tous les donnees de l'etudiant");
			erreur.show();
    	}
    	nom_etud.setText(null);
		prenom_etud.setText(null);
		id_etud.setText(null);
		Filiere_comb.setValue(null);
        
    }
    @FXML
    void afficherlistEtudiant(MouseEvent event) throws SQLException {
              if(comb_Filiere.getValue()!=null&&comb_Semstre.getValue()!=null) {
            	  String query2="SELECT * FROM gestion_note1.etudiant_semstre s,gestion_note1.etudiant e WHERE e.ID_ETUDIANT=s.ID_ETUDIANT"
            	  		+ " and e.ID_FILIERE='"+comb_Filiere.getValue()+"'and  s.ID_SEMESTRE='"+comb_Semstre.getValue()+"';";
            		 Statement st1= null;
                  	ResultSet rst1 = null;
                  	st1=base.getConnection().createStatement();
                  	rst1=st1.executeQuery(query2);
                  String id_etudiant=null,nom=null,prenom=null;
                  	while(rst1.next()) {
     						id_etudiant=rst1.getString("ID_ETUDIANT");
     						nom=rst1.getString("NOM_ETUDIANT");
     						prenom=rst1.getString("PRENOM_ETUDIANT");
     						
     						tableEtude1.getItems().add(new etudiant(nom,prenom,id_etudiant,comb_Filiere.getValue()));
                  	}
              }
    }
    @FXML
    void ModifierProfesseur(ActionEvent event) {
    	
    }
    @FXML
    void AjoutProfesseur(ActionEvent event) throws SQLException {	
    	PreparedStatement ps5=null;
         if(
        		 !txt_cinProf.getText().equals(null)&&
        		 !txt_NomProf.getText().equals(null)&&
        		 !txt_prenProf.getText().equals(null)) {
        	 tableProf.getItems().add(new professeur(txt_NomProf.getText(),txt_prenProf.getText(),txt_cinProf.getText()));
    		 String query11="INSERT INTO gestion_note1.professeur(ID_PROFESSEUR,NOM,PRENOM)VALUES(?,?,?);";
    	    	ps5=base.getConnection().prepareStatement(query11);
    		ps5.setString(1, txt_cinProf.getText());
    		ps5.setString(2, txt_NomProf.getText());
    		ps5.setString(3,txt_prenProf.getText());
    		ps5.executeUpdate();
        	 
         }
         else {
        	 Alert erreur=new Alert(Alert.AlertType.ERROR);
 			erreur.setTitle("Error");
 			erreur.setContentText("Remplissez tous les donn�es de le professeur");
 			erreur.show();
 
         }
    	   
         }
    @FXML
    void modifierProfMatiere(ActionEvent event) throws SQLException {
    	PreparedStatement ps5=null;
    	int i=tableMPF.getSelectionModel().getSelectedIndex();
    	if(i>=0) {
    		matiereProf prof=tableMPF.getItems().get(i);
    		PreparedStatement ps4=null;
     		String queryLL="DELETE FROM `gestion_note1`.`professeur_matiere` WHERE (`ID_PROFESSEUR`"
					+ " = '"+prof.getCin()+"'and NOM_MATIERE='"+prof.getMatiere()+"'and ID_FILIERE='"+prof.getFiliere()+"')";
           	ps4=base.getConnection().prepareStatement(queryLL);
       		ps4.execute();
       		tableMPF.getItems().remove(i);
       	 if(comb_cinpm.getValue()!=null&&comb_idmp.getValue()!=null&&comb_Fpm.getValue()!=null) {
        	 String query11="INSERT INTO gestion_note1.professeur_matiere(ID_PROFESSEUR,NOM_MATIERE,ID_FILIERE)VALUES(?,?,?);";
 	    	ps5=base.getConnection().prepareStatement(query11);
 	    	ps5.setString(1,comb_cinpm.getValue());
 	    	ps5.setString(2,comb_idmp.getValue());
 	    	ps5.setString(3,comb_Fpm.getValue());
 	    	ps5.executeUpdate();
 	    	 tableMPF.getItems().add(new matiereProf(comb_cinpm.getValue(),comb_idmp.getValue(),comb_Fpm.getValue()));
 	    	comb_idmp.setValue(null);
	    	 comb_cinpm.setValue(null);
	    	 comb_Fpm.setValue(null);
        }
        else {
        	 Alert erreur=new Alert(Alert.AlertType.ERROR);
  			erreur.setTitle("Error");
  			erreur.setContentText("Remplissez tous les donnees");
  			erreur.show();
        }
       		
    	}
    }
    @FXML
    void ajoutermatiereProf(ActionEvent event) throws SQLException {
    	PreparedStatement ps5=null;
                if(comb_cinpm.getValue()!=null&&comb_idmp.getValue()!=null) {
                	 String query11="INSERT INTO gestion_note1.matiere_professeur(ID_PROFESSEUR,ID_FILIERE,ID_MATIERE)VALUES(?,?,?);";
         	    	ps5=base.getConnection().prepareStatement(query11);
         	    	ps5.setString(1,comb_cinpm.getValue());
         	    	ps5.setString(3,comb_idmp.getValue());
         	    	ps5.setString(2,comb_Fpm.getValue());
         	    	
         	    	
         	    	ps5.executeUpdate();
         	    	 tableMPF.getItems().add(new matiereProf(comb_cinpm.getValue(),comb_idmp.getValue(),comb_Fpm.getValue()));
         	    	 comb_idmp.setValue(null);
         	    	 comb_cinpm.setValue(null);
         	    	 comb_Fpm.setValue(null);
         	    	 
                }
                else {
                	 Alert erreur=new Alert(Alert.AlertType.ERROR);
          			erreur.setTitle("Error");
          			erreur.setContentText("Remplissez tous les donnees");
          			erreur.show();
                }
    }

    @FXML
    void affProfesseur(ActionEvent event) throws SQLException {
    	 Statement st1= null;
       	ResultSet rst1 = null;
       	st1=base.getConnection().createStatement();
       	rst1=st1.executeQuery("SELECT * FROM gestion_note1.professeur;");
       String id_prof=null,nom=null,prenom=null;
       	while(rst1.next()) {
					id_prof=rst1.getString("ID_PROFESSEUR");
					nom=rst1.getString("NOM");
					prenom=rst1.getString("PRENOM");
					
					tableProf1.getItems().add(new professeur(nom,prenom,id_prof));
    }

}
    @FXML
    void AjouterMatiere(ActionEvent event) throws SQLException {
    	int i=0;
                  if(M_combIdF1.getValue()!=null&&M_combIdS.getValue()!=null&&!M_IdMatiere.getText().equals(null)&&!M_NamMatiere.getText().equals(null)) {
                	String q="SELECT * FROM gestion_note1.semestre_t WHERE ID_FILIERE='"+M_combIdF1.getValue()+"' and ID_SEMESTRE='"+M_combIdS.getValue()+"'";
                	 Statement st1= null;
                    	ResultSet rst1 = null; 
                    	st1=base.getConnection().createStatement();
                    	rst1=st1.executeQuery(q);
                    	while(rst1.next()) {
                    		i+=1;
                    	}
                    	System.out.print(i);
                	if((i<=6&&(M_combIdS.getValue()!="Semestre1"||M_combIdS.getValue()!="Semestre2")||(i<=7&&(M_combIdS.getValue()=="Semestre1"||M_combIdS.getValue()=="Semestre2")))) {
                		  PreparedStatement ps5=null;
                    	  String query11="INSERT INTO gestion_note1.matiere(ID_MATIERE,NOM_MATIERE)VALUES(?,?);";
                    	  ps5=base.getConnection().prepareStatement(query11);
                    	  ps5.setString(1, M_IdMatiere.getText());
                    	  ps5.setString(2, M_NamMatiere.getText());
                    	  ps5.executeUpdate(); 
                    	  PreparedStatement ps6=null;
                    	  String query12="INSERT INTO gestion_note1.semestre_t(ID_MATIERE,ID_SEMESTRE,ID_FILIERE)VALUES(?,?,?);";
                    	  ps6=base.getConnection().prepareStatement(query12);
                    	  ps6.setString(1, M_IdMatiere.getText());
                    	  ps6.setString(2, M_combIdS.getValue());
                    	  ps6.setString(3,M_combIdF1.getValue());
                    	  ps6.executeUpdate();
                    	  tableMatiere.getItems().add(new matiere(M_IdMatiere.getText(), M_NamMatiere.getText(),  M_combIdS.getValue(), M_combIdF1.getValue()));
                    	  M_IdMatiere.setText(null);
                    	  M_NamMatiere.setText(null);
                    	  M_combIdS.setValue(null);
                    	  M_combIdF1.setValue(null);
                	  }
                	else {
                		 Alert erreur=new Alert(Alert.AlertType.ERROR);
               			erreur.setTitle("Error");
               			erreur.setContentText("Le matiere de semestre est totale");
               			erreur.show();
                	}
                	  
                	  
                  }
                  else {
                	  Alert erreur=new Alert(Alert.AlertType.ERROR);
            			erreur.setTitle("Error");
            			erreur.setContentText("Remplissez tous les donnees");
            			erreur.show();  
                  }
    }

    @FXML
    void ModifiMatiere(ActionEvent event) {

    }
    @FXML
    void btnaffMatiere(ActionEvent event) throws SQLException {
    	 Statement st1= null;
        	ResultSet rst1 = null;
        	st1=base.getConnection().createStatement();
        	rst1=st1.executeQuery("SELECT * FROM gestion_note1.semestre_t;");
        String id_matiere=null,id_filiere=null,id_semestre=null;
        	while(rst1.next()) {
 					id_matiere=rst1.getString("ID_MATIERE");
 					id_filiere=rst1.getString("ID_FILIERE");
 					id_semestre=rst1.getString("ID_SEMESTRE");
 					
 					tableMatiere1.getItems().add(new matiere(id_matiere,id_matiere,id_semestre,id_filiere));
     }

    }


    @FXML
    void AjoutFiliere(ActionEvent event) throws SQLException {
    	PreparedStatement ps5=null;
        if(F_idRes.getValue()!=null&&!F_idFiliere1.getText().equals(null)&&!F_NomFiliere.getText().equals(null)) {
        	 String query11="INSERT INTO gestion_note1.filiere(NOM_FILIERE,ID_FILIERE,ID_RESPONSABLE)VALUES(?,?,?);";
 	    	ps5=base.getConnection().prepareStatement(query11);
 	    	ps5.setString(2,F_idFiliere1.getText());
 	    	ps5.setString(1,F_NomFiliere.getText());
 	    	ps5.setString(3,F_idRes.getValue());
 	    	
 	    	ps5.executeUpdate();
 	    	tableFiliere.getItems().add(new Filiere(F_idFiliere1.getText(), F_NomFiliere.getText(), F_idRes.getValue()));
        }
        else {
       	 Alert erreur=new Alert(Alert.AlertType.ERROR);
 			erreur.setTitle("Error");
 			erreur.setContentText("Remplissez tous les donnees");
 			erreur.show();
       }
    }
    @FXML
    void AjoutMFiliere(ActionEvent event) {
            paneFiliere.setVisible(true);
    }
    @FXML
    void retour(ActionEvent event) {
          Main m=new Main();
          m.start(new Stage());
          btnRetour.getScene().getWindow().hide();
    }

    @FXML
    void btnaffFiliere(ActionEvent event) throws SQLException {
    	 Statement st1= null;
     	ResultSet rst1 = null;
     	st1=base.getConnection().createStatement();
     	rst1=st1.executeQuery("SELECT * FROM gestion_note1.filiere;");
     	String id,nom=null;
     	while(rst1.next()) {
     		id=rst1.getString("ID_FILIERE");
     		nom=rst1.getString("NOM_FILIERE");
     		tableaffFiliere.getItems().add(new AffFiliere(id, nom));
     	}
    }
  

}
