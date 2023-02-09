package off3prob2;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    int price;
    List<String> ingredientList = new ArrayList <String>();
int showPrice(){return this.price;}
void showIngredients(){
    System.out.println(ingredientList);
}
}
