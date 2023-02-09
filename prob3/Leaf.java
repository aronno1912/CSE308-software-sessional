package prob3;

public class Leaf extends BaseComponent{
    private String name,role,currProj;

    public Leaf(String name, String role, BaseComponent parent,String currProj) {
        super(name, role, parent);
        this.name=name;
        this.role=role;
        this.currProj=currProj;
    }

    @Override
    public int getComponentCount() {
        return 0;
    }

    @Override
    public String getList(int spc) {
        String temp = "";

        for(int i=0; i<spc; i++) {
            temp += " ";
        }

        return temp+">> "+getName()+"\n";
    }

    @Override
    public void showDetails() {
        System.out.println(name);
        System.out.println(currProj);

    }

    @Override
    public int getChildCount() {
        return 0;
    }
}
