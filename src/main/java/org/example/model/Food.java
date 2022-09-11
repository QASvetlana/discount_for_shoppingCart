package org.example.model;

import org.example.model.constans.Discount;

public abstract class Food implements Discountable {
    private final int amount;
    private final double price;
    private final boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getTotalDiscountAmount() {
        if (getDiscount() == Discount.NOTHING) {
            return 0;
        }
        return getTotalPrice() * getDiscount() / 100;
    }

    public double getTotalPriceDiscounted() {
        return getTotalPrice() - getTotalDiscountAmount();
    }

    public double getTotalPriceVegetarian() {
        if (!isVegetarian) {
            return 0;
        }
        return getTotalPrice();
    }

}