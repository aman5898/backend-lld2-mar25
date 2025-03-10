package Solid.BirdV5;

public class Pigeon extends BirdV5 implements Flyable {

    FlyHigh fh;

    Pigeon(FlyHigh fh){
        this.fh  = fh;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}
