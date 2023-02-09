package off1;

abstract class Car {

    String name;
    String color;
    String engine;
    String country;
    String drivenSys;

    abstract void setName();
    abstract void setColor();
    abstract void setEngine();
    abstract void setCountry();
    abstract void setDrivenSys();


     void   show()
     {
         System.out.println("The car available for you is ");
         System.out.println(name);
         System.out.println("It has following properties:");
         System.out.println("Color: "+color);
         System.out.println("Manufactured by: "+country);
         System.out.println("Engine: "+engine);
         System.out.println("Driven System: "+drivenSys);
     }




}
