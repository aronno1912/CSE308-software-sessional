package online1;

public class Safran extends Plane {

    Safran()
    {
        setName();
        setEngine();
        setWing();


    }

    @Override


    void setName() {
        name="Safran";

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
