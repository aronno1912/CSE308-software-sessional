package off3prob1;

public class Main {
    public static void main(String[] args) {
        Imposter imposter=new ConcreteImposter();
        CrewMate crewMate=new ConcreteCrewMate();
        imposter.showDetails();
        crewMate.showDetails();
         Adapter imposter2=new Adapter(imposter);
        System.out.println("By taking adapter now ");
        imposter2.showDetails();

    }
}
