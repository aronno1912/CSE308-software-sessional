package online1;

public class Factory {

    public Plane getPlane(String choice)
    {
        if(choice==null)return null;
        if(choice.equalsIgnoreCase("boeing"))
        {
            return new Boeing();
        }
        else if(choice.equalsIgnoreCase("airbus"))
        {
            return new AirBus();
        }
        if(choice.equalsIgnoreCase("safran"))
        {
            return new Safran();
        }
        return null;
    }
}
