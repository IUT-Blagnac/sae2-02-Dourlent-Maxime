package eraser;


public class Eraser {
	public static String erase(String str) {
		  StringBuilder sb = new StringBuilder();
		  int i = 0;
		  while (i < str.length()) {
		   if (str.charAt(i) != ' ') {
		    sb.append(str.charAt(i)); // ajout du caractère au StringBuilder
		   } else if (i + 1 < str.length() && str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
		    sb.append(str.charAt(i));
		   } else if ( i - 1 < str.length() && str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')  {
			   sb.append(str.charAt(i));
		   }
		   i++;
		  }
		  
		  return sb.toString();
		 }
}

"
affectation 1
affectation 1

itérations n
    test a
        affectation 1
    test b
        affectation 1
	test c
		affectation 1
	affectation 1 
return

2 + n(a + b + c + 1)

n nb de chars
a nb de char différent d'espaces
b nb d'espaces avant un espace
c nb d'espaces après un espace
"