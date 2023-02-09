package off3prob2;

public abstract class CoffeeDecorator extends Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    public int showPrice(){return decoratedCoffee.showPrice();}
    public void showIngredients(){ decoratedCoffee.showIngredients();}
}
