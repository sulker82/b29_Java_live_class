package Week11.access.b;

public class RunnerB {

    public static void main(String[] args) {
        Mac obj = new Mac();
        System.out.println(obj.os);
//        System.out.println(obj.memory); protected is inherited in sub classes, but not
//        accessed directly. See Mac class for inheritance part
//        System.out.println(obj.brand); this was default, in a different package
//        System.out.println(obj.hasWifi); this was private, only within class
    }
}
