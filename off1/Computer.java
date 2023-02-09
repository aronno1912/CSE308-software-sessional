package off1;

import java.util.LinkedList;

public class Computer {
   LinkedList<String> allParts;
   public Computer(){allParts=new LinkedList <String>();}
    public void add(String newPart){allParts.add(newPart);}
    public void dispaly()
    {
       for(String str:allParts)
       {
           System.out.println(str);
       }
    }

}
