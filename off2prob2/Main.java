package off2prob2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamController ec= new ExamController();
        Student student1=new Student(ec,"1905001");
        Student student2=new Student(ec,"1905002");
        Student student3=new Student(ec,"1905003");
        Student student4=new Student(ec,"1905004");
        Student student5=new Student(ec,"1905005");
        Teacher teacher=new Teacher(ec,"teacher");

        ec.setStudent1(student1);
        ec.setStudent2(student2);
        ec.setStudent3(student3);
        ec.setStudent4(student4);
        ec.setStudent5(student5);
        ec.setTeacher(teacher);
        ArrayList<Integer>list=new ArrayList <>();
        list.add(88);
        list.add(87);
        list.add(71);
        list.add(83);
        list.add(73);
        teacher.send(list);
        //re examine
        int reExam=0;
        while(true)
        {
            System.out.println("who wants to apply for reexamination?");
            reExam=scanner.nextInt();
            if(reExam==-1)break;
            ec.reExamine(reExam,list);

        }

//        student1.send(list);
//        student2.send(list);
    }
}
