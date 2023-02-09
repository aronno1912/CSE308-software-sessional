package off3prob3;

public interface BaseComponent {
    public String getName();

    public String getType();
    public  void showDetails() ;
    public void addComponent(BaseComponent comp);
    public void removeComponentFromHere(BaseComponent comp);
    public  void showHierarchy(int spc) ;

}
