package lab11;

public class SumaProstihBrojevaInterval {
	
	/**
	 * Funkcija provjerava da li je integer prost ili ne
	 * @param
	 * @return boolean
	 */
	
	public static boolean isPrime(int broj)
	{
		boolean isPrime = true;
		for (int i=2; i<broj; i++)
		{
			if (broj%i==0)
			{
				return false;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite početak i kraj intervala: ");
		int pocetak = TextIO.getInt();
		int kraj = TextIO.getInt();
		int suma = 0;
		for (int i=pocetak; i<=kraj; i++)
		{
			if (isPrime(i)==true)
			{
				suma += i;
			}
		}
		System.out.println("Suma svih prostih brojeva je: " + suma);

	}

}
