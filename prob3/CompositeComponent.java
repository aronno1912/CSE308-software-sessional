package prob3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeComponent extends BaseComponent{
   private String name,role,currProj;
    private List <BaseComponent> children;
    public CompositeComponent(String name, String role, BaseComponent parent,String currProj) {
        super(name, role, parent);
        this.name=name;
        this.role=role;
        this.currProj=currProj;
        children=new ArrayList <>();
    }

    @Override
    public int getComponentCount() {
        Iterator it = children.iterator();
        int ct = 0;
        while(it.hasNext())
        {
            BaseComponent comp = (BaseComponent) it.next();

            if(comp.getRole().equalsIgnoreCase("developer")) {
                ct++;
            } else
            {
                ct += comp.getComponentCount();
            }
        }
        return ct;
    }

    @Override
    public String getList(int spc) {
        Iterator it = children.iterator();
        String temp = "";

        for(int i=0; i<spc; i++)
        {
            temp += " ";
        }

        temp += "- "+getName()+"\n";

        while(it.hasNext()) {
            BaseComponent comp = (BaseComponent) it.next();

            temp += comp.getList(spc+2);
        }

        return temp;
    }

    @Override
    public void showDetails() {
        if(role.equalsIgnoreCase("company"))
        {
            System.out.println(name);
        System.out.println(getComponentCount());
        }
        if(role.equalsIgnoreCase("project manager"))
        {
            System.out.println(name);
            System.out.println(currProj);
            System.out.println(getComponentCount());
        }


    }

    @Override
    public int getChildCount() {
        return children.size();
    }

    @Override
    public BaseComponent getChild(int ind)
    {
         return children.get(ind);
    }
    @Override
    public void addEntity(BaseComponent targetEntity) {
        children.add(targetEntity);
        return ;
    }

    @Override
    public void removeEntity(BaseComponent targetEntity) {
        children.remove(targetEntity);
        return ;
    }
}
