package Week13;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        // all the possible reference of TShirt and Jacket
        // TShirt:

        TShirt shirt1 = new TShirt();
        Clothes shirt2 = new TShirt();

        // Jacket:
        Jacket jacket1 = new Jacket();
        Clothes jacket2 = new Jacket();
        HasHood jacket3 = new Jacket();

        Clothes[] inventory = new Clothes[7];
        inventory[0] = new TShirt();
        inventory[1] = shirt1;
        inventory[2] = shirt2;
        inventory[3] = jacket1;
        inventory[4] = jacket2;
//        inventory[5] = jacket3; // doesn't work because HasHood interface is not related to Clothes at all
        inventory[5] = new Hat();
        inventory[6] = new Hat();

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new Jacket());
        list.add(new TShirt());
        list.add(new Hat());

        for(Clothes each : inventory){
            each.wear();
        }

        buy(new Jacket());
        buy(new Hat());
        buy(new TShirt());

    }

    public static void buy(Clothes clothes){

        if(clothes instanceof Jacket){
            System.out.println("Jackets cost 29.99");
        } else if(clothes instanceof Hat){
            System.out.println("Hats cost 19.99");
        } else if(clothes instanceof TShirt){
            System.out.println("Tshirt is 9.99");
        }

    }
}
