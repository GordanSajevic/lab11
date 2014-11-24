package lab11;

public class CetiriBroja {
	
	public static int Sabiranje (int broj1, int broj2)
	{
		int suma = broj1 + broj2;
		return suma;
	}
	
	public static int Oduzimanje (int broj1, int broj2)
	{
		int razlika = broj1 - broj2;
		return razlika;
	}
	
	public static int Mnozenje (int broj1, int broj2)
	{
		int proizvod = broj1 * broj2;
		return proizvod;
	}
	
	public static int Kolicnik (int broj1, int broj2)
	{
		int kolicnik = broj1 / broj2;
		return kolicnik;
	}
	
	public static double Sabiranje (double broj1, double broj2)
	{
		double suma = broj1 + broj2;
		return suma;
	}
	
	public static double Oduzimanje (double broj1, double broj2)
	{
		double razlika = broj1 - broj2;
		return razlika;
	}
	
	public static double Mnozenje (double broj1, double broj2)
	{
		double proizvod = broj1 * broj2;
		return proizvod;
	}
	
	public static double Kolicnik (double broj1, double broj2)
	{
		double kolicnik = broj1 / broj2;
		return kolicnik;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Unesite dva cijela broja: ");
		int brojInt1 = TextIO.getInt();
		int brojInt2 = TextIO.getInt();
		System.out.println("Unesite dva realna broja: ");
		double brojDouble1 = TextIO.getInt();
		double brojDouble2 = TextIO.getInt();
		System.out.println("Suma dva cijela broja: " + Sabiranje(brojInt1, brojInt2));
		System.out.println("Razlika dva cijela broja: " + Oduzimanje(brojInt1, brojInt2));
		System.out.println("Proizvod dva cijela broja: " + Mnozenje(brojInt1, brojInt2));
		System.out.println("Kolicnik dva cijela broja: " + Kolicnik(brojInt1, brojInt2));
		System.out.println("Suma dva realna broja: " + Sabiranje(brojDouble1, brojDouble2));
		System.out.println("Razlika dva realna broja: " + Oduzimanje(brojDouble1, brojDouble2));
		System.out.println("Proizvod dva realna broja: " + Mnozenje(brojDouble1, brojDouble2));
		System.out.println("Kolicnik dva realna broja: " + Kolicnik(brojDouble1, brojDouble2));
	
	}

}
