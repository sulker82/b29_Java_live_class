package Week11.morning.california;

import Week11.morning.virginia.House;

public class DifferentTest {

    public static void main(String[] args) {
        House obj = new House();
        obj.address = "1000 N lane";
//        obj.price = 100_000;
//        obj.neighborhoodName = "Berry Hills";
//        obj.ownerName = "James Bond";
        // only public is accessible in a different package
    }
}
