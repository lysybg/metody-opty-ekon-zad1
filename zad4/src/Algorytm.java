
public class Algorytm {

	float[] wspCelu;// to sa cele z licznika (zysk)
	float[] wspCeluMianownik; // to sa cele z mianownika (strata)
	float[][] warunki;//tabelka w srodku co sa wartosci ogranicznen
	float[] wartosci; 
	//int[] znaki; // jaki znak bedzie miala dana jedynka w programie
	float[] sigmy;
	int ileOgraniczen, ileProduktow;
	String[] baza, zm; // do zamieniania to jest P1 itd.
	float[][] simplex; //cala baza
	float[] xB = new float[2];	
	int maxik=0;
	int minik=0;

	public Algorytm(int war, int zmienne)
	{
		warunki = new float[war+zmienne+1][zmienne+war+2];
		for (int i = 0; i < war; i++) {
			for (int j = 0; j < zmienne; j++) {
				warunki[i][j]=0;
			}
		}
		baza = new String[war];
		this.zm = new String[war+zmienne];
		ileOgraniczen=war;
		ileProduktow=zmienne;
		for (int i=0; i<war+zmienne; i++){
			this.zm[i]="x"+(i+1);
			if (i<war){
				this.baza[i]="x"+(i+zmienne+1);
			}
		}
				
		wspCelu = new float[zmienne+war];
		wspCeluMianownik = new float[zmienne+war];
		wartosci = new float[war];

		//znaki = new int[war];
	}
	public void wpisz(float[][] tab, float[] tabWartosci, float[] tabFunkcjaCelu, int war, int zmienne, float[] tabFunkcjaCeluMianownik, int[] znak, float[] iksB){
		for (int i=0; i<war; i++){
			for (int j=0; j<zmienne; j++){
				warunki[i][j]=tab[i][j];
				if (i==0){
					wspCelu[j]=tabFunkcjaCelu[j];
					wspCeluMianownik[j]=tabFunkcjaCeluMianownik[j];
				}
			}
			wartosci[i]=tabWartosci[i];
			//znaki[i]=znak[i];
		}
		for (int i=0; i<war; i++){
			for (int j=0; j<war; j++){
				if (i==j){
					if(znak[i]==1)
					warunki[i][j+zmienne]=1;
					else
						warunki[i][j+zmienne]=-1;
				}
					
			}
		}
		xB[0]=iksB[0];
		xB[1]=iksB[1];
		for(int i=zmienne;i<war+zmienne;i++){
			wspCelu[i]=0;
			wspCeluMianownik[i]=0;
		}
	}
	
	/**
	 * @param rows
	 * @param cols
	 * @return
	 */
	public String simpTable(int rows, int cols)
	{
		/*
		 * Przygotowanie tablicy simplexowej
		 */
		System.out.println("rows"+rows+"cols"+cols);
		String s="";
		simplex = new float[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				simplex[i][j]=0;
			}
		}
		/*
		 * Wstawianie wartoœci
		 */
		for (int i=0; i<rows-3; i++)
		{
			simplex[i][0]=0;
			simplex[i][1]=0;
			//simplex[1][0]=-2;
			//simplex[1][1]=-1;
			simplex[i][2]=wartosci[i];
			for (int j=0; j<cols-3; j++)
			{
				simplex[i][j+3]=warunki[i][j];
			}
		}
		/*for (int j=2; j<cols; j++)
		{
			if ((j-2)<wspCelu.length)
				simplex[0][j]=wspCelu[j-2];
		}*/
		s+="\n\nTabela simplexowa\n";
		s+=wyswietl(simplex, cols, rows);
		s+="\n\nCostam cos tam\n";
		obliczDelty(simplex,rows,cols);
		obliczDelteB(simplex,rows,cols);
		s+=wyswietl(simplex, cols, rows);
		//System.out.println("maximum"+max(simplex,cols,rows));
		//System.out.println("minimum"+min(simplex,cols,rows));
		/*maxik=max(simplex,cols,rows);
		minik=min(simplex,cols,rows);
		obliczWiersz(simplex,cols);
		oblicz(simplex,cols,rows);
		obliczKolumne(simplex,rows);
		s+="\n\n obliczmy sobie simpleksa numer 1\n";
		s+=wyswietl(simplex, cols, rows);
		simplex[1][0]=-2;
		simplex[1][1]=-1;
		s+="\n\n po pierwszej rundzie";
		obliczDelty(simplex,rows, cols);
		obliczDelteB(simplex,rows,cols);
		s+=wyswietl(simplex,cols,rows);
		maxik=max(simplex,cols,rows);
		minik=min(simplex,cols,rows);
		System.out.println("minimum"+minik+"maksimum"+maxik);
		obliczWiersz(simplex,cols);
		oblicz(simplex,cols,rows);
		obliczKolumne(simplex,rows);
		s+="\n\n obliczmy sobie simpleksa numer 2\n";
		s+=wyswietl(simplex, cols, rows);
		s+="\n\n po wszystkim";
		obliczDelty(simplex,rows, cols);
		obliczDelteB(simplex,rows,cols);
		s+=wyswietl(simplex,cols,rows);
		simplex[1][0]=0;
		maxik=max(simplex,cols,rows);
		minik=min(simplex,cols,rows);
		System.out.println("minimum"+minik+"maksimum"+maxik);
		obliczWiersz(simplex,cols);
		oblicz(simplex,cols,rows);
		obliczKolumne(simplex,rows);
		s+="\n\n obliczmy sobie simpleksa numer 2\n";
		s+=wyswietl(simplex, cols, rows);
		s+="\n\n po wszystkim";
		obliczDelty(simplex,rows, cols);
		obliczDelteB(simplex,rows,cols);
		s+=wyswietl(simplex,cols,rows);*/
		//s+="\npo pêtli\n";
		//s+=wyswietl(simplex, cols, rows);
		while(!czyOptymalne(simplex,rows,cols)){
			maxik=max(simplex,cols,rows);
			minik=min(simplex,cols,rows);
			obliczWiersz(simplex,cols);
			oblicz(simplex,cols,rows);
			obliczKolumne(simplex,rows);
			s+="\n\n obliczmy sobie simpleksa numer 1\n";
			s+=wyswietl(simplex, cols, rows);
			zamienProdukty(simplex,rows,cols);
			s+="\n\n po pierwszej rundzie";
			obliczDelty(simplex,rows, cols);
			obliczDelteB(simplex,rows,cols);
			s+=wyswietl(simplex,cols,rows);
		}
		s+="Minimum funkcji jest równe " + simplex[rows-1][1];
		for(int i=0;i<baza.length;i++){
			s+="\n"+baza[i]+" ";
			s+="= "+Math.floor(simplex[i+1][1]);
		}
		
		return s;
	}
	
	public void zamienZmienne(int in, int out){
		String tmp=baza[out];
		baza[out]=zm[in];
		zm[in]=tmp;
	}
	
	public void wstawNowaZmiennaDoBazy(float[][] simp, int i, int j){
		simp[i][0]=simp[0][j];
	}
	
	public void wyzeruj(float[][] simp, int cols, int rows, float[] wiersz, int i, int j){
		for (int k=1; k<rows-1; k++){
			if (k==i)
				continue;
			float[] tmp=new float[cols-1];
			float przezIle=simp[k][j];
			for (int l = 0; l < tmp.length; l++) {
				tmp[l]=wiersz[l]*przezIle;
				simp[k][l+1]=simp[k][l+1]-tmp[l];
			}
		}
	}
	public float[] pobierzWiersz(float[][] simp, int cols, int rows, int ktoryWiersz){
		float[] tmp = new float[cols-1];
		for(int i=1; i<cols; i++){
			tmp[i-1]=simp[ktoryWiersz][i];
		}
		return tmp;
	}
	public String wyswietl(float[][] simp, int cols, int rows){
		String s="";
		for (int i=0; i<cols; i++)
		{
			if (i==0 || i==1)
			{
				s+="\t";
			}
			else if (i==2){
				s+="xB\t";
			}
			else if(i==cols-1){
				s+="sigma\t";
			}
			else
			{
				s+="P"+(i-2)+"\t";
			}
		}
		//System.out.println();
		s+="\n";
		for(int i=0;i<ileProduktow;i++)
		System.out.println(wspCelu[i]);
			for(int j=0;j<cols;j++){
				if(j==0 || j==1){
					s+="\t";
				}
				else if(j==2)
					s+=xB[0]+"\t";
				else if(j>2 && j<ileProduktow+3)
					s+=wspCelu[j-3]+"\t";
				else if(j==cols-1)s+="\t";
					else
						s+="0.0\t";
				}
			s+="\n";
				for(int j=0;j<cols;j++){
					if(j==0)s+="cB\t";
					else if(j==1)s+="dB\t";
					else if(j==2)s+=xB[1]+"\t";
					else if(j>2 && j<ileProduktow+3){
						//s+=wspCelu[j-3]+"\t";
						s+=wspCeluMianownik[j-3]+"\t";
					}
					else if(j==cols-1) s+="\t";
					else 
						s+="0.0\t";
}
				s+="\n";
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				//System.out.print(simp[i][j]+"\t");
				s+=simp[i][j]+"\t";
			}
			//System.out.println();
			s+="\n";
		}
		return s;
	}	
	/**
	 * sprawdza któr¹ kolumnê wybraæ
	 * @param simpleks
	 * @param rows
	 * @param cols
	 * @return -1 jeœli nie ma maxa >=0
	 * >=0 Jeœli jest jakiœ max (jest to numer kolumny)
	 */
	public int max(float[][] simpleks, int cols, int rows)
	{
		float max=-1;
		for (int i=3; i<8; i++)
			if (simpleks[rows-1][i]>max && simpleks[rows-1][i]>=0)
				max=simpleks[rows-1][i];
		for (int i=3; i<8; i++)
			if(simpleks[rows-1][i]==max)
				return i;
		return -1;
	}
	
	/**
	 * sprawdza który wiersz ma wejœæ
	 * @param sigma
	 * @param rows
	 * @param cols
	 * @return 
	 */
	public int min(float[][] simpleks, int cols, int rows)
	{
		float min=1000000000.0f;
		for (int i=0; i<4; i++)
			if(simpleks[i][2]<min && simpleks[i][2]>=0)
				min=simpleks[i][2];
		for (int i=0; i<4; i++)
			if (simpleks[i][2]==min)
				return i;
		return -1;
	}
	
	/**
	 * -1 jeœli rozwi¹zanie jest optymalne
	 * 0 jeœli nie jest optymalne
	 * @param sigmy
	 * @param simpleks
	 * @param rows
	 * @param cols
	 * @return
	 */

	public void obliczWiersz(float[][] simpleks, int cols){
		for(int i =2; i<cols-1; i++){
			if(i!=maxik)
			simpleks[minik][i]=simpleks[minik][i]/simpleks[minik][maxik];
		}
			
	}
	public void oblicz(float[][] simpleks, int cols, int rows){
		System.out.println("minimum  "+minik+"maks  "+maxik);
		for(int i=0;i<rows-3;i++){
			for(int j=2;j<cols;j++){
				if((i!=minik) && (j!=maxik)){
					simpleks[i][j]=simpleks[i][j]-simpleks[minik][j]*simpleks[i][maxik];
				}
			}
		}
	}
	public void obliczKolumne(float[][] simpleks, int rows){
		for(int i =0; i<rows-3;i++){
			if(i!=minik)
				simpleks[i][maxik]=0;
		}
	}
	
	public int obliczSigmy(float[] sigmy, float[][] simpleks, int rows, int cols)
	{
		int a=max(simpleks, rows, cols);
		if (a<0)
			return -1;
		for (int i=1; i<rows-1; i++)
		{
			sigmy[i-1]=-1;
			if (simpleks[i][1]>0 && simpleks[i][a]>0)
				sigmy[i-1]=simpleks[i][1]/simpleks[i][a];
		}
		return 0;
	}
	/**
	 * Oblicza deltê L oraz M
	 *
	 */
	public void obliczDelty(float[][] simpleks, int rows, int cols){
		float a [] = new float[ileProduktow+ileOgraniczen+1];
		float c [] = new float[ileProduktow+ileOgraniczen+1];
		float b = 0;
		float d = 0;
		for (int i =0;i<ileOgraniczen;i++){
			for(int j=0;j<ileProduktow+ileOgraniczen+1;j++){
				if(j==0){
					b+=simpleks[i][j+2]*simpleks[i][0];
				d+=simpleks[i][1]*simpleks[i][j+2];
				}
				else{
					a[j-1]+=simpleks[i][j+2]*simpleks[i][0];
					c[j-1]+=simpleks[i][j+2]*simpleks[i][1];
				}
				
			}
			
		}
		simpleks[rows-3][2]=b+xB[0];//tutaj dodanie tego cB i dB
		simpleks[rows-2][2]=d+xB[1];//tu tez
		for(int i =rows-3;i<rows-1;i++){
			for(int j=3;j<cols-1;j++){
				if(i==rows-3)
				simpleks[i][j]=a[j-3]-wspCelu[j-3];//odjecie wspCelu
				else
					simpleks[i][j]=c[j-3]-wspCeluMianownik[j-3];//odjecie wspCeluMianownik
			}
		}
	}
	/**
	 * Liczymy delteB z mianownika
	 */
	public void obliczDelteB(float[][] simpleks, int rows, int cols){
		for(int i =3;i<ileOgraniczen+ileProduktow+1;i++){
			simpleks[rows-1][i]=(simpleks[rows-3][2]*simpleks[rows-2][i])-(simpleks[rows-2][2]*simpleks[rows-3][i]);
		}
		simpleks[rows-1][2]=simpleks[rows-3][2]/simpleks[rows-2][2];
	}
	/**
	 * funkcja oblicz Zj-Cj
	 * 
	 * @param simpleks
	 * @param rows
	 * @param cols
	 */
	public void zamienProdukty(float[][] simpleks, int rows, int cols){
		simpleks[minik][0]=wspCelu[maxik-3];
		simpleks[minik][1]=wspCeluMianownik[maxik-3];
	}
	
	public boolean czyOptymalne(float[][] simpleks, int rows, int cols){
		boolean czyNieDodatnie=true;
		for (int i = 2; i < 9; i++) {
			if (simpleks[rows-1][i]<0)
				czyNieDodatnie&= false;
		}
		return czyNieDodatnie;
	}
}

