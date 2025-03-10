package Solid.BirdV5;

public class Client {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(new FlyLow());

        eagle.fly();
    }
}
