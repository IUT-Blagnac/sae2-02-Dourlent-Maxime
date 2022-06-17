package eraser;

public class Erase1 {

	public static String erase2 (String chaine) {

		char [] tab = chaine.toCharArray();
	    String res = "";
	    String var = "";
	    int cpt = 0;
	    int i;
	    
	    for (i=0; i<tab.length; i++) {
	    	if (tab [i] == ' ') {
	    		var += " ";
	    		cpt += 1;
	    	} else {
	    		if (cpt > 1)
	    			res += var;
	    		cpt = 0;
	    		var = "";
	    		res += tab [i];
	    	}
	    }

    	if (cpt > 1)
    		res += var;
	    
	    return res;
	    
	}
	
}

"
affectation 1
affectation 1
affectation 1
affectation 1
affectation 1

itérations n
	test a
		affectation 1
		affectation 1
	test b
		affectation 1
	affectation 1
	affectation 1
	affectation 1
test c
	affectation 1
return

5 + n(2a + b + 3) + c

n nb de chars
a nb d'espaces
b nb de char après un espace
c booleen vérifiant si le dernier char est un espace
"