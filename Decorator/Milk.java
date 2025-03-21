package Decorator;

public class Milk extends AddOn {

    public Milk (Beverage b){
        super(b);
    }

    @Override
    public void getDesc() {
        this.b.getDesc();
        System.out.println("Milk");
    }

    @Override
    public int getCost() {
        return this.b.getCost() + 2;
    }
}
