
public class Algorytm {

	float[] wspCelu;
	float[][] warunki;
	float[] wartosci;
	String[] znaki;
	String cel;
	float[] sigmy;
	int iloscWarunkow, iloscZmiennych;
	String[] baza, zmienne;
	float[][] simplex;


	public Algorytm(int war, int zmienne)
	{
		warunki = new float[war+zmienne+1][zmienne+war+2];
		for (int i = 0; i < war; i++) {
			for (int j = 0; j < zmienne; j++) {
				warunki[i][j]=0;
			}
		}
		baza = new String[war];
		this.zmienne = new String[war+zmienne];
		
		for (int i=0; i<war+zmienne; i++){
			this.zmienne[i]="x"+(i+1);
			if (i<war){
				this.baza[i]="x"+(i+zmienne+1);
			}
		}
				
		wspCelu = new float[zmienne];
		
		wartosci = new float[war];

		znaki = new String[war];
	}
	public void wpisz(float[][] tab, float[] tabWartosci, float[] tabFunkcjaCelu, int war, int zmienne){
		for (int i=0; i<war; i++){
			for (int j=0; j<zmienne; j++){
				warunki[i][j]=tab[i][j];
				if (i==0) wspCelu[j]=tabFunkcjaCelu[j];
			}
			wartosci[i]=tabWartosci[i];
		}
		for (int i=0; i<war; i++){
			for (int j=0; j<war; j++){
				if (i==j)
					warunki[i][j+zmienne]=1;
			}
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
		String s="";
		simplex = new float[rows+1][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				simplex[i][j]=0;
			}
		}
		
		for (int i=1; i<rows-1; i++)
		{
			simplex[i][0]=0;
			simplex[i][1]=wartosci[i-1];
			for (int j=0; j<cols-2; j++)
			{
				simplex[i][j+2]=warunki[i-1][j];
			}
		}
		for (int j=2; j<cols; j++)
		{
			if ((j-2)<wspCelu.length)
				simplex[0][j]=wspCelu[j-2];
		}
		s+="\n\nTabela simplexowa\n";
		s+=wyswietl(simplex, cols, rows);
		
		obliczZetMinusCe(simplex, rows, cols);
		/*
		 * SPrawdzenie pierwszego rozwi¹zania bazowego
		 */
		while(!czyOptymalne(simplex, rows, cols)){//sprawdzenie optymalnoœci rozwi¹zania
			s+="\n\nZ obliczonymi z-c\n";
			s+=wyswietl(simplex, cols, rows);
			/*
			 * Wyznaczanie nowego s¹siedniego rozwi¹zania
			 */
			float[] sigmy = new float[rows-2];
			/*
			 * Kryterium wejœcia
			 */
			if (obliczSigmy(sigmy, simplex, rows, cols)==-1)
				return s;
			s+="\n\nZ obliczonymi sigmami\n";
			s+=wyswietlZSigma(simplex, sigmy, cols, rows);
			if (min(sigmy, rows, cols)==-1)
				return s+"Nie ma dodatnich sigm";
			/*
			 * Kryterium wyjœcia i przekszta³cenia:
			 */
			podzielWiersz(simplex, min(sigmy, rows, cols), max(simplex, rows, cols), rows, cols);

			zamienZmienne(max(simplex, rows, cols)-2, min(sigmy, rows, cols)-1);
			
			s+="\n\nZ podzielonym wierszem\n";
			s+=wyswietlZSigma(simplex, sigmy, cols, rows);
			
			float[] tmp=pobierzWiersz(simplex, cols, rows, min(sigmy, rows, cols));
			
			wyzeruj(simplex, cols, rows, tmp, min(sigmy, rows, cols), max(simplex, rows, cols));
			
			s+="\n\nZ wyzerowanymi poza jedynk¹ w wybranej kolumnie\n";
			s+=wyswietlZSigma(simplex, sigmy, cols, rows);
			
			wstawNowaZmiennaDoBazy(simplex, min(sigmy, rows, cols), max(simplex, rows, cols));

			s+="\n\nPo wstawieniu do bazy\n";
			s+=wyswietlZSigma(simplex, sigmy, cols, rows);
			
			obliczZetMinusCe(simplex, rows, cols);
		}
		s+="\npo pêtli\n";
		s+=wyswietl(simplex, cols, rows);
		s+="Minimum funkcji jest równe " + simplex[rows-1][1];
		for(int i=0;i<baza.length;i++){
			s+="\n"+baza[i]+" ";
			s+="= "+Math.floor(simplex[i+1][1]);
		}
		
		return s;
	}
	
	public void zamienZmienne(int in, int out){
		String tmp=baza[out];
		baza[out]=zmienne[in];
		zmienne[in]=tmp;
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
			if (i==0)
			{
				s+="cB\t";
			}
			else if (i==1){
				s+="b\t";
			}
			else
			{
				s+="P"+(i-1)+"\t";
			}
		}
		//System.out.println();
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
	public String wyswietlZSigma(float[][] simp, float[] sigmy, int cols, int rows){
		String s="";
		for (int i=0; i<cols; i++)
			{
				if (i==0)
				{
					s+="cB\t";
				}
				else if (i==1){
					s+="b\t";
				}
				else
				{
					s+="P"+(i-1)+"\t";
				}
			}
		//System.out.print("sigma\n");
		s+="sigma\n";
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				//System.out.print(simp[i][j]+"\t");
				s+=simp[i][j]+"\t";
			}
			if (i>=1 && i<rows-1 && sigmy[i-1]>0)
			{
				//System.out.print(sigmy[i-1]);
				s+=sigmy[i-1];
			}
			else if (i>0 && i<rows-1)
			{
				//System.out.print("-");
				s+="-";
			}
			s+="\n";
			//System.out.println();
		}
		return s;
	}
	public void podzielWiersz(float[][] simp, int i, int j, int rows, int cols){
		float wartNaPrzecieciu=simp[i][j];
		for (int k=1; k<cols; k++){
			simp[i][k]=simp[i][k]/wartNaPrzecieciu;
		}
	}
	
	/**
	 * sprawdza któr¹ kolumnê wybraæ
	 * @param simpleks
	 * @param rows
	 * @param cols
	 * @return -1 jeœli nie ma maxa >=0
	 * >=0 Jeœli jest jakiœ max (jest to numer kolumny)
	 */
	public int max(float[][] simpleks, int rows, int cols)
	{
		float max=-1;
		for (int i=1; i<cols; i++)
			if (simpleks[rows-1][i]>max && simpleks[rows-1][i]>=0)
				max=simpleks[rows-1][i];
		for (int i=1; i<cols; i++)
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
	public int min(float[] sigma, int rows, int cols)
	{
		float min=1000000000.0f;
		for (int i=0; i<sigma.length; i++)
			if (sigma[i]<min && sigma[i]>=0)
				min=sigma[i];
		for (int i=0; i<sigma.length; i++)
			if (sigma[i]==min)
				return i+1;
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
	 * funkcja oblicz Zj-Cj
	 * 
	 * @param simpleks
	 * @param rows
	 * @param cols
	 */
	public void obliczZetMinusCe(float[][] simpleks, int rows, int cols)
	{
		//czyszczenie ostatniego wiersza
			for (int j=1; j<cols; j++)
				simpleks[rows-1][j]=0;
		//obliczanie
		for (int i=1; i<cols; i++)
		{
			for (int j=1; j<rows; j++){
				simpleks[rows-1][i]+=simpleks[j][0]*simpleks[j][i]; // w ostatnim wierszu suma
			}
			simpleks[rows-1][i]-=simpleks[0][i];
		}
	}
	
	public boolean czyOptymalne(float[][] simpleks, int rows, int cols){
		boolean czyNieDodatnie=true;
		for (int i = 0; i < simpleks.length; i++) {
			if (simpleks[rows-1][i]>0)
				czyNieDodatnie&= false;
		}
		return czyNieDodatnie;
	}
}

