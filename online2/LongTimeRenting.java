package online2;

public class LongTimeRenting implements Strategy{
    @Override
    public double calculation(Car car,int rentalPeriod) {
        int vis=car.visit;
        double result=rentalPeriod*500;
        if(car.carType=="Luxary")
            result+=200;

        if(car.visit>1) //loyalty discount
        {
            double disAmount=(vis/5)*0.005;
            result=result-disAmount;
        }
        double longTimeDiscount=result*0.01;
        result=result-longTimeDiscount;
        car.visit++;
        return result;
    }


    }

