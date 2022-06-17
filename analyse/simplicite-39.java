package convertisseur;

public class solutionCategorie1 {

	public static String convertirSimple(String message) {

		if(message.contains(" ")) {
			String nvMessage = "";
			int taille = message.length();
			for(int i=0;i<taille;i++) {
				int val = message.charAt(i);
				if(val==32) {
					if(i!=taille-1) {
						int val2 = message.charAt(i+1);
						if(val2==32) {
							while(message.charAt(i)==32 && i!=taille-1) {
								nvMessage+=message.charAt(i);
								i++;
							}
							nvMessage+=message.charAt(i);
						}
					}
				} else {
					nvMessage+=(char) val ;
				}
			}
			return nvMessage;
		}
		return message;
	}
}

"
test a
	affectation 1
	affectation 1
	itérations n
		affectation 1
		test b
			test c
				affectation 1
				test b
					itérations d
						affectation 1
						affectation 1
					affectation 1
		test e
			affectation 1
	return
return

a(2 + n(1 + b(c(1 +b(2d + 1))) + e))

a booleen vérifiant si le String fourni est vide
n nb de chars
b nb d'espaces
c i!=taille-1
d message.charAt(i)==32 && i!=taille-1
e nb de char différent d'espaces
"