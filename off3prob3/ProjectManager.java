package off3prob3;

import java.util.ArrayList;

public class ProjectManager implements BaseComponent{
    String name,type;
    String currPro;
   // String company;
    Company company;
    ArrayList <Developer> supervisees = new ArrayList<>();
    public ProjectManager(String name,String pro,Company com)
    {
        this.name=name;
        this.type="Project Manager";
        //this.company=com;
        this.currPro=pro;
        company=com;
        company.addComponent(this);

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
        System.out.println("Number of supervisees : " + supervisees.size());

    }

    @Override
    public void addComponent(BaseComponent comp) {
        supervisees.add((Developer) comp);

    }

    @Override
    public void removeComponentFromHere(BaseComponent comp) {
        if(comp instanceof Developer)
          supervisees.remove(comp);
        if(comp instanceof ProjectManager)
        {   for(int i=0;i<supervisees.size();i++)
         ((ProjectManager) comp).supervisees.remove(i);

            ((ProjectManager) comp).company.removeComponentFromHere(comp);
        }

    }

    @Override
    public void showHierarchy(int spc) {

        for(int i = 0; i < spc; i++)
            System.out.print("\t");
        System.out.println("-"+name+" ("+currPro+")");
        for(Developer dev: supervisees) {
            for(int i = 0; i < spc+1; i++)
                System.out.print("\t");
            System.out.println("-"+dev.name);
        }

    }
}
