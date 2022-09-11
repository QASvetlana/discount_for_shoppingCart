package org.example.model;

import org.example.model.constans.Colour;
import org.example.model.constans.Discount;

public class Apple extends Food {


    private final String colour;


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED_COLOUR) ? Discount.SIXTY_PERCENT : Discount.NOTHING;
    }
}

