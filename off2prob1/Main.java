package off2prob1;

public class Main {

    public static boolean operational=true;
    public static boolean partiallyDown=false;
    public static boolean fullyDown=false;
    public static String trackOfState="";
    public static boolean extraPay=false;


    public static void main(String[] args) {
        Prompt prompt=new Prompt();
        SubjectI subject=new ConcreteSubject(prompt);
        Observer pUser=new PremiumUser(subject,prompt);
        Observer rUser=new RegularUser(subject,prompt);
        subject.addRegularUser(rUser);
        subject.addPremiumUser(pUser);
         new Thread(subject).start();
    }
}
