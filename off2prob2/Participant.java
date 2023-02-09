package off2prob2;

abstract class Participant {
    protected Mediator mediator;
    public  String name;
    public Participant(Mediator m)
    {
        mediator=m;
    }
}
