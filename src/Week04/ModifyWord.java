package Week04;

import java.util.Scanner;

public class ModifyWord {

    /*
    ModifyWord [indexes, conditional]

	Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters

	if the characters we not the same replace the first charter to be '*' and the last character to be #

	print the results
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String word = "java"; // hard coded
        String word = input.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1); // last index: str.length() -1
        String middle = word.substring(1, word.length() - 1);

        if (first == last) { // we use == because we are comparing char types
            System.out.println(middle);
        } else {
            System.out.println("*" + middle + "#");
        }

        /*
            word = everyone
            charAt(0) -> e
            word.charAt(word.length() -1); -> word.charAt(8 - 1); word.charAt(7); -> e
            word.substring(1, word.length() - 1); -> word.substring(1, 8 - 1);
                -> word.substring(1, 7); -> veryon

        if(first == last) -> print middle -> veryon


        word -> hello
            middle = ell

            else -> *ell#

         */

        /*

        if(word.endsWith("" + word.charAt(0)){

         */
    }
    }
