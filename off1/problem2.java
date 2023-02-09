package off1;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your continent name: ");
        String continent=scanner.nextLine();
        //System.out.println(continent);
        CarFactory carFactory=new CarFactory();
        Car car=carFactory.getCar(continent);
        try
        {
        car.show();
        }
        catch (Exception e)
        { System.out.println("No Car available in this region");
        }
    }
}
