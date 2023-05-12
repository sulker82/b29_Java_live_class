package Week08;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {

    /*
    SumDigits [Wrapper class, ArrayList, loop]

	Create a program that will define an ArrayList of String. The elements
	in this ArrayList will be number digits like: "123". Calculate the sum
	of the digits and store them into a new ArrayList of Integers. Print all
	 the sums of the digits at the end.

		Ex:
			Input:
			["123, "52", "513"]
			Output:
			[6, 7, 9]
     */
    public static void main(String[] args) {

        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123", "52", "513", "1842"));
        ArrayList<Integer> sums = new ArrayList<>();

        for(String each : digits){
            //System.out.println(each);

            String[] eachArr = each.split("");
            //System.out.println(Arrays.toString(eachArr));

            int sum = 0;

            for(String eachDigit : eachArr){
                //System.out.println(Integer.parseInt(eachDigit));
                sum += Integer.parseInt(eachDigit);
            }

            sums.add(sum);

        }

        System.out.println(digits);
        System.out.println(sums);

    }
}
