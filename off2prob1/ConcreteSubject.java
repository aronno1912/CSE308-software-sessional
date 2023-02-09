package off2prob1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static off2prob1.Main.*;

public class ConcreteSubject implements SubjectI{


    List<Observer>pUser=new LinkedList <>();
    List<Observer>rUser=new LinkedList <>();
    Prompt prompt;
    Helper helper=new Helper();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void addPremiumUser(Observer x){
        pUser.add(x);
    }
    @Override
    public void addRegularUser(Observer x){
        rUser.add(x);
    }
    @Override
    public void removePremiumUser(Observer x){
        pUser.remove(x);
    }
    @Override
    public void removeRegularUser(Observer x){
        rUser.remove(x);
    }

    private void staticVariablesModify(int z)
    {
        if(z==1)
        {
            operational=true;
            partiallyDown=false;
            fullyDown=false;
        }
        if(z==2)
        {
            operational=false;
            partiallyDown=true;
            fullyDown=false;
        }

        if(z==3)
        {
            operational=false;
            partiallyDown=false;
            fullyDown=true;
        }

    }



    public ConcreteSubject(Prompt p)
    {   this.prompt=p;
        prompt.setSubject(this);
        operational=true;
    }

    @Override
    public synchronized void run() {

        while(true)
        {
            System.out.println();
            System.out.println("******Server Side******");

            int z=helper.changeState();
            if(z==0)
            {
                stop();
                break;
            }
            staticVariablesModify(z);
            notifyUsers();


        }

    }

    private  void notifyUsers() {

        if(operational)
        {
            System.out.println("Server: operational");
            updateUser();

        }
        else if(partiallyDown)
        {
            System.out.println("Server: partially down");
            updateUser();

        }
        else if(fullyDown)
        {
            System.out.println("Server: fully down");
            updateUser();

        }

    }

    private  void updateUser()
    {
        for(Observer o:pUser)
        {
            o.update();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for(Observer o:rUser)
        {
            o.update();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private  void stop() {
        for(Observer o:pUser)
        {
           o.quit();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for(Observer o:rUser)
        {
            o.quit();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    @Override
    public synchronized void acknowledge() {
        this.notify();
    }

}
