package off3prob2;

public class CappucinoDec extends CoffeeDecorator{

    public CappucinoDec(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        decoratedCoffee.ingredientList.add("Cinnamon powder");
        decoratedCoffee.price=decoratedCoffee.price+50;

    }

    public int showPrice(){return decoratedCoffee.price;}
    public void showIngredients(){decoratedCoffee.showIngredients();}
}
