package off2prob2;
import java.util.ArrayList;

public class Student extends Participant {
    public Student(Mediator m, String n) {
        super(m);
        this.name = n;
    }

    public void send(ArrayList <Integer> whatever) {
        mediator.send(this, whatever,0);
    }

    public void notify(Integer msg) {
        System.out.println(name + " gets the mark " + msg);
    }

    public void notifyMistake(String msg) {
        System.out.println(name + " gets corrected result");
        System.out.println(msg);
    }
}