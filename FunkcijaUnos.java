package lab11;

public class FunkcijaUnos {

	/**
	 * Funkcija prima string i vraća unos (string)
	 * @param poruka
	 * @return string
	 */
	
	public static String getString(String poruka)
	{
		System.out.println(poruka);
		poruka = TextIO.getln();
		return poruka;
	}
	
	/**
	 * Funckija prima string i vraća unos (int)
	 * @param poruka
	 * @return integer
	 */
	
	public static int getInteger(String poruka)
	{
		System.out.println(poruka);
		int broj = TextIO.getInt();
		return broj;
	}
	 
	/**
	 * Funkcija prima string i vraća double
	 * @param poruka
	 * @return double
	 */
	
	public static double getDouble(String poruka)
	{
		System.out.println(poruka);
		double broj = TextIO.getDouble();
		return broj;
	}
	
	public static void main(String[] args) {
		String ime = getString ("Unesi string: ");
		int br1 = getInteger("Unesi integer: ");
		double br2 = getDouble("Unesi double: ");
		System.out.println("Unešeni string: " + ime);
		System.out.println("Unešeni integer: " + br1);
		System.out.println("Unešeni double: " + br2);
	}
}
