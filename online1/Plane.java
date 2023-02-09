package online1;

abstract class Plane {
 String name;
 String wing;
 String engine;

    abstract void setName() ;



    abstract void setWing();

    abstract void setEngine() ;

    void show()
    {
        System.out.println("Company: "+name);
        System.out.println("Engine: "+engine);
        System.out.println("Wing: "+wing);
    }
}
