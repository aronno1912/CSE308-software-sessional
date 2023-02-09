package off2prob1;

import static off2prob1.Main.*;

public class RegularUser implements Observer{

    private boolean shouldRunThis = false;
    private boolean exit = false;

    SubjectI subject;
    Prompt prompt;

    private void check()
    {
        if(shouldRunThis)
            shouldRunThis=false;
        pauseThisNow();
        quit();
    }

    public RegularUser(SubjectI s,Prompt p)
    {
        this.subject=s;
        this.prompt=p;
        new Thread(this).start();
    }

    private   void pauseThisNow(){
        shouldRunThis = false;
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void quit() {
         exit=true;
         update();
    }

    @Override
    public synchronized void update() {
        shouldRunThis=true;
         this.notify();
    }



    @Override
    public  synchronized void run() {

        while(!shouldRunThis) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while(!exit)
        {
         if(partiallyDown==true&&trackOfState=="op")
         {
           prompt.OP("regular");
             pauseThisNow();
         }
         else if(fullyDown==true&&trackOfState=="of")
         {
             prompt.OF("regular");
             pauseThisNow();
         }
         else if(operational==true&&trackOfState=="po")
         {
             prompt.PO("regular");
             pauseThisNow();
         }

         else if(operational==true&&trackOfState=="fo")
         {
             prompt.FO("regular");
             pauseThisNow();
         }
         else if(partiallyDown==true&&trackOfState=="fp")
         {
             prompt.FP("regular");
             pauseThisNow();
         }
         else if(fullyDown==true&&trackOfState=="pf")
         {
             prompt.PF("regular");
             pauseThisNow();
         }
        }
        System.out.println("Regular User Quit");
        //notifies the server
       subject.acknowledge();
    }



}
