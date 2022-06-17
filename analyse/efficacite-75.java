package eraser;

public class Eraser {
    /**
     * Retourne une chaÃ®ne de caractÃ¨res dont on a enlevÃ© les espaces qui sont par un (s'il y a une suite de deux ou plus espaces, ils sont gardÃ©s)
     * 
     * @param str la chaÃ®ne de caractÃ¨res Ã  "nettoyer"
     * 
     * @return la chaÃ®ne de caractÃ¨res nettoyÃ©e
     */
    public static String erase(String str) {
        String str_erased = ""; // Initialisation du nouveau String
        int size = str.length();
        for(int i = 0; i < size; i++) {
            // On vÃ©rifie si le caractÃ¨re Ã  l'emplacement i est un espace
            if(str.charAt(i) == ' ') { 
                // Si c'est le cas, on va chercher Ã  rÃ©cupÃ©rer la suite d'espaces s'il y en a une 
                int compteur = 1;
                while(i+compteur < size && str.charAt(i+compteur) == ' ') {
                    // On continue de parcourir le String en vÃ©rifiant de ne pas dÃ©passer, tant que le caractÃ¨re suivant est un espace
                    str_erased += ' '; // On ajoute un espace au String Ã  retourner
                    compteur++; // On compte le nombre d'espaces trouvÃ©s
                }
                // On vÃ©rifie si on a trouvÃ© au moins un autre espace suivant
                if(compteur != 1) {
                    // Il y a eu au moins un autre espace suivant, on ajoute donc l'espace correspondant au premier trouvÃ© Ã  i
                    str_erased += ' ';
                    // On incrÃ©mente i de compteur - 1 afin de "sauter" les Ã©tapes qui consisteraient Ã  tester chaque espace un par un
                    // On avance ainsi jusqu'au prochain caractÃ¨re diffÃ©rent d'un espace.
                    i+=compteur-1;
                }
                // On ne fait rien si on n'a pas trouvÃ© d'espace suivant : il n'y a qu'un donc on souhaite l'enlever
            }else {
                // On ne traite pas un espace, on ajoute donc le caractÃ¨re normalement
                str_erased += str.charAt(i);
            }
        }
        return str_erased;
    }
}


"
affectation 1
affectation 1

itérations n
    test a
        affectation 1
        itérations b
            affectation 1
            affectation 1
        test c
            affectation 1
            affectation 1
    test d
        affectation 1
return

2 + n(a(1 + 2b + 2c) + d)

n nb de chars
a nb d'espaces
b nb d'espaces après un espace
c nb de suites entières d'espaces
d nb de char différent d'espaces
"