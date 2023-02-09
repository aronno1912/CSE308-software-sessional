package off3prob2;

public class AmericanoDec  extends CoffeeDecorator{

    public AmericanoDec(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        decoratedCoffee.ingredientList.add("Additional grinded coffee beans");
        decoratedCoffee.price=decoratedCoffee.price+30;

    }

    public int showPrice(){return decoratedCoffee.price;}
    public void showIngredients(){decoratedCoffee.showIngredients();}
}