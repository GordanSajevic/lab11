package lab11;

public class SumaParnihBrojeva {

	/**
	 * Funkcija provjerava da li je broj paran ili ne
	 * @param broj
	 * @return boolean
	 */
	
	public static boolean parniIliNe(int broj)
	{
		if (broj%2==0)
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
		int sumaNeparnih = 0;
		for (int i=pocetak; i<=kraj; i++)
		{
			if (parniIliNe(i)==true)
			{
				sumaParnih += i;
			}
			else
			{
				sumaNeparnih +=i;
			}
		}
		System.out.println("Suma svih parnih brojeva je: " + sumaParnih + ", a suma neparnih brojeva je: " + sumaNeparnih);


	}

}
