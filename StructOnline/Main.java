package StructOnline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(input.contains("Ami")||input.contains("Amra")||input.contains("Bhat")||input.contains("Khai")||input.contains("Roti")||input.contains("Banai"))
        {    ConcreteBangla bt=new ConcreteBangla(input);
             Adapter ad=new Adapter(bt);
             ad.show();
        }

        else
        {EnglishText eng=new ConcreteEnglish(input);
        eng.show();}


    }
}
