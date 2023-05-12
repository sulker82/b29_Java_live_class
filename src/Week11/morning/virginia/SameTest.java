package Week11.morning.virginia;

public class SameTest {

    public static void main(String[] args) {
        House obj = new House();
        obj.address = "1000 N lane";
        obj.price = 100_000;
        obj.neighborhoodName = "Berry Hills";
        //obj.ownerName = "James Bond"; // private is only accessible in the class
    }
}
