package blatt8;

public class AllToDecimal {

	////////////////////////////////////////////////////////////////////////////////////////////
	public static int konvert(String input, int basis) {
		int sum = 0;

		for (int i = 1; i <= input.length(); ++i) {
			sum = sum + (check(input.charAt(i - 1)) * ((int) (Math.pow(basis, input.length() - i))));
		}
		return sum;
	}

	////////////////////////////////////////////////////////////////////////////////////////////
	public static int check(char x) {
		switch (x) {
		case ('A'):
			return 10;
		case ('B'):
			return 11;
		case ('C'):
			return 12;
		case ('D'):
			return 13;
		case ('E'):
			return 14;
		case ('F'):
			return 15;
		case ('0'):
			return 0;
		case ('1'):
			return 1;
		case ('2'):
			return 2;
		case ('3'):
			return 3;
		case ('4'):
			return 4;
		case ('5'):
			return 5;
		case ('6'):
			return 6;
		case ('7'):
			return 7;
		case ('8'):
			return 8;
		case ('9'):
			return 9;
		default:
			return 0;
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean con(String input) {

		for (char alpha = 'a'; alpha <= 'f'; alpha++) {
			if ((input.toLowerCase().contains(String.valueOf(alpha)))
					|| (input.toUpperCase().contains(String.valueOf(alpha)))) {
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////////
	public static void ausgabe(String input, int basis) {
		boolean erlaubt = true;

		// Bedingungen
		for (int i = 0; i < input.length(); i++) {
			int x = check(input.charAt(i));
			if (x >= basis) {
				erlaubt = false;
			}
		}
		if (!erlaubt) {
			System.out.println("Verboten!");
		} else if ((basis >= 2) && (basis < 11)) {
			if (con(input) != true) {
				int z = konvert(input, basis);
				System.out.printf("%s zur Basis %d ist = %s zur Basis %s", input, basis, z, 10);
			} else {
				System.err.println("Ein Fehler der Aufmerksamkeit ist entstanden ! ");
			}
		} else if ((basis >= 11) && (basis < 17)) {
			int z = konvert(input, basis);
			System.out.printf("%s zur Basis %d ist = %s zur Basis %s", input, basis, z, 10);
		} else {
			System.err.println("Meine Kenntnisse sind zurzeit leider begrenzt ! ");
		}
	}
}
