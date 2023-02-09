package off2prob1;

import java.util.Scanner;
import static off2prob1.Main.*;
//helps to easily state change
public class Helper {
    Scanner scanner=new Scanner(System.in);
    /**
     * 1---->operational
     * 2---->partiallydown
     * 3---->fullydown
     *
     * op----> from operational to partially down
     * of---->  from operational to fully down
     * **/
    int changeState()
    {
        System.out.println("Want to go which state?");
        System.out.println("Press 0 to terminate");
       if(operational)
       {
           System.out.println("Current state: Operational");
           System.out.println("1.Partially down");
           System.out.println("2.Fully down");
           int in=scanner.nextInt();
//           while(in!=1||in!=2)
//           {
//               System.out.println("Wrong press");
//               in=scanner.nextInt();
//           }

           if(in==0)
           {   //quits the program
               return 0;
           }
           if(in==1)
           {
             trackOfState="op";
             return 2;
           }
           else
           {
               trackOfState="of";
               return 3;
           }

       }
       else if(partiallyDown)
       {    System.out.println("Current state: Partially down");
           System.out.println("1.Operational");
           System.out.println("2.Fully down");
           int in=scanner.nextInt();
//           while(in!=1||in!=2)
//           {
//               System.out.println("Wrong press");
//               in=scanner.nextInt();
//           }
           if(in==0)
           {   //quits the program
               return 0;
           }
           if(in==1)
           {
               trackOfState="po";
               return 1;
           }
           else
           {
               trackOfState="pf";
               return 3;
           }
       }

       else
       {     System.out.println("Current state: Fully Down");
           System.out.println("1.Operational");
           System.out.println("2.Partially down");
           int in=scanner.nextInt();
//           while(in!=1||in!=2)
//           {
//               System.out.println("Wrong press");
//               in=scanner.nextInt();
//           }

           if(in==0)
           {   //quits the program
               return 0;
           }
           if(in==1)
           {
               trackOfState="fo";
               return 1;
           }
           else
           {
               trackOfState="fp";
               return 2;
           }
       }

    }
}
