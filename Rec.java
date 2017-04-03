package lab8;

public class Rec {
    
    /**
     * = a copy of s with characters in reverse order. Example:
     * reverse("abcdefg") = "gfedcba".
     */
    public static String reverse(String s) {
        String lastChar = "";
        if (s.length() > 0) {
            lastChar = s.charAt(s.length() - 1) + "";
            s = s.substring(0, s.length() - 1);
            return lastChar + reverse(s);
        }
        return s;
        
    }


	/**
	 * = number of the digits in the decimal representation of n. e.g.
	 * numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2. numDigits(1356) =
	 * 4. Precondition: n >= 0.
	 */
	public static int numDigits(int n) {
		int count = 1;
		while (n / 10 != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

    /** = sum of the digits in the decimal representation of n.
      e.g. sumDigits(0) = 0, sumDigits(3) = 3, sumDigits(34) = 7,
      sumDigits(345) = 12.
      Precondition: n >= 0. */
     public static int sumDigits( int n ) {
    	int temp,sum = 0;    	
    	for( int i = 0 ; i < numDigits( n ) ; i++ ){
    		temp = n / ( int ) ( Math.pow( 10, i ) );
    		sum += temp % 10;
    	}
    	return sum;
    }

	
    /** = a copy of s with to_remove_char removed.
		Example: removeChar("abeabe", 'e') = "abab". */
	public static String removeChar(String s, char to_remove_char) {
	if (s.length() == 0) {
			return "";
		}
		if(to_remove_char == (s.charAt(0))) {
			return removeChar(s.substring(1, s.length()) ,to_remove_char);
		}
		
	return s.substring(0,1) + removeChar(s.substring(1, s.length()) ,to_remove_char);
	
	}
    
public static void main(String[] args) {
        System.out.println(numDigits(123));
        System.out.println(numDigits(123456));
        System.out.println(numDigits(1));
        System.out.println(numDigits(0));
        System.out.println("-----------------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
	System.out.println("-----------------");
	System.out.println(removeChar("eawabbcceccddeeaaeeeee", 'e'));
	System.out.println(removeChar("acacacacac", 'a'));
	System.out.println("-----------------");		
	System.out.println(reverse("AMANAPLANACANALPANAMA"));
    }
}

