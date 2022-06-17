package eraser;

public class Eraser2 {

	public static String erase2(String str) {
		String resultat = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) { //32 est le code ASCII pour un espace
				if (i != 0 && str.charAt(i-1) == 32) {
					resultat += str.charAt(i);
				} else if (i+1 < str.length() && str.charAt(i+1) == 32) {
					resultat += str.charAt(i);
				}
			} else {
				resultat += str.charAt(i);
			}
		}
		return resultat; //on retourne la nouvelle String
	}
}

"
affectation 1

itérations n
	test a
		test b
			affectation 1
		test c
			affectation 1
	test d
		affectation 1

return

1 + n(a(b + c) + d) 

n nb de chars
a nb d'espaces
b nb d'espaces après un espace
c nb d'espaces avant un espace
d nb de char différent d'espace
"