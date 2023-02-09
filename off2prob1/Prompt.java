package off2prob1;

import java.util.Scanner;

import static off2prob1.Main.extraPay;

//what messages are to be shown in user prompt due to state change
/**
 *
 * OP----> from operational to partially down
 * OF---->  from operational to fully down
 * **/
public class Prompt {
    Scanner scanner = new Scanner(System.in);

    ConcreteSubject subject;
   public void OP(String user)
        {

          if(user=="premium")
          {     System.out.println();
              System.out.println("******Premium User******");
              System.out.println("Server is going to be down Partially...What you choose?");
              System.out.println("1.Partially from ABC server and partially from DEF server");
              System.out.println("2.Full service from DEF server");
              int in=scanner.nextInt();
              if(in == 1){
                  System.out.println("Service is supplying from both the servers partially");
              }
              else{
                  System.out.println("Service is supplying from server DEF only");
              }

              //notifies the server
              subject.acknowledge();


          }
          else if(user=="regular")
          { System.out.println();
              System.out.println("*******Regular User*******");
              System.out.println("Server is going to be down Partially...What you choose?");
              System.out.println("1.Partially from ABC server ");
              System.out.println("2.Pay $20 per hour and enjoy full service");
              int in=scanner.nextInt();
              if(in == 1){
                  System.out.println("Service is supplying partially");
                  extraPay=false;
              }
              else{
                  System.out.println("You are enjoying extra paid full service from DEF company");
                  extraPay=true;
              }
              subject.acknowledge();

          }
        }

    public void OF(String user)
    {

        if(user=="premium")
        { System.out.println();
            System.out.println("******Premium User******");
            System.out.println("Server is going to be down fully...");

            System.out.println("You will get Full service from DEF server from now on");

            subject.acknowledge();

        }
        else if(user=="regular")
        { System.out.println();
            System.out.println("*******Regular User*******");
            System.out.println("Server is going to be down fully...Pay $20 per hour and enjoy full service?");
            System.out.println("1.Yes");
            System.out.println("2.No");

            int in=scanner.nextInt();
            if(in == 2){
                System.out.println("Service is off from now on until we are back to operational");
            }
            else{
                System.out.println("You are enjoying extra paid full service from DEF company");
                extraPay=true;
            }
            subject.acknowledge();
        }
    }

    public void PO(String user)
    {

        if(user=="premium")
        {
            System.out.println();
            System.out.println("******Premium User******");


            System.out.println("We are back to Full service.It is ABC server now");

            subject.acknowledge();

        }
        else if(user=="regular")
        { System.out.println();
            System.out.println("*******Regular User*******");
            System.out.println("We are back to Full service.It is ABC server now");


            if(extraPay==true){
                System.out.println("You took paid extra service.Your current bill is 220$");
            }

            subject.acknowledge();
        }
    }

    public void PF(String user)
    {

        if(user=="premium")
        { System.out.println();
            System.out.println("******Premium User******");


            System.out.println("You will get Full service from DEF server from now on");

            subject.acknowledge();

        }
        else if(user=="regular")
        { System.out.println();
            System.out.println("*******Regular User*******");


            if(extraPay==true){
                System.out.println("You took paid extra service..You are getting service from DEF");
            }
            else
                System.out.println("Service is off from now on until we are back to operational");

            subject.acknowledge();
        }
    }

    public void FO(String user)
    {

        if(user=="premium")
        { System.out.println();
            System.out.println("******Premium User******");


            System.out.println("You will get Full service from ABC server from now on");

            subject.acknowledge();

        }
        else if(user=="regular")
        { System.out.println();
            System.out.println("*******Regular User*******");
            System.out.println("We are back to Full service.It is ABC server now");


            if(extraPay==true){
                System.out.println("You took paid extra service.Your current bill is 220$");
            }

            subject.acknowledge();
        }
    }


    public void FP(String user)
    {

        if(user=="premium")
        { System.out.println();
            System.out.println("******Premium User******");


            System.out.println("Nothing");

            subject.acknowledge();

        }
        else if(user=="regular")
        { System.out.println();
            System.out.println("*******Regular User*******");
            System.out.println("Nothing");



            //notifies the server
            subject.acknowledge();
        }
    }

    public void setSubject(ConcreteSubject s)
    {subject=s;}
}
