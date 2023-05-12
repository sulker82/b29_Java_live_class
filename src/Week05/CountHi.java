package Week05;

public class CountHi {
    /*
    create a method that will accept a String and count how many times the word "hi" is found in the String. return the count

		ex:
			input: aahiahiaaahh
			output: 2
				"hi" was found 2 times

			input: ahhhbchidefhihellohiiiiworld
			output: 3
				"hi" was found 3 times

	extra: overload the method to search for any word, not just "hi"
     */
    public static int countHi(String str){
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("hiellhiowhhhhhiorld"));
    }
}
