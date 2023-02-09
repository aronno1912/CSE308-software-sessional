package off1;

public class BMW extends Car {

    BMW() {


        setColor();
        setCountry();
        setEngine();
        setDrivenSys();
        setName();


    }

    @Override
    void setName() {
        name = "BMW";
    }

    @Override
    void setColor() {
        color = "Black";

    }

    @Override
    void setEngine() {
        engine = "electric engine";

    }

    @Override
    void setCountry() {
        country = "Germany";
    }

    @Override
    void setDrivenSys() {
        drivenSys = "Rear-wheel";

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

