package off3prob2;

public class BlackCoffee extends Coffee{

    BlackCoffee()
    {
        price=100+30;
        ingredientList.add("water");
        ingredientList.add("CoffeeBeans");

    }
    @Override
    public int showPrice() {

        return price;
    }

    @Override
    public void showIngredients() {

        System.out.println(ingredientList);
    }
}
