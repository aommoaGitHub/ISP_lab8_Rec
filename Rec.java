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
    
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println(reverse("aaabbbaccabda"));
        System.out.println(reverse("abbcccdeaaa"));
        System.out.println(reverse("AMANAPLANACANALPANAMA"));
    }
}
