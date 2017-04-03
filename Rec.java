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