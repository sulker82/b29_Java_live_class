package Utility;

public class StringUtils {

    public static String reverse(String str) {
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse +=  str.charAt(i);

        }
        return reverse;

    }
}