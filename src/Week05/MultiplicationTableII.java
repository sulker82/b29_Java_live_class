package Week05;

public class MultiplicationTableII {
    public static void multiplicationTable(int number){
        multiplicationTable(number, 10);
    }
    /*
    overload the previous multiplication table method to accept the number for
    the table and also the ending point for the multiplication(the default was before was 10)

		ex: inputs: 3, 20
			result would print the multiplication table of 3 up until 20
				3 x 1 = 3
				...
				3 x 20 = 60
     */
    public static void multiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
