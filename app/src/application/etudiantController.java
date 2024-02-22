package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class etudiantController {
     private static final Label Matiere7_s6 = null;

	public void LabelNote(Label l,Label n,HashMap<String,String>m,HashMap<String,Float>m1) {
    	 String v=m.get(l.getText());
    	 Set<Entry<String,Float>> e=m1.entrySet();
    	 Iterator<Entry<String, Float>> iter=e.iterator();
    	float N;
    	 while(iter.hasNext()) {
    		 Map.Entry<String, Float> s=iter.next();
    		 if(s.getKey().equals(v)) {
    			 N=s.getValue();
    			 if(N>0)
    			 n.setText(Float.toString(N));
    			 else
    				 n.setText("aucun note");
    			 break;
    		 }
    		 
    	 }
     }

    @FXML
    private Button btnRetour;
    @FXML
    private Label Matiere1_s1;
    
    @FXML
    private Label Matiere1_s2;

    @FXML
    private Label Matiere1_s3;

    @FXML
    private Label Matiere1_s4;

    @FXML
    private Label Matiere1_s5;

    @FXML
    private Label Matiere1_s6;

    @FXML
    private Label Matiere2_s1;

    @FXML
    private Label Matiere2_s2;

    @FXML
    private Label Matiere2_s3;

    @FXML
    private Label Matiere2_s4;

    @FXML
    private Label Matiere2_s5;

    @FXML
    private Label Matiere2_s6;
    @FXML
    private Label Matiere7_s2;
    @FXML
    private Label Matiere7_s1;

    @FXML
    private Label Matiere3_s1;

    @FXML
    private Label Matiere3_s2;
    @FXML
    private Label Matiere3_s5;

    @FXML
    private Label Matiere3_s3;

    @FXML
    private Label Matiere3_s4;

    @FXML
    private Label Matiere3_s6;

    @FXML
    private Label Matiere4_s1;

    @FXML
    private Label Matiere4_s2;

    @FXML
    private Label Matiere4_s3;

    @FXML
    private Label Matiere4_s4;

    @FXML
    private Label Matiere4_s5;

    @FXML
    private Label Matiere4_s6;

    @FXML
    private Label Matiere5_s1;

    @FXML
    private Label Matiere5_s2;

    @FXML
    private Label Matiere5_s3;

    @FXML
    private Label Matiere5_s4;

    @FXML
    private Label Matiere5_s5;

    @FXML
    private Label Matiere5_s6;

    @FXML
    private Label Matiere6_s1;

    @FXML
    private Label Matiere6_s2;

    @FXML
    private Label Matiere6_s3;

    @FXML
    private Label Matiere6_s4;

    @FXML
    private Label Matiere6_s5;

    @FXML
    private Label Matiere6_s6;

    @FXML
    private Label Note1_s1;

    @FXML
    private Label Note1_s3;

    @FXML
    private Label Note1_s4;

    @FXML
    private Label Note1_s5;

    @FXML
    private Label Note1_s6;

    @FXML
    private Label Note2_s1;

    @FXML
    private Label Note2_s2;

    @FXML
    private Label Note2_s3;

    @FXML
    private Label Note2_s4;

    @FXML
    private Label Note2_s5;

    @FXML
    private Label Note2_s6;

    @FXML
    private Label Note3_s1;

    @FXML
    private Label Note3_s2;

    @FXML
    private Label Note3_s3;

    @FXML
    private Label Note3_s4;
    
    @FXML
    private Label Note7_s1;
    
    @FXML
    private Label Note7_s2;

    @FXML
    private Label Note3_s5;

    @FXML
    private Label Note3_s6;

    @FXML
    private Label Note4_s1;
    
    @FXML
    private Label Note1_s2;

    @FXML
    private Label Note4_s2;

    @FXML
    private Label Note4_s3;

    @FXML
    private Label Note4_s4;

    @FXML
    private Label Note4_s5;

    @FXML
    private Label Note4_s6;

    @FXML
    private Label Note5_s1;

    @FXML
    private Label Note5_s2;

    @FXML
    private Label Note5_s3;

    @FXML
    private Label Note5_s4;

    @FXML
    private Label Note5_s5;

    @FXML
    private Label Note5_s6;

    @FXML
    private Label Note6_s1;

    @FXML
    private Label Note6_s2;

    @FXML
    private Label Note6_s3;

    @FXML
    private Label Note6_s4;

    @FXML
    private Label Note6_s5;

    @FXML
    private Label Note6_s6;

    @FXML
    private Label S1;

    @FXML
    private Label S2;

    @FXML
    private Label S4;

    @FXML
    private Label S5;

    @FXML
    private Label S6;

    @FXML
    private Label S_3;

    @FXML
    private VBox Semestre1;

    @FXML
    private VBox Semestre2;

    @FXML
    private VBox Semestre3;

    @FXML
    private VBox Semestre4;

    @FXML
    private VBox Semestre5;

    @FXML
    private VBox Semestre6;

    @FXML
    void visible_2(MouseEvent event) throws SQLException {
                Semestre1.setVisible(false);
                Semestre2.setVisible(true);
                Semestre3.setVisible(false);
                Semestre4.setVisible(false);
                Semestre5.setVisible(false);
                Semestre6.setVisible(false);
                PreparedStatement ps=null ;
                ResultSet rs = null;
       		 PreparedStatement ps1=null ;
        		ResultSet rs1 = null;
       		String m[]=new String[8];
       		HashMap<String,String>m1=new HashMap<String,String>();
       		HashMap<String,Float>N=new HashMap<String,Float>();
       		int i=0;
       		String filiere=null;
       		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
       		 ps=base.getConnection().prepareStatement(query);
       		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
       		 ps1=base.getConnection().prepareStatement(q);
       		 ps1.setString(1, SampleController.id_etudiant);
       		 rs1=ps1.executeQuery();
       		 while(rs1.next()) {
       			 filiere=rs1.getString("ID_FILIERE");
       		 }
       		 ps.setString(1, "Semestre2");
       		 ps.setString(2,filiere);
       		 rs=ps.executeQuery();
       		 PreparedStatement ps2=null ;
                ResultSet rs2 = null;
                String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
       		String Mat1,Mat2;
       		 while(rs.next()) {
       			 Mat1=rs.getString("ID_MATIERE");
       			 
       			 ps2=base.getConnection().prepareStatement(q1);
       			 ps2.setString(1,Mat1);
       			 rs2=ps2.executeQuery();
       			
       			 if(rs2.next()) {
       				 Mat2=rs2.getString("NOM_MATIERE");
       				 m[i]=Mat2;
       				 m1.put(Mat2, Mat1);	 
       			 }
       			
       			 
       			 i++;
       		 }
       		 String q2=null;
       		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
       		 PreparedStatement pL=null ;
                ResultSet rL = null;
                pL=base.getConnection().prepareStatement(q2);
                pL.setString(1, SampleController.id_etudiant);
                rL=pL.executeQuery();
                while(rL.next()) {
               	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
               	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
                }
                
       		 Matiere1_s2.setText(m[0]);
       		 Matiere2_s2.setText(m[1]);
       		 Matiere3_s2.setText(m[2]);
       		 Matiere4_s2.setText(m[3]);
       		 Matiere5_s2.setText(m[4]);
       		 Matiere6_s2.setText(m[5]);
       		 Matiere7_s2.setText(m[6]);
       		 LabelNote(Matiere1_s2,Note1_s2,m1,N);
       		 LabelNote(Matiere2_s2,Note2_s2,m1,N);
       		 LabelNote(Matiere3_s2,Note3_s2,m1,N);
       		 LabelNote(Matiere4_s2,Note4_s2,m1,N);
       		 LabelNote(Matiere5_s2,Note5_s2,m1,N);
       		 LabelNote(Matiere6_s2,Note6_s2,m1,N);
       		 LabelNote(Matiere7_s2,Note7_s2,m1,N);
        		 
        		
    }

    @FXML
    void visible_3(MouseEvent event) throws SQLException {
    	 Semestre1.setVisible(false);
         Semestre2.setVisible(false);
         Semestre3.setVisible(true);
         Semestre4.setVisible(false);
         Semestre5.setVisible(false);
         Semestre6.setVisible(false);
         PreparedStatement ps=null ;
         ResultSet rs = null;
		 PreparedStatement ps1=null ;
 		ResultSet rs1 = null;
		String m[]=new String[8];
		HashMap<String,String>m1=new HashMap<String,String>();
		HashMap<String,Float>N=new HashMap<String,Float>();
		int i=0;
		String filiere=null;
		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
		 ps=base.getConnection().prepareStatement(query);
		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
		 ps1=base.getConnection().prepareStatement(q);
		 ps1.setString(1, SampleController.id_etudiant);
		 rs1=ps1.executeQuery();
		 while(rs1.next()) {
			 filiere=rs1.getString("ID_FILIERE");
		 }
		 ps.setString(1, "Semestre3");
		 ps.setString(2,filiere);
		 rs=ps.executeQuery();
		 PreparedStatement ps2=null ;
         ResultSet rs2 = null;
         String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
		String Mat1,Mat2;
		 while(rs.next()) {
			 Mat1=rs.getString("ID_MATIERE");
			 
			 ps2=base.getConnection().prepareStatement(q1);
			 ps2.setString(1,Mat1);
			 rs2=ps2.executeQuery();
			
			 if(rs2.next()) {
				 Mat2=rs2.getString("NOM_MATIERE");
				 m[i]=Mat2;
				 m1.put(Mat2, Mat1);	 
			 }
			
			 
			 i++;
		 }
		 String q2=null;
		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
		 PreparedStatement pL=null ;
         ResultSet rL = null;
         pL=base.getConnection().prepareStatement(q2);
         pL.setString(1, SampleController.id_etudiant);
         rL=pL.executeQuery();
         while(rL.next()) {
        	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
        	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
         }
         
		 Matiere1_s3.setText(m[0]);
		 Matiere2_s3.setText(m[1]);
		 Matiere3_s3.setText(m[2]);
		 Matiere4_s3.setText(m[3]);
		 Matiere5_s3.setText(m[4]);
		 Matiere6_s3.setText(m[5]);
		
		 LabelNote(Matiere1_s3,Note1_s3,m1,N);
		 LabelNote(Matiere2_s3,Note2_s3,m1,N);
		 LabelNote(Matiere3_s3,Note3_s3,m1,N);
		 LabelNote(Matiere4_s3,Note4_s3,m1,N);
		 LabelNote(Matiere5_s3,Note5_s3,m1,N);
		 LabelNote(Matiere6_s3,Note6_s3,m1,N);
		
		
    }

    @FXML
    void visible_4(MouseEvent event) throws SQLException {
    	 Semestre1.setVisible(false);
         Semestre2.setVisible(false);
         Semestre3.setVisible(false);
         Semestre4.setVisible(true);
         Semestre5.setVisible(false);
         Semestre6.setVisible(false);
         PreparedStatement ps=null ;
         ResultSet rs = null;
		 PreparedStatement ps1=null ;
 		ResultSet rs1 = null;
		String m[]=new String[8];
		HashMap<String,String>m1=new HashMap<String,String>();
		HashMap<String,Float>N=new HashMap<String,Float>();
		int i=0;
		String filiere=null;
		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
		 ps=base.getConnection().prepareStatement(query);
		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
		 ps1=base.getConnection().prepareStatement(q);
		 ps1.setString(1, SampleController.id_etudiant);
		 rs1=ps1.executeQuery();
		 while(rs1.next()) {
			 filiere=rs1.getString("ID_FILIERE");
		 }
		 ps.setString(1, "Semestre4");
		 ps.setString(2,filiere);
		 rs=ps.executeQuery();
		 PreparedStatement ps2=null ;
         ResultSet rs2 = null;
         String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
		String Mat1,Mat2;
		 while(rs.next()) {
			 Mat1=rs.getString("ID_MATIERE");
			 
			 ps2=base.getConnection().prepareStatement(q1);
			 ps2.setString(1,Mat1);
			 rs2=ps2.executeQuery();
			
			 if(rs2.next()) {
				 Mat2=rs2.getString("NOM_MATIERE");
				 m[i]=Mat2;
				 m1.put(Mat2, Mat1);	 
			 }
			
			 
			 i++;
		 }
		 String q2=null;
		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
		 PreparedStatement pL=null ;
         ResultSet rL = null;
         pL=base.getConnection().prepareStatement(q2);
         pL.setString(1, SampleController.id_etudiant);
         rL=pL.executeQuery();
         while(rL.next()) {
        	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
        	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
         }
         
		 Matiere1_s4.setText(m[0]);
		 Matiere2_s4.setText(m[1]);
		 Matiere3_s4.setText(m[2]);
		 Matiere4_s4.setText(m[3]);
		 Matiere5_s4.setText(m[4]);
		 Matiere6_s4.setText(m[5]);
		
		 LabelNote(Matiere1_s4,Note1_s4,m1,N);
		 LabelNote(Matiere2_s4,Note2_s4,m1,N);
		 LabelNote(Matiere3_s4,Note3_s4,m1,N);
		 LabelNote(Matiere4_s4,Note4_s4,m1,N);
		 LabelNote(Matiere5_s4,Note5_s4,m1,N);
		 LabelNote(Matiere6_s4,Note6_s4,m1,N);
		
    }

    @FXML
    void visible_5(MouseEvent event) throws SQLException {
    	 Semestre1.setVisible(false);
         Semestre2.setVisible(false);
         Semestre3.setVisible(false);
         Semestre4.setVisible(false);
         Semestre5.setVisible(true);
         Semestre6.setVisible(false);
         PreparedStatement ps=null ;
         ResultSet rs = null;
		 PreparedStatement ps1=null ;
 		ResultSet rs1 = null;
		String m[]=new String[8];
		HashMap<String,String>m1=new HashMap<String,String>();
		HashMap<String,Float>N=new HashMap<String,Float>();
		int i=0;
		String filiere=null;
		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
		 ps=base.getConnection().prepareStatement(query);
		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
		 ps1=base.getConnection().prepareStatement(q);
		 ps1.setString(1, SampleController.id_etudiant);
		 rs1=ps1.executeQuery();
		 while(rs1.next()) {
			 filiere=rs1.getString("ID_FILIERE");
		 }
		 ps.setString(1, "Semestre5");
		 ps.setString(2,filiere);
		 rs=ps.executeQuery();
		 PreparedStatement ps2=null ;
         ResultSet rs2 = null;
         String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
		String Mat1,Mat2;
		 while(rs.next()) {
			 Mat1=rs.getString("ID_MATIERE");
			 
			 ps2=base.getConnection().prepareStatement(q1);
			 ps2.setString(1,Mat1);
			 rs2=ps2.executeQuery();
			
			 if(rs2.next()) {
				 Mat2=rs2.getString("NOM_MATIERE");
				 m[i]=Mat2;
				 m1.put(Mat2, Mat1);	 
			 }
			
			 
			 i++;
		 }
		 String q2=null;
		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
		 PreparedStatement pL=null ;
         ResultSet rL = null;
         pL=base.getConnection().prepareStatement(q2);
         pL.setString(1, SampleController.id_etudiant);
         rL=pL.executeQuery();
         while(rL.next()) {
        	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
        	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
         }
         
		 Matiere1_s5.setText(m[0]);
		 Matiere2_s5.setText(m[1]);
		 Matiere3_s5.setText(m[2]);
		 Matiere4_s5.setText(m[3]);
		 Matiere5_s5.setText(m[4]);
		 Matiere6_s5.setText(m[5]);
		
		 LabelNote(Matiere1_s5,Note1_s5,m1,N);
		 LabelNote(Matiere2_s5,Note2_s5,m1,N);
		 LabelNote(Matiere3_s5,Note3_s5,m1,N);
		 LabelNote(Matiere4_s5,Note4_s5,m1,N);
		 LabelNote(Matiere5_s5,Note5_s5,m1,N);
		 LabelNote(Matiere6_s5,Note6_s5,m1,N);
		
		
    }

    @FXML
    void visible_6(MouseEvent event) throws SQLException {
    	 Semestre1.setVisible(false);
         Semestre2.setVisible(false);
         Semestre3.setVisible(false);
         Semestre4.setVisible(false);
         Semestre5.setVisible(false);
         Semestre6.setVisible(true);
         PreparedStatement ps=null ;
         ResultSet rs = null;
		 PreparedStatement ps1=null ;
 		ResultSet rs1 = null;
		String m[]=new String[8];
		HashMap<String,String>m1=new HashMap<String,String>();
		HashMap<String,Float>N=new HashMap<String,Float>();
		int i=0;
		String filiere=null;
		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
		 ps=base.getConnection().prepareStatement(query);
		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
		 ps1=base.getConnection().prepareStatement(q);
		 ps1.setString(1, SampleController.id_etudiant);
		 rs1=ps1.executeQuery();
		 while(rs1.next()) {
			 filiere=rs1.getString("ID_FILIERE");
		 }
		 ps.setString(1, "Semestre6");
		 ps.setString(2,filiere);
		 rs=ps.executeQuery();
		 PreparedStatement ps2=null ;
         ResultSet rs2 = null;
         String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
		String Mat1,Mat2;
		 while(rs.next()) {
			 Mat1=rs.getString("ID_MATIERE");
			 
			 ps2=base.getConnection().prepareStatement(q1);
			 ps2.setString(1,Mat1);
			 rs2=ps2.executeQuery();
			
			 if(rs2.next()) {
				 Mat2=rs2.getString("NOM_MATIERE");
				 m[i]=Mat2;
				 m1.put(Mat2, Mat1);	 
			 }
			
			 
			 i++;
		 }
		 String q2=null;
		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
		 PreparedStatement pL=null ;
         ResultSet rL = null;
         pL=base.getConnection().prepareStatement(q2);
         pL.setString(1, SampleController.id_etudiant);
         rL=pL.executeQuery();
         while(rL.next()) {
        	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
        	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
         }
         
		 Matiere1_s6.setText(m[0]);
		 Matiere2_s6.setText(m[1]);
		 Matiere3_s6.setText(m[2]);
		 Matiere4_s6.setText(m[3]);
		 Matiere5_s6.setText(m[4]);
		 Matiere6_s6.setText(m[5]);
		 LabelNote(Matiere1_s6,Note1_s6,m1,N);
		 LabelNote(Matiere2_s6,Note2_s6,m1,N);
		 LabelNote(Matiere3_s6,Note3_s6,m1,N);
		 LabelNote(Matiere4_s6,Note4_s6,m1,N);
		 LabelNote(Matiere5_s6,Note5_s6,m1,N);
		 LabelNote(Matiere6_s6,Note6_s6,m1,N);
		
        
    }

    @FXML
    void visible_S1(MouseEvent event) throws SQLException {
    	 Semestre1.setVisible(true);
         Semestre2.setVisible(false);
         Semestre3.setVisible(false);
         Semestre4.setVisible(false);
         Semestre5.setVisible(false);
         Semestre6.setVisible(false);
         PreparedStatement ps=null ;
         ResultSet rs = null;
		 PreparedStatement ps1=null ;
 		ResultSet rs1 = null;
		String m[]=new String[8];
		HashMap<String,String>m1=new HashMap<String,String>();
		HashMap<String,Float>N=new HashMap<String,Float>();
		int i=0;
		String filiere=null;
		 String query="SELECT * FROM gestion_note1.semestre_t WHERE ID_SEMESTRE=? AND ID_FILIERE=?;";
		 ps=base.getConnection().prepareStatement(query);
		 String q="SELECT * FROM gestion_note1.etudiant WHERE ID_ETUDIANT=?";
		 ps1=base.getConnection().prepareStatement(q);
		 ps1.setString(1, SampleController.id_etudiant);
		 rs1=ps1.executeQuery();
		 while(rs1.next()) {
			 filiere=rs1.getString("ID_FILIERE");
		 }
		 ps.setString(1, "Semestre1");
		 ps.setString(2,filiere);
		 rs=ps.executeQuery();
		 PreparedStatement ps2=null ;
         ResultSet rs2 = null;
         String q1="SELECT * FROM gestion_note1.matiere WHERE ID_MATIERE=?";
		String Mat1,Mat2;
		 while(rs.next()) {
			 Mat1=rs.getString("ID_MATIERE");
			 
			 ps2=base.getConnection().prepareStatement(q1);
			 ps2.setString(1,Mat1);
			 rs2=ps2.executeQuery();
			
			 if(rs2.next()) {
				 Mat2=rs2.getString("NOM_MATIERE");
				 m[i]=Mat2;
				 m1.put(Mat2, Mat1);	 
			 }
			
			 
			 i++;
		 }
		 String q2=null;
		 q2="SELECT * FROM gestion_note1.etudiant_matiere WHERE ID_ETUDIANT=?";
		 PreparedStatement pL=null ;
         ResultSet rL = null;
         pL=base.getConnection().prepareStatement(q2);
         pL.setString(1, SampleController.id_etudiant);
         rL=pL.executeQuery();
         while(rL.next()) {
        	 N.put(rL.getString("ID_MATIERE"),rL.getFloat("NOTE"));
        	 System.out.println(rL.getFloat("NOTE")+rL.getString("ID_MATIERE"));
         }
         
		 Matiere1_s1.setText(m[0]);
		 Matiere2_s1.setText(m[1]);
		 Matiere3_s1.setText(m[2]);
		 Matiere4_s1.setText(m[3]);
		 Matiere5_s1.setText(m[4]);
		 Matiere6_s1.setText(m[5]);
		 Matiere7_s1.setText(m[6]);
		 LabelNote(Matiere1_s1,Note1_s1,m1,N);
		 LabelNote(Matiere2_s1,Note2_s1,m1,N);
		 LabelNote(Matiere3_s1,Note3_s1,m1,N);
		 LabelNote(Matiere4_s1,Note4_s1,m1,N);
		 LabelNote(Matiere5_s1,Note5_s1,m1,N);
		 LabelNote(Matiere6_s1,Note6_s1,m1,N);
		 LabelNote(Matiere7_s1,Note7_s1,m1,N);
    }
    @FXML
    void retour(ActionEvent event) {

           Main m= new Main();
           m.start(new Stage());
    	   btnRetour.getScene().getWindow().hide();
    }
}
