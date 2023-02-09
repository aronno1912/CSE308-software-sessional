package off3prob2;

public class MilkCoffee extends Coffee{
    MilkCoffee()
    {
        price=100+30+50;
        ingredientList.add("water");
        ingredientList.add("CoffeeBeans");
        ingredientList.add("Milk");
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
