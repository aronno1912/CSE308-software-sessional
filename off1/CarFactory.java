package off1;

public class CarFactory {
    public Car getCar(String region)
    {
        if(region==null)return null;
        if(region.equalsIgnoreCase("asia"))
        {
            return new Toyota();
        }
        else if(region.equalsIgnoreCase("europe"))
        {
            return new BMW();
        }
        if(region.equalsIgnoreCase("united states"))
        {
            return new Tesla();
        }
        return null;
    }
}
