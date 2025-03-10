package Solid.BirdV4;

public class Pigeon extends BirdV4 implements Flyable {

    FlyLow fl = new FlyLow();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.flyLow();
    }
}
