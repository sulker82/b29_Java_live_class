package Week10;

import java.util.ArrayList;

public class DrinkVending {

     /*
    Create a DrinkVending class:
		create a instance variable: allDrinks (ArrayList of Drink objects)
		create a constructor that will create an empty ArrayList
		create an overloaded constructor that will accept a ArrayList of Drinks of objects to initialize the vending machine with some Drinks
		create a toString to display the drinks in a nice format
     */

    ArrayList<Drink> allDrinks;

    public DrinkVending(){
        allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks){
        this(); // calls the no arg constructor
        allDrinks.addAll(inputDrinks); // add all of the Drinks objects from the inputDrinks into the instance allDrinks ArrayList
    }

    public String toString(){
        String output = "";
        for(Drink each : allDrinks){
            output += each + "\n";
        }
        return output;
    }

}
