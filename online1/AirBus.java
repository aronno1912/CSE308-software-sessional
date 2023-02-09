package online1;

public class AirBus extends Plane {


   AirBus()
    {
        setName();
        setEngine();
        setWing();


    }

    @Override


    void setName() {
        name="AirBus";

    }

    @Override
    void setWing() {
        wing=name+" type";

    }

    @Override
    void setEngine() {
        engine=name+" type";

    }
}
