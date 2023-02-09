package online2;

public class RegularRenting implements Strategy{
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
        car.visit++;
        return result;
    }
}
