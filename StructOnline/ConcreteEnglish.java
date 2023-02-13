package StructOnline;

public class ConcreteEnglish implements EnglishText{
    String input;
    ConcreteEnglish(String input){this.input=input;}
    @Override
    public void show() {

        System.out.println(input);

    }
}
