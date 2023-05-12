package Week11.access.a;

public class Computer {

    public String os;
    protected int memory;
    String brand; // when no access modifier is given it will be default access
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
