package off3prob2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Coffee coff;
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Americano", 0);
        map.put("Espresso", 0);
        map.put("Cappuccino", 0);
        map.put("Mocha", 0);

        int choice=-1;
        int numOfcups;
        int total=0;

        System.out.println("*****MENU*********");
        System.out.println("1.Americano");
        System.out.println("2.Espresso");
        System.out.println("3.Cappuccino");
        System.out.println("4.Mocha");
        while(choice!=0)
        {
            System.out.println("Enter choice number");
            System.out.println("press 0 to finish the order");
            choice=scanner.nextInt();




            switch (choice)
            {
                case 1:
                {     System.out.println("How many cups?");
                    numOfcups=scanner.nextInt();
                    coff=new AmericanoDec(new BlackCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Americano :"+coff.showPrice()+"tk per cup");
                    System.out.println();
                    map.put("Americano",map.get("Americano")+numOfcups);
                    coff.showIngredients();

                    break;
                }
                case 2:

                {   System.out.println("How many cups?");
                    numOfcups=scanner.nextInt();
                    coff=new EspressoDec(new BlackCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Espresso :"+coff.showPrice()+"tk per cup");
                    map.put("Espresso",map.get("Espresso")+numOfcups);
                    coff.showIngredients();

                    break;

                }
                case 3:
                {   System.out.println("How many cups?");
                    numOfcups=scanner.nextInt();
                    coff=new CappucinoDec(new MilkCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Cappuccino :"+coff.showPrice()+"tk per cup");

                    map.put("Cappuccino",map.get("Cappuccino")+numOfcups);
                    coff.showIngredients();

                    break;

                }
                case 4:
                {   System.out.println("How many cups?");
                    numOfcups=scanner.nextInt();
                    coff=new MochaDec(new MilkCoffee());


                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Mocha :"+coff.showPrice()+"tk per cup");
                    map.put("Mocha",map.get("Mocha")+numOfcups);
                    coff.showIngredients();
                    break;

                }
                case 0:
                {break;}
                default:
                {
                    System.out.println("invalid input");
                    break;
                }
            }


        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()!=0)
            System.out.println(entry.getKey() + " : " + entry.getValue()+" cups");
        }
        System.out.println("Your total bill is "+total);

    }
}
