package blatt8;

import java.util.Scanner;

public class AllToDecimalTestDriver {

	public static String input;
	public static int basis;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Eingabe

		System.out.println("Wie lautet die zu konvertierende Zahl ?");
		input = scanner.nextLine().toUpperCase();
		System.out.println("Wie lautet die Basis von " + input + "?");
		basis = scanner.nextInt();

		// Ausgabe
		AllToDecimal.ausgabe(input, basis);

	}
}
