package Week04;

import java.util.Scanner;

public class PennyMachine {
    public static void main(String[] args) {


    /* PennyMachine [scanner, if, operators]

     Create a program that will ask the user to enter the number of pennies they have. Use the number of cents they give and convert them to dollars, quarters, dimes, nickles, and left over pennies. This machine can only handle from 1-1200 cents at a type

     -> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

             -> if the cents are valid print the result in the following format:
     $initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

     Extra challenge: If there is 0 of a specific type do not include it in the final output

     */
    Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your cents");
    int cents = input.nextInt();  // 246

    int dollars, quarters, nickles, dimes;
    String msg = cents + " was converted to ";

    dollars =cents /100; // 246 / 100 = 2
    cents %=100;  // 246 % 100 = 46
    quarters =cents /25; // 46 / 25 = 1
    cents %=25; // 46 % 25 = 21
    dimes =cents /10; // 21 / 10 = 2
    cents %=10; // 21 % 10 = 1
    nickles =cents /5; // 1  / 5 = 0
    cents %=5; // 1 % 5 = 1

    msg +=dollars +" dollars, "+quarters +" quarters, "+dimes +" dimes, "+nickles +" nickles "+cents +" pennies";

        System.out.println(msg);

}

}
