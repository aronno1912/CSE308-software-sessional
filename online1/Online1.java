package online1;


import java.util.Scanner;

public class Online1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        String choice=scanner.nextLine();
        //System.out.println(continent);
       Factory fac=new Factory();
       Plane plane=fac.getPlane(choice);
        try
        {
            plane.show();
        }
        catch (Exception e)
        { System.out.println("No such plane exists");
        }
    }
}
