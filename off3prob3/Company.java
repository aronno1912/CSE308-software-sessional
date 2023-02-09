package off3prob3;

import java.util.ArrayList;

public class Company implements BaseComponent{
    String name,type;

    ArrayList <ProjectManager> proMan = new ArrayList<>();
    public Company(String name)
    {
        this.name=name;
        this.type="Company";

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
        System.out.println("Number of current projects : " + proMan.size());

    }

    @Override
    public void addComponent(BaseComponent comp) {
        proMan.add((ProjectManager) comp);

    }

    @Override
    public void removeComponentFromHere(BaseComponent comp) {

        if(comp instanceof ProjectManager)
        proMan.remove(comp);
        if (comp instanceof Company)
        {
            for(int i=0;i<proMan.size();i++)
                proMan.get(i).removeComponentFromHere(proMan.get(i));
        }
    }

    @Override
    public void showHierarchy(int spc) {

        for(int i = 0; i < spc; i++)
            System.out.print("\t");
        System.out.println(name);
        for(ProjectManager dev: proMan) {
            dev.showHierarchy(spc+1);
        }

    }
}
