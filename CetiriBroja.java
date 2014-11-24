package lab11;

/** Program traži od korisnika da unese četiri broja, dva tipa int i dva tipa double. 
 * Program koristi osam funkcija sa četiri osnovne računske operacije i vraća rezultate. **/

public class CetiriBroja {
	
	/** Sabira dva integera 
	 * param broj1 int bilo koji broj
	 * param broj2 int bilo koji broj
	 * vraća njihovu sumu 
	 * **/
	
	public static int Sabiranje (int broj1, int broj2)
	{
		int suma = broj1 + broj2;
		return suma;
	}
	
	/** Oduzima dva integera 
	 * param broj1 int bilo koji broj
	 * param broj2 int bilo koji broj
	 * vraća njihovu razliku 
	 * **/
	
	public static int Oduzimanje (int broj1, int broj2)
	{
		int razlika = broj1 - broj2;
		return razlika;
	}
	
	/** Množi dva integera 
	 * param broj1 int bilo koji broj
	 * param broj2 int bilo koji broj
	 * vraća njihov proizvod 
	 * **/
	
	public static int Mnozenje (int broj1, int broj2)
	{
		int proizvod = broj1 * broj2;
		return proizvod;
	}
	
	/** Dijeli dva integera 
	 * param broj1 int bilo koji broj
	 * param broj2 int bilo koji broj
	 * vraća njihov kolicnik 
	 * **/
	
	public static int Kolicnik (int broj1, int broj2)
	{
		int kolicnik = broj1 / broj2;
		return kolicnik;
	}
	
	/** Sabira dva double 
	 * param broj1 bilo koji double
	 * param broj2 bilo koji double
	 * vraća njihovu sumu
	 * **/
	
	public static double Sabiranje (double broj1, double broj2)
	{
		double suma = broj1 + broj2;
		return suma;
	}
	
	/** Oduzima dva double 
	 * param broj1 bilo koji double
	 * param broj2 bilo koji double
	 * vraća njihovu razliku
	 * **/
	
	public static double Oduzimanje (double broj1, double broj2)
	{
		double razlika = broj1 - broj2;
		return razlika;
	}
	
	/** Množi dva double 
	 * param broj1 bilo koji double
	 * param broj2 bilo koji double
	 * vraća njihov proizvod
	 * **/
	
	public static double Mnozenje (double broj1, double broj2)
	{
		double proizvod = broj1 * broj2;
		return proizvod;
	}
	
	/** Dijeli dva double 
	 * param broj1 bilo koji double
	 * param broj2 bilo koji double
	 * vraća njihov kolicnik
	 * **/
	
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
		double brojDouble1 = TextIO.getDouble();
		double brojDouble2 = TextIO.getDouble();
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
