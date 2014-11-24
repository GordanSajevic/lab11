package lab11;

public class SumaParnihINeparnihBrojeva {
	
	/**
	 * Funkcija provjerava da li je integer paran ili ne
	 * @param
	 * @return boolean
	 */
	
	public static boolean parnost(int broj)
	{
		if (broj%2 == 0)
	  {
	    return true;
	  }
	  else
	  {
	    return false;
	  }
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite početak i kraj intervala: ");
		int pocetak = TextIO.getInt();
		int kraj = TextIO.getInt();
		int sumaParnih = 0;
		int sumaNeparnih;
		for (int i=pocetak; i<=kraj; i++)
		{
			if (parnost(i)==true)
			{
				sumaParnih += i;
			}
			else
			{
			  sumaNeparnih +=i;
			}
		}
		System.out.println("Suma svih parnih brojeva je: " + sumaParnih);
    System.out.println("Suma svih neparnih brojeva je: " + sumaNeparnih);
	}

}
