package eraser;

public class Eraser {
    public static String erase(String str) {
        
    	String res = "";
    	int lastSegmentEnd = 0;
    	boolean wasSpace = false;
    	
    	int start = str.indexOf(' ');
    	if (start < 0) start = 0;
    	int end = str.lastIndexOf(' ');
    	
    	for (int i = start; i <= end; i++) {
    		
    		if (str.charAt(i) == 32) {
    			if (i == str.length()-1) {
    				if (!wasSpace) {
    					res += str.substring(lastSegmentEnd, i);
    					lastSegmentEnd = i+1;
    				}
    			} else {
    				if (!wasSpace && str.charAt(i+1) != 32) {
    					res += str.substring(lastSegmentEnd, i);
    					lastSegmentEnd = i+1;
    				}
    			}
    			wasSpace = true;
    		} else wasSpace = false;

    	}
    	
    	if (end < str.length()-1) {
    		res += str.substring(lastSegmentEnd, str.length());
    	}
    	
    	return res;
    }
}

"
affectation 1
affectation 1
affectation 1
affectation 1
test a
	affectation 1
affectation 1
itérations n
	test b
		test c
			test d
				affectation 1
				affectation 1
		test e
			affectation 1
			affectation 1
		affectation 1
	test f
		affectation 1
test g
	affectation 1
return	

4 + a + 1 + n(b(c(2d) + 2e +1) + f) + g

a str.indexOf(' ') < 0
n nb de chars
b str.charAt(i) == 32
c i == str.length()-1
d !wasSpace
e !wasSpace && str.charAt(i+1) != 32
f !b
g end < str.length()-1
"