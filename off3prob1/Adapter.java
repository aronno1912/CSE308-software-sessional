package off3prob1;

public class Adapter implements Imposter{

    CrewMate crewMate;
    public Adapter(CrewMate crewMate){this.crewMate=crewMate;}

    @Override
    public void showDetails() {
        crewMate.showDetails();
    }
}
