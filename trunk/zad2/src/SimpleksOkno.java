import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.NumberFormat;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class SimpleksOkno extends javax.swing.JFrame {
	
	int ograniczenia;
	static int produkty;
	boolean CzyMax;
	double[][] tab = new double[6][15];  // liczby(tabela x)
	double[][] tabTemp = new double [5][5];
	double[] BiAk = new double[5];
	double[] Ci = new double [5];
	double[]Zj = new double[10];
	double[]CjZj = new double[10];
	static double [] tabelaCelow = new double [8]; //liczby x1,itp. w funkcji celu
	static double [] wartosciOgraniczen = new double [5]; //liczby po <= itd.
	static byte [] znaki = new byte[5];     //0 to >=, 1 to <=, 2 to = 
	String[] opisZmiennych = new String[11];   //opis x1 x2 x3 x4...   wiersz
	String[] opisZmiennychBazowych = new String [5];   // opis tylko zmiennych bazowych kolumna
	
	
    public SimpleksOkno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

    	jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        
        
        jComboBox1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(jComboBox1.getItemCount() == 1)  CzyMax = true;  //szukamy Maxa
        		if(jComboBox1.getItemCount() == 0)  CzyMax = false;  //szukamy mina
        	}
        });
        
        
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField21 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea1.setFont(new Font("Consolas", Font.PLAIN, 13));
        btnOblicz = new javax.swing.JButton();

        
        
        jComboBox8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(jComboBox8.getSelectedIndex() == 0){
        			
        			produkty =2;
        			tabelaCelow[0]=Double.parseDouble(jTextField1.getText());
        			tabelaCelow[1]=Double.parseDouble(jTextField2.getText());
        			for(int i = produkty; i<produkty+3; i++){
        				tabelaCelow[i]=0.0;
        			}
        		}
        		if(jComboBox8.getSelectedIndex() == 1){
        			
        			produkty=3;
        			tabelaCelow[0]=Double.parseDouble(jTextField1.getText());
        			tabelaCelow[1]=Double.parseDouble(jTextField2.getText());
        			tabelaCelow[2]=Double.parseDouble(jTextField3.getText());
        			for(int i = produkty; i<produkty+3; i++){
        				tabelaCelow[i]=0.0;
        			}
        		}
        		if(jComboBox8.getSelectedIndex() == 2){
        			
        			produkty=4;

        			tabelaCelow[0]=Double.parseDouble(jTextField1.getText());
        			tabelaCelow[1]=Double.parseDouble(jTextField2.getText());
        			tabelaCelow[2]=Double.parseDouble(jTextField3.getText());
        			tabelaCelow[3]=Double.parseDouble(jTextField25.getText());
        			
        			for(int i = produkty; i<produkty+3; i++){
        				tabelaCelow[i]=0.0;
        			}
        		}
        		if(jComboBox8.getSelectedIndex() == 3){
        			
        			produkty=5;

        			tabelaCelow[0]=Double.parseDouble(jTextField1.getText());
        			tabelaCelow[1]=Double.parseDouble(jTextField2.getText());
        			tabelaCelow[2]=Double.parseDouble(jTextField3.getText());
        			tabelaCelow[3]=Double.parseDouble(jTextField25.getText());
        			tabelaCelow[4]=Double.parseDouble(jTextField24.getText());
        			for(int i = produkty; i<produkty+3; i++){
        				tabelaCelow[i]=0.0;
        			}
        		}
        	}
        });
        
        jComboBox7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		//==========================  OGRALICZENIA ======================================
        		 if (jComboBox7.getSelectedIndex() == 0){  //ilosc ograniczen =1

        			ograniczenia=1;
        			
        			wartosciOgraniczen[0]=Double.parseDouble(jTextField6.getText());
     	         	for (byte i=0; i<3; i++){
     	         		if(jComboBox2.getSelectedIndex() == i)
     	         			znaki[0]=i;
     	         	}
        			jTextField7.setVisible(false);
     	         	jTextField8.setVisible(false);
     	         	jTextField14.setVisible(false);
     	         	jTextField29.setVisible(false);
     	         	jTextField28.setVisible(false);
     	         	jTextField9.setVisible(false);
     	         	
     	         	jTextField10.setVisible(false);
     	         	jTextField11.setVisible(false);
     	         	jTextField15.setVisible(false);
     	         	jTextField31.setVisible(false);
     	         	jTextField30.setVisible(false);
     	         	jTextField12.setVisible(false);
     	         	
     	         	jTextField18.setVisible(false);
     	         	jTextField19.setVisible(false);
     	         	jTextField22.setVisible(false);
     	         	jTextField33.setVisible(false);
     	         	jTextField32.setVisible(false);
     	         	jTextField20.setVisible(false);
     	         	
     	         	jTextField21.setVisible(false);
     	         	jTextField16.setVisible(false);
     	         	jTextField23.setVisible(false);
     	         	jTextField35.setVisible(false);
     	         	jTextField34.setVisible(false);
     	         	jTextField17.setVisible(false);
     	         	
     	         	jLabel13.setVisible(false);
     	         	jLabel11.setVisible(false);
     	         	jLabel22.setVisible(false);
     	         	jLabel46.setVisible(false);
     	         	jLabel43.setVisible(false);
     	         	
     	         	jLabel16.setVisible(false);
     	         	jLabel14.setVisible(false);
     	         	jLabel24.setVisible(false);
     	         	jLabel50.setVisible(false);
     	         	jLabel47.setVisible(false);
     	         	
     	         	jLabel12.setVisible(false);
     	         	jLabel21.setVisible(false);
     	         	jLabel45.setVisible(false);
     	         	jLabel44.setVisible(false);
     	         	
     	         	jLabel15.setVisible(false);
     	         	jLabel23.setVisible(false);
     	         	jLabel49.setVisible(false);
     	         	jLabel48.setVisible(false);
     	         	
     	         	jLabel27.setVisible(false);
     	         	jLabel25.setVisible(false);
     	         	jLabel53.setVisible(false);
     	         	jLabel52.setVisible(false);
     	         	
     	         	jLabel31.setVisible(false);
     	         	jLabel32.setVisible(false);
     	         	jLabel57.setVisible(false);
     	         	jLabel56.setVisible(false);
     	         	
     	         	jLabel28.setVisible(false);
     	         	jLabel26.setVisible(false);
     	         	jLabel34.setVisible(false);
     	         	jLabel54.setVisible(false);
     	         	jLabel51.setVisible(false);
     	         	
     	         	jLabel30.setVisible(false);
     	         	jLabel29.setVisible(false);
     	         	jLabel33.setVisible(false);
     	         	jLabel58.setVisible(false);
     	         	jLabel55.setVisible(false);
     	         	
     	         	jComboBox3.setVisible(false);
     	         	jComboBox4.setVisible(false);
     	         	jComboBox5.setVisible(false);
     	         	jComboBox6.setVisible(false);
     	         	
     	         }
        		 
        		 
        		 if (jComboBox7.getSelectedIndex() == 1){  //ilosc ograniczen = 2
        			
        			 ograniczenia=2;

         			wartosciOgraniczen[0]=Double.parseDouble(jTextField6.getText());
        			wartosciOgraniczen[1]=Double.parseDouble(jTextField9.getText());
        			
        			for (byte i=0; i<3; i++){
     	         		if(jComboBox2.getSelectedIndex() == i)
     	         			znaki[0]=i;
     	         		if(jComboBox3.getSelectedIndex() == i)
     	         			znaki[1]=i;
     	         	}
      	         	jTextField7.setVisible(true);
      	         	jTextField8.setVisible(true);
      	         	jTextField14.setVisible(true);
      	         	jTextField29.setVisible(true);
      	         	jTextField28.setVisible(true);
      	         	jTextField9.setVisible(true);
      	         	
      	         	jTextField10.setVisible(false);
      	         	jTextField11.setVisible(false);
      	         	jTextField15.setVisible(false);
      	         	jTextField31.setVisible(false);
      	         	jTextField30.setVisible(false);
      	         	jTextField12.setVisible(false);
      	         	
      	         	jTextField18.setVisible(false);
      	         	jTextField19.setVisible(false);
      	         	jTextField22.setVisible(false);
      	         	jTextField33.setVisible(false);
      	         	jTextField32.setVisible(false);
      	         	jTextField20.setVisible(false);
      	         	
      	         	jTextField21.setVisible(false);
      	         	jTextField16.setVisible(false);
      	         	jTextField23.setVisible(false);
      	         	jTextField35.setVisible(false);
      	         	jTextField34.setVisible(false);
      	         	jTextField17.setVisible(false);
      	         	

     	         	jLabel12.setVisible(true);
     	         	jLabel21.setVisible(true);
     	         	jLabel45.setVisible(true);
     	         	jLabel44.setVisible(true);
     	         	
      	         	jLabel15.setVisible(false);
     	         	jLabel23.setVisible(false);
     	         	jLabel49.setVisible(false);
     	         	jLabel48.setVisible(false);
     	         	
     	         	jLabel27.setVisible(false);
     	         	jLabel25.setVisible(false);
     	         	jLabel53.setVisible(false);
     	         	jLabel52.setVisible(false);
     	         	
     	         	jLabel31.setVisible(false);
     	         	jLabel32.setVisible(false);
     	         	jLabel57.setVisible(false);
     	         	jLabel56.setVisible(false);
      	         	
      	         	jLabel13.setVisible(true);
      	         	jLabel11.setVisible(true);
      	         	jLabel22.setVisible(true);
      	         	jLabel46.setVisible(true);
      	         	jLabel43.setVisible(true);
      	         	
      	         	jLabel16.setVisible(false);
      	         	jLabel14.setVisible(false);
      	         	jLabel24.setVisible(false);
      	         	jLabel50.setVisible(false);
      	         	jLabel47.setVisible(false);
      	         	
      	         	jLabel28.setVisible(false);
      	         	jLabel26.setVisible(false);
      	         	jLabel34.setVisible(false);
      	         	jLabel54.setVisible(false);
      	         	jLabel51.setVisible(false);
      	         	
      	         	jLabel30.setVisible(false);
      	         	jLabel29.setVisible(false);
      	         	jLabel33.setVisible(false);
      	         	jLabel58.setVisible(false);
      	         	jLabel55.setVisible(false);
      	         	
      	         	jComboBox3.setVisible(true);
      	         	jComboBox4.setVisible(false);
      	         	jComboBox5.setVisible(false);
      	         	jComboBox6.setVisible(false);
      	         	
      	         }
        		 

        		 if (jComboBox7.getSelectedIndex() == 2){  //ilosc ograniczen = 3
        			 
        			ograniczenia=3;

         			wartosciOgraniczen[0]=Double.parseDouble(jTextField6.getText());
        			wartosciOgraniczen[1]=Double.parseDouble(jTextField9.getText());
        			wartosciOgraniczen[2]=Double.parseDouble(jTextField12.getText());
        			
        			for (byte i=0; i<3; i++){
     	         		if(jComboBox2.getSelectedIndex() == i)
     	         			znaki[0]=i;
     	         		if(jComboBox3.getSelectedIndex() == i)
     	         			znaki[1]=i;
     	         		if(jComboBox4.getSelectedIndex() == i)
     	         			znaki[2]=i;
     	         	}
      	         	jTextField7.setVisible(true);
      	         	jTextField8.setVisible(true);
      	         	jTextField14.setVisible(true);
      	         	jTextField29.setVisible(true);
      	         	jTextField28.setVisible(true);
      	         	jTextField9.setVisible(true);
      	         	
      	         	jTextField10.setVisible(true);
      	         	jTextField11.setVisible(true);
      	         	jTextField15.setVisible(true);
      	         	jTextField31.setVisible(true);
      	         	jTextField30.setVisible(true);
      	         	jTextField12.setVisible(true);
      	         	
      	         	jTextField18.setVisible(false);
      	         	jTextField19.setVisible(false);
      	         	jTextField22.setVisible(false);
      	         	jTextField33.setVisible(false);
      	         	jTextField32.setVisible(false);
      	         	jTextField20.setVisible(false);
      	         	
      	         	jTextField21.setVisible(false);
      	         	jTextField16.setVisible(false);
      	         	jTextField23.setVisible(false);
      	         	jTextField35.setVisible(false);
      	         	jTextField34.setVisible(false);
      	         	jTextField17.setVisible(false);
      	         	
      	         	jLabel12.setVisible(true);
     	         	jLabel21.setVisible(true);
     	         	jLabel45.setVisible(true);
     	         	jLabel44.setVisible(true);
     	         	
      	         	jLabel15.setVisible(true);
     	         	jLabel23.setVisible(true);
     	         	jLabel49.setVisible(true);
     	         	jLabel48.setVisible(true);
     	         	
      	         	jLabel27.setVisible(false);
     	         	jLabel25.setVisible(false);
     	         	jLabel53.setVisible(false);
     	         	jLabel52.setVisible(false);
     	         	
     	         	jLabel31.setVisible(false);
     	         	jLabel32.setVisible(false);
     	         	jLabel57.setVisible(false);
     	         	jLabel56.setVisible(false);
     	         	
      	         	jLabel13.setVisible(true);
      	         	jLabel11.setVisible(true);
      	         	jLabel22.setVisible(true);
      	         	jLabel46.setVisible(true);
      	         	jLabel43.setVisible(true);
      	         	
      	         	jLabel16.setVisible(true);
      	         	jLabel14.setVisible(true);
      	         	jLabel24.setVisible(true);
      	         	jLabel50.setVisible(true);
      	         	jLabel47.setVisible(true);
      	         	
      	         	jLabel28.setVisible(false);
      	         	jLabel26.setVisible(false);
      	         	jLabel34.setVisible(false);
      	         	jLabel54.setVisible(false);
      	         	jLabel51.setVisible(false);
      	         	
      	         	jLabel30.setVisible(false);
      	         	jLabel29.setVisible(false);
      	         	jLabel33.setVisible(false);
      	         	jLabel58.setVisible(false);
      	         	jLabel55.setVisible(false);
      	         	
      	         	jComboBox3.setVisible(true);
      	         	jComboBox4.setVisible(true);
      	         	jComboBox5.setVisible(false);
      	         	jComboBox6.setVisible(false);
      	         	
      	         }
        		 
        		 if (jComboBox7.getSelectedIndex() == 3){  //ilosc ograniczen = 4
        			 
        			ograniczenia=4;

         			wartosciOgraniczen[0]=Double.parseDouble(jTextField6.getText());
        			wartosciOgraniczen[1]=Double.parseDouble(jTextField9.getText());
        			wartosciOgraniczen[2]=Double.parseDouble(jTextField12.getText());
         			wartosciOgraniczen[3]=Double.parseDouble(jTextField20.getText());
       	         	
         			for (byte i=0; i<3; i++){
     	         		if(jComboBox2.getSelectedIndex() == i)
     	         			znaki[0]=i;
     	         		if(jComboBox3.getSelectedIndex() == i)
     	         			znaki[1]=i;
     	         		if(jComboBox4.getSelectedIndex() == i)
     	         			znaki[2]=i;
     	         		if(jComboBox5.getSelectedIndex() == i)
     	         			znaki[3]=i;
     	         	}
         			for( int j = 0 ; j<3; j++)
         				System.out.println(znaki[j]+"    "+ wartosciOgraniczen[j]);
        			jTextField7.setVisible(true);
       	         	jTextField8.setVisible(true);
       	         	jTextField14.setVisible(true);
       	         	jTextField29.setVisible(true);
       	         	jTextField28.setVisible(true);
       	         	jTextField9.setVisible(true);
       	         	
       	         	jTextField10.setVisible(true);
       	         	jTextField11.setVisible(true);
       	         	jTextField15.setVisible(true);
       	         	jTextField31.setVisible(true);
       	         	jTextField30.setVisible(true);
       	         	jTextField12.setVisible(true);
       	         	
       	         	jTextField18.setVisible(true);
       	         	jTextField19.setVisible(true);
       	         	jTextField22.setVisible(true);
       	         	jTextField33.setVisible(true);
       	         	jTextField32.setVisible(true);
       	         	jTextField20.setVisible(true);
       	         	
       	         	jTextField21.setVisible(false);
       	         	jTextField16.setVisible(false);
       	         	jTextField23.setVisible(false);
       	         	jTextField35.setVisible(false);
       	         	jTextField34.setVisible(false);
       	         	jTextField17.setVisible(false);

      	         	jLabel12.setVisible(true);
     	         	jLabel21.setVisible(true);
     	         	jLabel45.setVisible(true);
     	         	jLabel44.setVisible(true);
     	         	
      	         	jLabel15.setVisible(true);
     	         	jLabel23.setVisible(true);
     	         	jLabel49.setVisible(true);
     	         	jLabel48.setVisible(true);
     	         	
      	         	jLabel27.setVisible(true);
     	         	jLabel25.setVisible(true);
     	         	jLabel53.setVisible(true);
     	         	jLabel52.setVisible(true);

     	         	jLabel31.setVisible(false);
     	         	jLabel32.setVisible(false);
     	         	jLabel57.setVisible(false);
     	         	jLabel56.setVisible(false);
     	         	
       	         	jLabel13.setVisible(true);
       	         	jLabel11.setVisible(true);
       	         	jLabel22.setVisible(true);
       	         	jLabel46.setVisible(true);
       	         	jLabel43.setVisible(true);
       	         	
       	         	jLabel16.setVisible(true);
       	         	jLabel14.setVisible(true);
       	         	jLabel24.setVisible(true);
       	         	jLabel50.setVisible(true);
       	         	jLabel47.setVisible(true);
       	         	
       	         	jLabel28.setVisible(true);
       	         	jLabel26.setVisible(true);
       	         	jLabel34.setVisible(true);
       	         	jLabel54.setVisible(true);
       	         	jLabel51.setVisible(true);
       	         	
       	         	jLabel30.setVisible(false);
       	         	jLabel29.setVisible(false);
       	         	jLabel33.setVisible(false);
       	         	jLabel58.setVisible(false);
       	         	jLabel55.setVisible(false);
       	         	
       	         	jComboBox3.setVisible(true);
       	         	jComboBox4.setVisible(true);
       	         	jComboBox5.setVisible(true);
       	         	jComboBox6.setVisible(false);
       	         	
       	         }
        		 
        		 
        		 if (jComboBox7.getSelectedIndex() == 4){  //ilosc ograniczen = 5
        			 
        			 ograniczenia=5;
        			 
        			 wartosciOgraniczen[0]=Double.parseDouble(jTextField6.getText());
         			wartosciOgraniczen[1]=Double.parseDouble(jTextField9.getText());
         			wartosciOgraniczen[2]=Double.parseDouble(jTextField12.getText());
          			wartosciOgraniczen[3]=Double.parseDouble(jTextField20.getText());
          			wartosciOgraniczen[4]=Double.parseDouble(jTextField17.getText());
          			
          			for (byte i=0; i<3; i++){
     	         		if(jComboBox2.getSelectedIndex() == i)
     	         			znaki[0]=i;
     	         		if(jComboBox3.getSelectedIndex() == i)
     	         			znaki[1]=i;
     	         		if(jComboBox4.getSelectedIndex() == i)
     	         			znaki[2]=i;
     	         		if(jComboBox5.getSelectedIndex() == i)
     	         			znaki[3]=i;
     	         		if(jComboBox6.getSelectedIndex() == i)
     	         			znaki[4]=i;
     	         	}
          			
        	         	jTextField7.setVisible(true);
        	         	jTextField8.setVisible(true);
        	         	jTextField14.setVisible(true);
        	         	jTextField29.setVisible(true);
        	         	jTextField28.setVisible(true);
        	         	jTextField9.setVisible(true);
        	         	
        	         	jTextField10.setVisible(true);
        	         	jTextField11.setVisible(true);
        	         	jTextField15.setVisible(true);
        	         	jTextField31.setVisible(true);
        	         	jTextField30.setVisible(true);
        	         	jTextField12.setVisible(true);
        	         	
        	         	jTextField18.setVisible(true);
        	         	jTextField19.setVisible(true);
        	         	jTextField22.setVisible(true);
        	         	jTextField33.setVisible(true);
        	         	jTextField32.setVisible(true);
        	         	jTextField20.setVisible(true);
        	         	
        	         	jTextField21.setVisible(true);
        	         	jTextField16.setVisible(true);
        	         	jTextField23.setVisible(true);
        	         	jTextField35.setVisible(true);
        	         	jTextField34.setVisible(true);
        	         	jTextField17.setVisible(true);

          	         	jLabel12.setVisible(true);
         	         	jLabel21.setVisible(true);
         	         	jLabel45.setVisible(true);
         	         	jLabel44.setVisible(true);
         	         	
          	         	jLabel15.setVisible(true);
         	         	jLabel23.setVisible(true);
         	         	jLabel49.setVisible(true);
         	         	jLabel48.setVisible(true);
         	         	
          	         	jLabel27.setVisible(true);
         	         	jLabel25.setVisible(true);
         	         	jLabel53.setVisible(true);
         	         	jLabel52.setVisible(true);

         	         	jLabel31.setVisible(true);
         	         	jLabel32.setVisible(true);
         	         	jLabel57.setVisible(true);
         	         	jLabel56.setVisible(true);
        	         	
        	         	jLabel13.setVisible(true);
        	         	jLabel11.setVisible(true);
        	         	jLabel22.setVisible(true);
        	         	jLabel46.setVisible(true);
        	         	jLabel43.setVisible(true);
        	         	
        	         	jLabel16.setVisible(true);
        	         	jLabel14.setVisible(true);
        	         	jLabel24.setVisible(true);
        	         	jLabel50.setVisible(true);
        	         	jLabel47.setVisible(true);
        	         	
        	         	jLabel28.setVisible(true);
        	         	jLabel26.setVisible(true);
        	         	jLabel34.setVisible(true);
        	         	jLabel54.setVisible(true);
        	         	jLabel51.setVisible(true);
        	         	
        	         	jLabel30.setVisible(true);
        	         	jLabel29.setVisible(true);
        	         	jLabel33.setVisible(true);
        	         	jLabel58.setVisible(true);
        	         	jLabel55.setVisible(true);
        	         	
        	         	jComboBox3.setVisible(true);
        	         	jComboBox4.setVisible(true);
        	         	jComboBox5.setVisible(true);
        	         	jComboBox6.setVisible(true);
        	         	
        	         }
        	}
        });
        
      //==========================================================================================================
      //==========================================================================================================
      //==========================================================================================================
      //==========================================================================================================
        btnOblicz.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		
        		UzupelnijTabele();
            	WyswietlTabele();	
            		
            		
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
   
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Zadanie 2: Metoda Simpleks");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("f(P1,P2)");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("6");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("P1");

        jLabel4.setText("+");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setText("9");

        jLabel5.setText("->");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "min", "max" }));
        jComboBox1.setSelectedIndex(0);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ograniczenia:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("P2");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setText("9");

        jLabel8.setText("+");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("P1");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setText("3");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("P2");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setText("27");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setText("8");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("P2");

        jLabel12.setText("+");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("P1");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.setText("4");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setText("32");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setText("12");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("P2");

        jLabel15.setText("+");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("P1");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setText("3");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.setText("36");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("P3");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setText("0");

        jLabel18.setText("+");

        jLabel19.setText("+");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("P3");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.setText("0");

        jLabel21.setText("+");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("P3");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.setText("0");

        jLabel23.setText("+");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("P3");

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setText("0");

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField16.setText("0");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField17.setText("0");
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));

        jLabel25.setText("+");

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setText("0");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("P2");

        jLabel27.setText("+");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("P1");

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField19.setText("0");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField20.setText("0");
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ">=", "<=", "=" }));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField21.setText("0");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("P2");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("P1");

        jLabel31.setText("+");

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.setText("0");

        jLabel32.setText("+");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("P3");

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setText("0");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("P3");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("P5");

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField24.setText("0");

        jLabel36.setText("+");

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField25.setText("0");
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jLabel37.setText("+");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("P4");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("P5");

        jLabel40.setText("+");

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.setText("0");

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField27.setText("0");
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLabel41.setText("+");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("P4");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("P5");

        jLabel44.setText("+");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField28.setText("0");

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField29.setText("0");
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jLabel45.setText("+");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("P4");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("P5");

        jLabel48.setText("+");

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField30.setText("0");

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField31.setText("0");
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jLabel49.setText("+");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("P4");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("P5");

        jLabel52.setText("+");

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField32.setText("0");

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField33.setText("0");
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jLabel53.setText("+");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("P4");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("P5");

        jLabel56.setText("+");

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField34.setText("0");

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField35.setText("0");
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jLabel57.setText("+");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("P4");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Iloœæ ograniczeñ:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Iloœæ produktów:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox7.setSelectedIndex(2);

        jComboBox8.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5"}));
        jComboBox8.setSelectedIndex(0);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnOblicz.setLabel("Oblicz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel60)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnOblicz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel57)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel37)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel41)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel40)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel45)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel44)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel49)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel48)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel53)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(jLabel52)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel57)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel56)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOblicz)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }
    
   //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public void UzupelnijTabele(){
    	int liczW, liczM;
    	/*//PIERWSZY WIRSZ same liczby
    	tab[0][1]=Double.parseDouble(jTextField1.getText());  // wartosci funkcji celu
    	tab[0][2]=Double.parseDouble(jTextField2.getText());
    	tab[0][3]=Double.parseDouble(jTextField3.getText());
    	tab[0][4]=Double.parseDouble(jTextField25.getText());
    	tab[0][5]=Double.parseDouble(jTextField24.getText());
    	
    	for(int i=produkty+2; i<=produkty*2+1; i++){
    		tab[0][i]=0;  //wartoscji bazwoew dla f celu
    	}
    	
    	if(CzyMax == true){
    		tab[0][produkty*2+2]=-1;  //domyœlnie -1m
    	}
    	
    	if(CzyMax == true){
    		tab[0][produkty*2+2]=1;  //domyœlnie 1m
    	}		
    			
    	//DRUGI WIERSZ SAME LICZBY
    	tab[1][0]=0;
    	tab[1][1]=Double.parseDouble(jTextField5.getText());
    	if(produkty <=2)
    		tab[1][2]=Double.parseDouble(jTextField4.getText());
    	
    	if(produkty <=3)
    		tab[1][3]=Double.parseDouble(jTextField13.getText());
    	
    	if(produkty <=4)
    		tab[1][4]=Double.parseDouble(jTextField27.getText());
    	
    	if(produkty <=5)
    		tab[1][5]=Double.parseDouble(jTextField26.getText());
    	
    	//wypisujemy wartosc x bazowego w danym rownaniu (tu akurat 1 rownaniu  wszyedzie musza byc 0 tylko tam gdzie jedt dany x musi byc 1) naraznie nie wiem jak to zerobic wpisuje wiec same 0
    	for(int i = produkty+1; i<= produkty*2+1; i++){
    		//if(jComboBox2.getItemCount() == 0)
    		//tab[1][i]=
    		tab[1][i]=0;
    	}*/
    	
		tabTemp[0][0]=Double.parseDouble(jTextField5.getText());
		tabTemp[0][1]=Double.parseDouble(jTextField4.getText());
		tabTemp[0][2]=Double.parseDouble(jTextField13.getText());
		tabTemp[0][3]=Double.parseDouble(jTextField27.getText());
		tabTemp[0][4]=Double.parseDouble(jTextField26.getText());
		
		tabTemp[1][0]=Double.parseDouble(jTextField7.getText());
		tabTemp[1][1]=Double.parseDouble(jTextField8.getText());
		tabTemp[1][2]=Double.parseDouble(jTextField14.getText());
		tabTemp[1][3]=Double.parseDouble(jTextField29.getText());
		tabTemp[1][4]=Double.parseDouble(jTextField28.getText());
		
		tabTemp[2][0]=Double.parseDouble(jTextField10.getText());
		tabTemp[2][1]=Double.parseDouble(jTextField11.getText());
		tabTemp[2][2]=Double.parseDouble(jTextField15.getText());
		tabTemp[2][3]=Double.parseDouble(jTextField31.getText());
		tabTemp[2][4]=Double.parseDouble(jTextField30.getText());
		
		tabTemp[3][0]=Double.parseDouble(jTextField18.getText());
		tabTemp[3][1]=Double.parseDouble(jTextField19.getText());
		tabTemp[3][2]=Double.parseDouble(jTextField22.getText());
		tabTemp[3][3]=Double.parseDouble(jTextField33.getText());
		tabTemp[3][4]=Double.parseDouble(jTextField32.getText());
		
		tabTemp[4][0]=Double.parseDouble(jTextField21.getText());
		tabTemp[4][1]=Double.parseDouble(jTextField16.getText());
		tabTemp[4][2]=Double.parseDouble(jTextField23.getText());
		tabTemp[4][3]=Double.parseDouble(jTextField35.getText());
		tabTemp[4][4]=Double.parseDouble(jTextField34.getText());
		for (int i1 =0; i1<=produkty; i1++){
			for (int i2 =0; i2<ograniczenia; i2++){
				tab[i1][i2]=tabTemp[i1][i2];
			}
		}
		for(int j=0;j<=produkty+ograniczenia;j++){	
			opisZmiennych[j]="x"+(j+1);
		for(int k=produkty;k<produkty+ograniczenia; k++){
			if( j+ograniczenia-1 == k){
				if(znaki[k]==1)
					tab[j][k]=-1;
				else
					tab[j][k]=1;
			}
		}
		
		}
    }
    
    public void WyswietlTabele(){
    	String tekst = new String();
    	/*
    	NumberFormat nf = NumberFormat.getInstance();
    	nf.setMaximumFractionDigits(2);
    	nf.setMinimumFractionDigits(2);
    	String tekst = nf.format(1234.56789);
*/
    	for(int k =0; k< ograniczenia; k++){
    		for(int i=0; i < produkty+ograniczenia; i++){
    			tekst = tekst + Double.toString(tab[k][i]) + "   ";
    			tekst = tekst + opisZmiennych[i]+"   ";
    		}
    		tekst = tekst + "\n";
    	}
    	jTextArea1.setText(tekst);
    	//jTextArea1.
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    public static void main(String args[]) {
    	//===============================================================================
    	//===============================================================================
    	//===============================================================================
    	//===============================================================================
    	

    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpleksOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleksOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleksOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleksOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SimpleksOkno().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOblicz;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
}
