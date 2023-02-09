package off3prob2;

public class MochaDec extends CoffeeDecorator{
    public MochaDec(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        decoratedCoffee.ingredientList.add("Chocolate sauce");
        decoratedCoffee.price=decoratedCoffee.price+60;

    }

    public int showPrice(){return decoratedCoffee.price;}
    public void showIngredients(){decoratedCoffee.showIngredients();}
}
