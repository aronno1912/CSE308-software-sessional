package off3prob3;

public class Developer implements BaseComponent{

    String name,type;
    String currPro;
    //String company;
    Company company;
    ProjectManager promanager;
    public Developer(String name,Company comp,ProjectManager p)
    {
        this.name=name;
        this.type="developer";
        //this.company=com;
        //this.currPro=pro;
        company=comp;
        promanager=p;
        currPro=promanager.currPro;
        promanager.addComponent(this);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: "+type);
        System.out.println("Current Project: "+currPro);

    }

    @Override
    public void addComponent(BaseComponent comp) {

    }

    @Override
    public void removeComponentFromHere(BaseComponent comp) {
        promanager.removeComponentFromHere(comp);

    }

    @Override
    public void showHierarchy(int spc) {

    }
}
