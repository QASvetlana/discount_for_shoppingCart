package service;

import org.example.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        // спец. цикл, который используется когда
        // нужно пройтись по всем элементам массива
        for (Food food : foods) {
            totalPrice += food.getTotalPrice();

        }
        return totalPrice;
    }

    public double getTotalDiscountAmount() {
        double totalDiscount = 0;

        for (Food food : foods) {
            totalDiscount += food.getTotalDiscountAmount();
        }
        return totalDiscount;
    }

    public double getTotalPriceVegetarian() {
        double totalPriceVegetarian = 0;

        for (Food food : foods) {
            totalPriceVegetarian += food.getTotalPriceVegetarian();
        }
        return totalPriceVegetarian;
    }


}




