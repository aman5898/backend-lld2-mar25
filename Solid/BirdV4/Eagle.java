package Solid.BirdV4;

public class Eagle extends BirdV4 implements Flyable {

    FlyHigh fh = new FlyHigh();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.flyhigh();
    }
}
