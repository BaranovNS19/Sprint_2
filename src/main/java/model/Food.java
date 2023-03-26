package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;



    protected Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;

    };



    @Override
    public double getDiscount(){
        return 0;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount(){
        return getTotalPrice() - (getDiscount() / 100 *getTotalPrice()) ;

    }

    public boolean isVegetarian(){

        return this.isVegetarian;
    }



}

