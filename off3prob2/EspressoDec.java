package off3prob2;

public class EspressoDec extends CoffeeDecorator{
    public EspressoDec(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        decoratedCoffee.ingredientList.add("Dairy Cream");
        decoratedCoffee.price=decoratedCoffee.price+40;

    }

    public int showPrice(){return decoratedCoffee.price;}
    public void showIngredients(){decoratedCoffee.showIngredients();}
}
