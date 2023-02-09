package online2;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(Car car,int rentalPeriod){
        return strategy.calculation(car,rentalPeriod);
    }
}

