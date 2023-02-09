package prob3;

public abstract class BaseComponent {
    private String name;
    private String role;
    private String currProject;
    private BaseComponent parent;

    public BaseComponent(String name, String role, BaseComponent parent) {
        this.name = name;
        this.role = role;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public BaseComponent getParent() {
        return parent;
    }



    public abstract int getComponentCount();
    public abstract String getList(int spc);

    public abstract void showDetails() ;

    public void addEntity(BaseComponent targetEntity) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void removeEntity(BaseComponent targetEntity) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public BaseComponent getChild(int ind) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public abstract int getChildCount();




}
