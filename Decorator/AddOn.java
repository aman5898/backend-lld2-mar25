package Decorator;

public abstract class AddOn implements Beverage{
    Beverage b;

    AddOn(Beverage b){
        this.b = b;
    }
}
