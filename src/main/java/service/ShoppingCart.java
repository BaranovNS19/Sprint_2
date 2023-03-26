package service;

import model.Food;


public class ShoppingCart {

    public Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }

    public double getTotalPriceForVegeteriansOnly() {
        double totalPrice = 0;
        for (Food food : foods) {
            if (food.isVegetarian()){
                totalPrice = totalPrice + food.getTotalPrice();
            }
        }
        return totalPrice;
    }
}






