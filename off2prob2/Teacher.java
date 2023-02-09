package off2prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher extends Participant{
    ArrayList<Integer>marks=new ArrayList <>();
    public Teacher(Mediator m,String n) {
        super(m);
        this.name=n;
    }
    public void send(ArrayList <Integer> list)
    {
        marks=list;
        mediator.send(this,list,1);
    }
    public void notify(String msg)
    {
        System.out.println("Reexamination request has been made \n"+msg);

    }
    public void reCheckScript(int id)
    {
        Random rand=new Random();
        int choice=rand.nextInt(2);
        if(choice==0)
            marks.set(id-1, marks.get(id-1)+1);
        mediator.send(this,marks,2);
    }
}