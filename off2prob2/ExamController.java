package off2prob2;

import java.util.ArrayList;
import java.util.Random;

public class ExamController extends Mediator {

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;
    private Teacher teacher;
    int temp1,temp2,temp3,temp4,temp5;
    ArrayList<Integer>tempList=new ArrayList <>(); //what marks are published by exam controller
    ArrayList<Integer>marksSentByTeacher=new ArrayList <>();
    public void setStudent1(Student s)
    {
        this.student1=s;
    }
    public void setStudent2(Student s)
    {
        this.student2=s;
    }
    public void setStudent3(Student s)
    {
        this.student3=s;
    }
    public void setStudent4(Student s)
    {
        this.student4=s;
    }
    public void setStudent5(Student s)
    {
        this.student5=s;
    }

    public void setTeacher(Teacher s)
    {
        this.teacher=s;
    }

    private void mistakeResult()
    {    Random rand=new Random();
        temp1=rand.nextInt(100);
        temp2=rand.nextInt(100);
        temp3=rand.nextInt(100);
        temp4=rand.nextInt(100);
        temp5=rand.nextInt(100);
        tempList.add(temp1);
        tempList.add(temp2);
        tempList.add(temp3);
        tempList.add(temp4);
        tempList.add(temp5);
        publishForFirstTime(tempList);
    }

    private void correctResult(ArrayList<Integer>msg)

    {
        temp1=msg.get(0);
        temp2=msg.get(1);
        temp3=msg.get(2);
        temp4=msg.get(3);
        temp5=msg.get(4);
        tempList.add(temp1);
        tempList.add(temp2);
        tempList.add(temp3);
        tempList.add(temp4);
        tempList.add(temp5);
        publishForFirstTime(tempList);

    }

    @Override
    public void send(Participant p, ArrayList<Integer> msg,int choice) {



        if(p==teacher&&choice==1) //choice 1 means first time teacher sent the marks...No re examine
        {
            marksSentByTeacher=msg;
            Random rand=new Random();
            int x=rand.nextInt(2);
            if(x==0)
                mistakeResult();
            else
                correctResult(msg);
        }

        if(p==teacher&&choice==2) //choice 2 means after re examinination marks sent by teacher
        {
            marksSentByTeacher=msg;


        }
        //students requests for reExamine
        else if(choice==0) //that means students
        {
            teacher.notify(p.name+" applies for re-examine");

            if(p==student1)
            {    teacher.reCheckScript(1);
                if(tempList.get(0)!=marksSentByTeacher.get(0))
                {
                    student1.notifyMistake("old mark "+tempList.get(0)+" new mark "+msg.get(0));
                    tempList.set(0,marksSentByTeacher.get(0));
                }
                else
                    student1.notifyMistake("No change in marks");
            }

            if(p==student2)
            {    teacher.reCheckScript(2);
                if(tempList.get(1)!=marksSentByTeacher.get(1))
                {
                    student2.notifyMistake("old mark "+tempList.get(1)+" new mark "+msg.get(1));
                    tempList.set(1,marksSentByTeacher.get(1));
                }

                else
                    student2.notifyMistake("No change in marks");
            }

            if(p==student3)
            {    teacher.reCheckScript(3);
                if(tempList.get(2)!=marksSentByTeacher.get(2))
                {
                    student3.notifyMistake("old mark "+tempList.get(2)+" new mark "+msg.get(2));
                    tempList.set(2,marksSentByTeacher.get(2));
                }
                else
                    student3.notifyMistake("No change in marks");
            }

            if(p==student4)
            {    teacher.reCheckScript(4);
                if(tempList.get(3)!=marksSentByTeacher.get(3))
                {
                    student4.notifyMistake("old mark "+tempList.get(3)+" new mark "+msg.get(3));
                    tempList.set(3,marksSentByTeacher.get(3));
                }
                else
                    student4.notifyMistake("No change in marks");
            }


            if(p==student5)
            {    teacher.reCheckScript(5);
                if(tempList.get(4)!=marksSentByTeacher.get(4))
                {
                    student5.notifyMistake("old mark "+tempList.get(4)+" new mark "+msg.get(4));
                    tempList.set(4,marksSentByTeacher.get(4));
                }
                else
                    student5.notifyMistake("No change in marks");
            }
        }

    }


    private void publishForFirstTime(ArrayList <Integer> temp) {   //first time result published
        student1.notify(temp.get(0));
        student2.notify(temp.get(1));
        student3.notify(temp.get(2));
        student4.notify(temp.get(3));
        student5.notify(temp.get(4));
        mistakeCheckAndPublish();

    }
    private void mistakeCheckAndPublish()
    {

        if(marksSentByTeacher.get(0)!=tempList.get(0))
        {  System.out.println("*****MISTAKE CASES*********");
            System.out.println(student1.name+" old mark "+tempList.get(0)+" new mark "+marksSentByTeacher.get(0));
            tempList.set(0,marksSentByTeacher.get(0));
        }
        if(marksSentByTeacher.get(1)!=tempList.get(1))
        {
            System.out.println(student2.name+" old mark "+tempList.get(1)+" new mark "+marksSentByTeacher.get(1));
            tempList.set(1,marksSentByTeacher.get(1));
        }
        if(marksSentByTeacher.get(2)!=tempList.get(2))
        {
            System.out.println(student3.name+" old mark "+tempList.get(2)+" new mark "+marksSentByTeacher.get(2));
            tempList.set(2,marksSentByTeacher.get(2));
        }
        if(marksSentByTeacher.get(3)!=tempList.get(3))
        {
            System.out.println(student4.name+" old mark "+tempList.get(3)+" new mark "+marksSentByTeacher.get(3));
            tempList.set(3,marksSentByTeacher.get(3));
        }
        if(marksSentByTeacher.get(4)!=tempList.get(4))
        {
            System.out.println(student5.name+" old mark "+tempList.get(4)+" new mark "+marksSentByTeacher.get(4));
            tempList.set(4,marksSentByTeacher.get(4));
        }
    }

    public void reExamine(int x,ArrayList<Integer> msg)
    {
        switch (x)
        {
            case 1:
            { student1.send(msg);
            break;}

            case 2:
            {student2.send(msg);
                break;}
            case 3:
            {student3.send(msg);
                break;}
            case 4:
            {student4.send(msg);
                break;}
            case 5:
            {student5.send(msg);
                break;}
            default:
            {
                System.out.println("No such student");
                break;
            }
        }
    }


}

