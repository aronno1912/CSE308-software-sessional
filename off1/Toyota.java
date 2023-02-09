package off1;

public class Toyota extends Car {
    Toyota() {


        setColor();
        setCountry();
        setEngine();
        setDrivenSys();
        setName();



    }

    @Override
    void setName() {
        name = "Toyota";

    }

    @Override
    void setColor() {
        color = "Red";

    }

    @Override
    void setEngine() {
        engine = "Hydrogen fuel cell";

    }

    @Override
    void setCountry() {
        country = "Japan";

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
