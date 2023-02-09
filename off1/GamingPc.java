package off1;

import java.util.List;

public class GamingPc implements Builder {

    Computer computer;
    int totalCost;
    String processorType;
    //String coolerType;
    int processorPrice;
    //int coolerPrice;
    int basePrice;

    GamingPc()
    {    computer=new Computer();
        basePrice=70000;
        processorType=" AMD Ryzen 7 5700X";
        processorPrice=28000;

        totalCost=0;
        initialSetUp();


    }

    private void initialSetUp()
    {
        totalCost=basePrice+processorPrice;
        computer.add("Gaming PC");
        computer.add(String.format("The Base price is %s",basePrice));
        computer.add("Its built-in parts are ");
        computer.add(String.format("Processor: %s  Price: %s",processorType,processorPrice ));
        computer.add(String.format("Initial Set up price is %s",totalCost));


    }

    private void FinalSetUp()
    {
        computer.add("Total cost for building this pc is "+totalCost);
    }

    @Override
    public void addGraphicsCard(List <String> l) {
        //System.out.println(l);
        String str=l.get(0)+" Graphics Card is added "+",Price: "+l.get(1);
        computer.add(str);
        totalCost+=Integer.parseInt(l.get(1));

    }

    @Override
    public void addRAM(List <String> l) {
          String str=l.get(0)+" RAM is added "+",Price: "+l.get(1);
        computer.add(str);
        totalCost+=Integer.parseInt(l.get(1));

    }

    @Override
    public Computer getPc() {
        FinalSetUp();
        return computer;
    }
}
