package off1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Director {
    Builder builder;
    String choice1Type;
    int choice1Price;
    String choice2Type;
    int choice2Price;
    String choice3Type;
    int choice3Price;
    String choice4Type;
    int choice4Price;

    Director()
    {   //add ons
        //the extra products which a customer can buy and their prices
        choice1Type=" 8 GB DDR4 RAM 2666 MHz";
        choice1Price=2620;
        choice2Type=" 8 GB DDR4 RAM 3200 MHz";
        choice2Price=2950;
        choice3Type="2 GB graphics Card";
        choice3Price=6500;
        choice4Type="4 GB graphics Card";
        choice4Price=7600;

    }

    public void direct(int option)
    {
        if(option==1)builder=new GamingPc();
        else if(option==2) builder=new Pc1();
        else if(option==3)builder=new Pc2();
        else if(option==4)builder=new Pc3();
    }

    public void customize(int choice)
    {
      switch (choice)
      {
          case 1:

          {     List <String> lst=new ArrayList <>();

                 lst.add(choice1Type);
                 lst.add(String.valueOf(choice1Price));
              //System.out.println("here");
              //System.out.println(lst);

              //pass it to the appropriate type computer's addRam method
              builder.addRAM(lst);
              //System.out.println("added");
          break;
          }
          case 2: {
              List <String> lst=new ArrayList <>();
              lst.add(choice2Type);
              lst.add(String.valueOf(choice2Price));
              builder.addRAM(lst);

              break;
          }
          case 3: {

              List <String> lst=new ArrayList <>();
              lst.add(choice3Type);
              lst.add(String.valueOf(choice3Price));

              builder.addGraphicsCard(lst);
              break;
          }

          case 4: {
              List <String> lst=new ArrayList <>();
              lst.add(choice4Type);
              lst.add(String.valueOf(choice4Price));
              //System.out.println("graphic card list in director class");
              //System.out.println(lst);
              builder.addGraphicsCard(lst);
              break;
          }

      }
    }

  public Computer getProduct(){
        return builder.getPc();
  }

}
