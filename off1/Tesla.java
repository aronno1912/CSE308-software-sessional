package off1;

public class Tesla extends Car {

    Tesla()
    {



        setColor();
        setCountry();
        setEngine();
        setDrivenSys();
        setName();







    }

    @Override
    void setName() {
        name="Tesla";

    }

    @Override
    void setColor() {
        color="White";

    }

    @Override
    void setEngine() {
        engine="electric engine";

    }

    @Override
    void setCountry() {
        country="US";

    }

    @Override
    void setDrivenSys() {
        drivenSys="All wheel";

    }
//    void show()
//    {
//        System.out.println(name);
//        System.out.println(color);
//        System.out.println(engine);
//        System.out.println(country);
//        System.out.println(drivenSys);
//
//    }
}
