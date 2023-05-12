package Week06;

import java.util.Scanner;

public class ShoppingList {
    /*
    Shopping List [do while, String] [Simpler Version of the advance replit task]

	create a program that create a shopping list for the user. The program will ask
	 the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items

	when the user is done creating the list print it

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String add = "";
        String list = "";
        int attempts = 3;

        do {
            System.out.println("What item do you want to add to the list");
//            String item = input.nextLine();
//            list += item;

            list += "\n\t* " + input.nextLine();

            System.out.println("Do you want to add more items?");
            add = input.nextLine();

            // this loop is for the invalid responses, allows for trying to ask
            while(attempts > 0 && (!add.equalsIgnoreCase("yes") && !add.equalsIgnoreCase("no"))){
                System.out.println("Sorry did you want to add more items, yes or no");
                add = input.nextLine();
                attempts--;
            }

        } while(add.equalsIgnoreCase("yes"));

        System.out.println(list);

    }
}
