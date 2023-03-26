package model;



import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;


public class Apple extends Food{
    String colour;
    public Apple (int amount, double price, String colour) {
        super(amount,price,true);
        this.colour = colour;



    }


    @Override
    public double getDiscount(){
        if (colour.equals(RED) ) {
            return DISCOUNT;
        }
        return 0;
    }
    }




