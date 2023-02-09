package online1;

public class Boeing extends Plane {


    Boeing()
    {
        setName();
        setEngine();
        setWing();


    }

    @Override


    void setName() {
        name="Boeing";

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
