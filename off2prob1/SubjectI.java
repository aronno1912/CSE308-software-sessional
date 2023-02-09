package off2prob1;

public interface SubjectI extends Runnable{

    void acknowledge();
    void addPremiumUser(Observer x);
    void addRegularUser(Observer x);
    void removePremiumUser(Observer x);
    void removeRegularUser(Observer x);
}
