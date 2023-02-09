package off3prob1;

public class Main {
    public static void main(String[] args) {
        Imposter imposter=new ConcreteImposter();
        CrewMate crewMate=new ConcreteCrewMate();
        imposter.showDetails();
        crewMate.showDetails();
         imposter=new Adapter(crewMate);
        System.out.println("By taking adapter now ");
        imposter.showDetails();

    }
}
