package Decorator;

public class Mocha extends AddOn{
    public Mocha(Beverage b) {
        super(b);
    }

    @Override
    public int getCost() {
        return this.b.getCost() + 20;
//        return  200;
    }

    @Override
    public void getDesc() {
        this.b.getDesc();
        System.out.println("Mocha");
    }
}
