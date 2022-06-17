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