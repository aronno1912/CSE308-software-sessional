package off3prob1;

public class Adapter implements CrewMate{

    Imposter imposter;
    public Adapter(Imposter imposter){this.imposter=imposter;}


    @Override
    public void showDetails() {
        System.out.println("Crewmate is working");
    }
}
