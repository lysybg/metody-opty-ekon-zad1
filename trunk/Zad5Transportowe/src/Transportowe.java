import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Transportowe.java
 *
 * Created on 2012-05-31, 11:22:47
 */
/**
 *
 * @author student
 */
public class Transportowe extends javax.swing.JFrame {
	int tabela[][];
	int tabelaTMP[][];
	int tabelaMin[];
	int ilosc;
	boolean czyMax;
	
    /** Creates new form Transportowe */
    public Transportowe() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Zadanie 5: Zagadnienie Transportowe");

        jTextField1.setText("30");

        jTextField2.setText("50");

        jTextField3.setText("60");

        jTextField4.setText("80");

        jTextField5.setText("40");

        jTextField6.setText("80");

        jTextField7.setText("70");

        jTextField8.setText("100");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setText("60");

        jTextField10.setText("40");

        jTextField11.setText("50");

        jTextField12.setText("30");

        jTextField13.setText("90");

        jTextField14.setText("60");

        jTextField15.setText("60");

        jTextField16.setText("70");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("C=[cij]=");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4" }));
        jComboBox1.setSelectedIndex(1);

        jLabel3.setText("Ilo��");

        jButton1.setText("Oblicz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        if(jComboBox1.getSelectedIndex()==0)
        	ilosc=3;
        else
        	ilosc=4;
        jButton1.addMouseListener(new MouseAdapter() {
          	public void mouseClicked(MouseEvent arg0) {
          		
          		jTextArea1.setText("");  //czyscimy okno
          		
          		
          		//Algorytm(ograniczenia, produkty);

          		uzupelnijTabele();
          		//wpisz(tab, wartosciOgraniczen, tabelaCelow, produkty, ograniczenia);
          		
          		//jTextArea1.setText(simpTable(ograniczenia+2, ograniczenia+produkty+2));
          		//wywo�ujemy funkcje
          		
          		//WyswietlTabele();
          	//	Simplels();
              	//WyswietlTabele();		
          	}
          });
        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField8ActionPerformed


public void wy�wietlTabele(){
	for(int i=0;i<ilosc;i++){
		for(int j=0;j<ilosc;j++){
			jTextArea1.append(tabelaTMP[i][j]+"\t");
		}
		jTextArea1.append("\n");
	}
	jTextArea1.append("\n");
	jTextArea1.append("\n");
}

public void wy�wietlTabeleZMinamiW(){
	for(int i=0;i<ilosc;i++){
		for(int j=0;j<ilosc;j++){
			jTextArea1.append(tabelaTMP[i][j]+"\t");
		}
		jTextArea1.append("|  "+tabelaMin[i]+"\t");
		jTextArea1.append("\n");
	}
	jTextArea1.append("\n");
	jTextArea1.append("\n");
}

public void wy�wietlTabeleZMinamiK(){
	for(int i=0;i<ilosc;i++){
		for(int j=0;j<ilosc;j++){
			jTextArea1.append(tabelaTMP[i][j]+"\t");
		}
		jTextArea1.append("\n");
	}
	for(int i=0; i< ilosc*20; i++){
		jTextArea1.append("-");
	}
	jTextArea1.append("\n");
	for(int i=0; i< ilosc; i++){
		jTextArea1.append(tabelaMin[i]+"\t");
	}
	jTextArea1.append("\n");
	jTextArea1.append("\n");
}

public void uzupelnijTabele(){
	tabela = new int [ilosc][ilosc];
	tabelaTMP = new int [ilosc][ilosc];
	tabelaMin = new int [ilosc];
	
	int[] zeraWWierszach = new int[ilosc];
	int[] zeraWKolumnach = new int[ilosc];
	
	czyMax = false;   // ZMIENIC JAK ZOSTANIE DODANY COMBOBOX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	boolean czyKoniecPrzeksztalcen = true;
	
	
	tabela[0][0]=Integer.parseInt(jTextField1.getText());
	tabela[0][1]=Integer.parseInt(jTextField2.getText());
	tabela[0][2]=Integer.parseInt(jTextField3.getText());
	tabela[0][3]=Integer.parseInt(jTextField4.getText());
	tabela[1][0]=Integer.parseInt(jTextField5.getText());
	tabela[1][1]=Integer.parseInt(jTextField6.getText());
	tabela[1][2]=Integer.parseInt(jTextField7.getText());
	tabela[1][3]=Integer.parseInt(jTextField8.getText());
	tabela[2][0]=Integer.parseInt(jTextField9.getText());
	tabela[2][1]=Integer.parseInt(jTextField10.getText());
	tabela[2][2]=Integer.parseInt(jTextField11.getText());
	tabela[2][3]=Integer.parseInt(jTextField12.getText());
	tabela[3][0]=Integer.parseInt(jTextField13.getText());
	tabela[3][1]=Integer.parseInt(jTextField14.getText());
	tabela[3][2]=Integer.parseInt(jTextField15.getText());
	tabela[3][3]=Integer.parseInt(jTextField16.getText());
	
	
	for(int i=0;i<ilosc;i++){
		for(int j=0;j<ilosc;j++){
			if(czyMax == false){
				tabelaTMP[i][j] = -1 * tabela[i][j];
			}
			if(czyMax == true){
				tabelaTMP[i][j] =  tabela[i][j];
			}
		}
	}
	
	
	//WY�WIETLAMY
	jTextArea1.append("Pierwsza Tabela \n\n");
	wy�wietlTabele();
	
	//SZUKAMY MINA W WIERSZACH
	int Min;
	
	
	for(int i=0;i<ilosc;i++){
		Min = tabelaTMP[i][0];
			for(int j=0;j<ilosc;j++){
				if( Min >= tabelaTMP[i][j]){
					tabelaMin[i] = tabelaTMP[i][j];
					Min = tabelaTMP[i][j];
				}
			}
	}
	//WY�WIETLAMY
	jTextArea1.append("Wyszukane minim�w w wierszach \n\n");
		wy�wietlTabeleZMinamiW();
	
	//PRZEKSZTA�CAMY TABELE
	for(int i=0;i<ilosc;i++){
		for(int j=0;j<ilosc;j++){
			tabelaTMP[i][j] = tabelaTMP[i][j] - tabelaMin[i];		
		}
	}
	//WY�WIETLAMY
	jTextArea1.append("Przekszta�cona tabela \n\n");
		wy�wietlTabele();
		
	//Sprawdzamy czy w ka�dej kolumnie i w ka�dym wierszu jest cho� jedno zero
	//1. sprawdzamy zera w wierszach	
	for(int i=0; i<ilosc; i++){
		for(int j=0; j<ilosc; j++){
			if(tabelaTMP[i][j] == 0){
				zeraWWierszach[i]++;
			}
		}
	}
	
	//2. sprawdzamy zera w kolumnachy	
		for(int j=0; j<ilosc; j++){
			for(int i=0; i<ilosc; i++){
				if(tabelaTMP[i][j] == 0){
					zeraWKolumnach[j]++;
				}
			}
		}
		
			/*
			 * WYSWUETLANIE TESTOWE
				for(int j=0; j<ilosc; j++){
					System.out.println("Zera w kolumnach ="+zeraWKolumnach[j]);
				}
				
				for(int i=0; i<ilosc; i++){
					System.out.println("Zera w wierszach ="+zeraWWierszach[i]);
				}
			 */
		for(int j=0; j<ilosc; j++){
			if( (zeraWKolumnach[j] == 0) & (zeraWWierszach[j] == 0) ){
				czyKoniecPrzeksztalcen = false;
			}
		}
		
		//JE�LI NIE W KADEJ KOLUMNIE I NIE W KADYM WIERSZU JEST ZERO TO PRZEKSZTA�CAMY JESZCZE RAZ ALE PO KOLUMNACH
		if(czyKoniecPrzeksztalcen == true){
			//SZUKAMY MINA W KOLUMNACH
			for(int i=0;i<ilosc;i++){
				Min = tabelaTMP[0][i];
					for(int j=0;j<ilosc;j++){
						if( Min >= tabelaTMP[j][i]){
							tabelaMin[i] = tabelaTMP[j][i];
							Min = tabelaTMP[j][i];
						}
					}
			}
			
			//WY�WIETLAMY
			jTextArea1.append("Wyszukane minim�w w kolumnach \n\n");
			wy�wietlTabeleZMinamiK();
			
			//PRZEKSZTA�CAMY TABELE PO KOLUMNACH
			for(int i=0;i<ilosc;i++){
				for(int j=0;j<ilosc;j++){
					tabelaTMP[j][i] = tabelaTMP[j][i] - tabelaMin[i];		
				}
			}
			//WY�WIETLAMY
			jTextArea1.append("Przekszta�cona tabela \n\n");
			wy�wietlTabele();
			
			//-----------------------------------------------------------------------------------------
			//=========================================================================================
			//---------------WYKRE�LANKA------------------
			//-----------------------------------------------------------------------------------------
			//=========================================================================================
			
			int[][] doWykreslania = new int[ilosc][ilosc];
			int[][] wykreslanka = new int[ilosc][ilosc];
			
			int[] zeraWiersze = new int[ilosc];
			int[] zeraKolumny = new int[ilosc];
			int iloscLini = 0;
			boolean CzyKoniec = false;
			
			int licznikW=0, licznikK=0;
			
			int maxWiersze=0, maxKolumny=0, kolumna, wiersz;
			int Max;
			
			int MinNieSkreslony;
			
			
//------------------------------------------------------------------------------------
//====================================================================================
		while(iloscLini != ilosc){
			iloscLini = 0;
			
			for(int i=0;i<ilosc;i++){
				for(int j=0;j<ilosc;j++){
					if(tabelaTMP[i][j] == 0){
						doWykreslania[i][j] = 0;
					}else{
						doWykreslania[i][j] = 1;
					}
				}
			}
			
			while(CzyKoniec != true){
				

				for(int i=0; i<ilosc; i++){
					zeraWiersze[i]=0;
					zeraKolumny[i]=0;
				}
			

			//Zliczamy ilo�ci zer w wierszach 
				for(int i=0;i<ilosc;i++){
					Min = tabelaTMP[i][0];
						for(int j=0;j<ilosc;j++){
							if( doWykreslania[i][j] == 0){
								zeraWiersze[i]=zeraWiersze[i]+1;
							}
						}
				}
			
			//Zliczamy zera w kolumnach
				for(int i=0;i<ilosc;i++){
						for(int j=0;j<ilosc;j++){
							if(  doWykreslania[j][i] == 0){
								zeraKolumny[i]=zeraKolumny[i]+1;
							}
						}
				}
			/*
				System.out.println();
				System.out.print("K  ");
				for(int i=0;i<ilosc;i++){
					System.out.print(" "+zeraKolumny[i]);
				}
				System.out.println();

				for(int i=0;i<ilosc;i++){
					System.out.println("W "+zeraWiersze[i]);
				}
				System.out.println();
			*/
			//SZUKAMY maksymaln� ilosc zer w kolumnach i w wierszach

			
			// WIERSZE
				Max = zeraWiersze[0];
				maxWiersze = zeraWiersze[0];
				wiersz = 0;
				
				for(int i=1;i<ilosc;i++){
					if(Max < zeraWiersze[i]){
						maxWiersze = zeraWiersze[i];
						Max = zeraWiersze[i];
						wiersz = i;
					}
				}
			
			//KOLUMNY
				Max = zeraKolumny[0];
				maxKolumny = zeraKolumny[0];
				kolumna = 0;
				
				for(int i=1;i<ilosc;i++){
					if(Max < zeraKolumny[i]){
							maxKolumny = zeraKolumny[i];
							Max = zeraKolumny[i];
							kolumna = i;
					}
				}
			
			//System.out.println("Max wieszy "+maxWiersze+" numer "+wiersz);
			//System.out.println("Max kolumn "+maxKolumny+" numer "+kolumna);
			
			//SPRAWDZAMY CO SKRE�LI� KOLUMNE CZY WIERSZ, domy�lnie wiersz
			//skre�lamy wiersz
				/*
				System.out.println();
				System.out.println("DOWYKRESLENIA PRZED");
			
				for(int i=0;i<ilosc;i++){
					for(int j=0;j<ilosc;j++){
						System.out.print(doWykreslania[i][j]+"  ");
					}
					System.out.println();
				}
				 */
			//doWykreslania
			if(maxWiersze !=0 & maxKolumny != 0){
				if(maxWiersze >= maxKolumny){
					for(int i=0; i<ilosc; i++){
						wykreslanka[wiersz][i]++;
						doWykreslania[wiersz][i]++;
					}
					iloscLini++;
				}else{
				//skreslamy kolumne
					for(int i=0; i<ilosc; i++){
						wykreslanka[i][kolumna]++;
						doWykreslania[i][kolumna]++;
					}
					iloscLini++;
				}
			}
			/*
			System.out.println();
			System.out.println("SKRESLENIA");
			
			for(int i=0;i<ilosc;i++){
				for(int j=0;j<ilosc;j++){
					System.out.print(wykreslanka[i][j]+"  ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("DOWYKRESLENIA");
			
			for(int i=0;i<ilosc;i++){
				for(int j=0;j<ilosc;j++){
					System.out.print(doWykreslania[i][j]+"  ");
				}
				System.out.println();
			}
			*/
			
			
			//WARUNEK DO ZATRZYMANIA SKRE�LANIA, przestajemy skreslac je�li nie zosta�o ju� zer
				licznikW=0; licznikK=0;
			
				for(int i=0; i<ilosc; i++){
					if(zeraWiersze[i] == 0){
						licznikW++;
					}
					if(zeraKolumny[i] == 0){
						licznikK++;
					}
				}

				
				if(licznikK == ilosc & licznikW == ilosc){
					CzyKoniec = true;
				}
			}
			
			if(iloscLini == ilosc){
				jTextArea1.append("Ilo�� linii potrzbna do skre�lenia wszystkich zer: "+iloscLini+"\n");
				jTextArea1.append("Ilo�� linii = rozmierowi tablicy.\nNie przekszta�camy tablicy.\n\n--------------------------------------------------------------------\nKolejny krok: szukamy rozwi�zania.\n\n");
			}else{
				jTextArea1.append("Ilo�� linii potrzbna do skre�lenia wszystkoch zer: "+iloscLini+"\n\n");
				jTextArea1.append("Nale�y przekszta�ci� tabele wyszukuj�c nieskre�lone minimum.\n\n");
			}
			

			//JESLI ILOSC LINI POTZREBNYCH DO WYKRE�LENIA JEST MNIEJSZA OD ROZMIARU TABLICY TO PRZEKSZTA�CAMY TABLICE
			if(iloscLini < ilosc){
				CzyKoniec = false;
				//szumamy mina nie skre�lonego
				MinNieSkreslony = 100000; //bardzo duza liczba poczatkowa kt�ra zapewne nie znjadzie sie macierzy C g��wnej
				
				for(int i=0; i<ilosc; i++){
					for(int j=0; j<ilosc; j++){
						if(wykreslanka[i][j] == 0 & tabelaTMP[i][j] < MinNieSkreslony){
							MinNieSkreslony = tabelaTMP[i][j];
						}
					}
				}
				
				jTextArea1.append("Nieskre�lone minimum wynosi: "+MinNieSkreslony+"\n\n");
				
				for(int i=0; i<ilosc; i++){
					for(int j=0; j<ilosc; j++){
						if(wykreslanka[i][j] == 0){
							tabelaTMP[i][j] = tabelaTMP[i][j] - MinNieSkreslony;
						}
						if(wykreslanka[i][j] == 2){
							tabelaTMP[i][j] = tabelaTMP[i][j] + MinNieSkreslony;
						}
					}
				}
				
				jTextArea1.append("Przekszta�cona tabela po wykre�laniu \n\n");
				wy�wietlTabele();
			} //koniec whila wykreslajacego
		}
		}
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transportowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transportowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transportowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transportowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Transportowe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
