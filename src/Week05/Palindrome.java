package Week05;

public class Palindrome {
    /*
    create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
	A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, it can be thought as the reverse of a word being the same as the original word

		Ex:
			racecar
			true

			anna
			true

			abc
			false

			abcba
			true
     */
    public static boolean isPalindrome(String str){ /// racecar

        for(int begin = 0, end = str.length() - 1; begin < str.length() / 2; begin++, end--){ // or end > str.length() /2
            if(str.charAt(begin) != str.charAt(end)){ // the characters are different
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("anna"));
    }

}
