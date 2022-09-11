import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constans.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] food = {
                new Meat(5, 100),
                new Apple(10, 50, Colour.RED_COLOUR),
                new Apple(8, 60, Colour.GREEN_COLOUR),
        };


        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая сумма всех товаров: " + shoppingCart.getTotalPrice());
        System.out.println("Общая сумма скидки: " + shoppingCart.getTotalDiscountAmount());
        System.out.println("Общая цена вегетарианских продуктов: " + shoppingCart.getTotalPriceVegetarian());

    }
}
