package off2prob1;

import static off2prob1.Main.*;
import static off2prob1.Main.trackOfState;

public class PremiumUser implements Observer{
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
    public PremiumUser(SubjectI s,Prompt p)
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
            if(partiallyDown&&trackOfState=="op")
            {
                prompt.OP("premium");
                pauseThisNow();
            }
            else if(fullyDown&&trackOfState=="of")
            {
                prompt.OF("premium");
                pauseThisNow();
            }
            else if(operational&&trackOfState=="po")
            {
                prompt.PO("premium");
                pauseThisNow();
            }

            else if(operational&&trackOfState=="fo")
            {
                prompt.FO("premium");
                pauseThisNow();
            }
            else if(partiallyDown&&trackOfState=="fp")
            {
                prompt.FP("premium");
                pauseThisNow();
            }
            else if(fullyDown&&trackOfState=="pf")
            {
                prompt.PF("premium");
                pauseThisNow();
            }
        }
        System.out.println("Premium User Quit ");
        subject.acknowledge();
    }



}
