package online2;

public class Car {
    String carType;
    int visit;
    Car(String ct,int vis)
    {
        carType=ct;
        visit=vis;
    }
    Car(String carType)
    {
        this.carType=carType;
        visit=0;
    }
}
