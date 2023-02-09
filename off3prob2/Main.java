package off3prob2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Coffee coff;

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
            System.out.println("Enter choice number and number of cups");
            System.out.println("press 0 to finish the order");
            choice=scanner.nextInt();


            switch (choice)
            {
                case 1:
                {
                    numOfcups=scanner.nextInt();
                    coff=new AmericanoDec(new BlackCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Americano :"+coff.showPrice());
                    coff.showIngredients();

                    break;
                }
                case 2:
                {    numOfcups=scanner.nextInt();
                    coff=new EspressoDec(new BlackCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Espresso :"+coff.showPrice());
                    coff.showIngredients();
                    break;

                }
                case 3:
                {     numOfcups=scanner.nextInt();
                    coff=new CappucinoDec(new MilkCoffee());
                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Cappuccino :"+coff.showPrice());
                    coff.showIngredients();
                    break;

                }
                case 4:
                {    numOfcups=scanner.nextInt();
                    coff=new MochaDec(new MilkCoffee());


                    total+=coff.showPrice()*numOfcups;
                    System.out.println("Mocha :"+coff.showPrice());
                    coff.showIngredients();
                    break;

                }
                case 0:
                {break;}
            }


        }
        System.out.println("Your total bill is "+total);

    }
}
