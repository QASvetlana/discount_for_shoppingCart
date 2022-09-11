package org.example.model;

import org.example.model.constans.Discount;

public class Meat extends Food {


    public Meat(int amount, double price) {
        // конструктор родительского класса
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {
        return Discount.NOTHING;
    }
}
