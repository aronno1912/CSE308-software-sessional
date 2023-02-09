package off1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem1 {


    private static void ShowComputerList() {
        System.out.println("Enter the number of your choice");
        System.out.println("1. Gaming Pc");
        System.out.println("2. Intel Corei5 Pc");
        System.out.println("3. Intel Corei7 Pc");
        System.out.println("4. Inter Corei9 Pc");
    }

    private static void showExtraItemList(){
        System.out.println(" If you want to customize your pc");
        System.out.println("Enter what to add");
        System.out.println("1.  8 GB 2666 MHz DDR4 RAM : Price 2620 BDT ");
        System.out.println("2.  8 GB 3200 MHz DDR4 RAM : Price 2950  BDT ");
        System.out.println("3.  2GB graphics card : Price 6500 BDT");
        System.out.println("4.  4GB graphics card : Price 7600  BDT");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director=new Director();
        List <Computer> olist = new ArrayList <>();
        int orderCount = 0;



        do {

            System.out.println("Enter O to place an Order and Q to exit from system");
            char ch=scanner.next().charAt(0);
            if((ch=='Q'||ch=='q')&& orderCount==0)
            {
                System.out.println("You need to order something");
                continue;
            }
            if((ch=='Q'||ch=='q')&& orderCount>0)
            {

                break;
            }
            else if(ch=='O'||ch=='o')
            {
              ShowComputerList();
              int option=-1;
              String op=scanner.next();
              try{
               option=Integer.parseInt(op);}
              catch (Exception e)
              {
                  System.out.println("please press between 1 to 4");
              }

                while(option> 4 || option < 1){
                    System.out.println("Please press any number between 1 and 4");
                    option = scanner.nextInt();
                }
                director.direct(option);

                int choice=-1;
                char command='C';
                while(command=='C'||command=='c')
                {
                    showExtraItemList();
                    String inp=scanner.next();
                    try{
                        choice=Integer.parseInt(inp);}
                    catch (Exception e)
                    {
                        System.out.println("please press between 1 to 4");
                    }
                    while (choice >4  || choice < 1) {
                        System.out.println("press 1 to 4");
                        choice = scanner.nextInt();
                    }
                    director.customize(choice);
                    System.out.println("press C to continue ,press E to end the order");
                    command=scanner.next().charAt(0);

                }

                System.out.println("Order is Completed !!!!!!!");
                Computer com = director.getProduct();
                olist.add(com);
                orderCount ++;


            }


        }while(true);

        System.out.println("Your orders are ");
        System.out.println();
        for( Computer c: olist){
            c.dispaly();
            System.out.println();
        }



    }
}
