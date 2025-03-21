package Decorator;


public class Client {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        System.out.println(b.getCost());
        b = new Milk(b);
        System.out.println(b.getCost());
        b = new Milk(b);
        System.out.println(b.getCost());
        b = new Mocha(b);
        System.out.println(b.getCost());
    }
}
