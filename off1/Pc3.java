package off1;

import java.util.List;

public class Pc3 implements Builder{

    Computer computer;
    int totalCost;
    String processorType;
    //String coolerType;
    int processorPrice;
    //int coolerPrice;
    String item;
    int itemPrice;
    int basePrice;

    Pc3()
    {    computer=new Computer();
        basePrice=70000;
        processorType="Intel Core i9";
        processorPrice=65000;
        item="DVD drive";
        itemPrice=6000;
        totalCost=0;
        initialSetUp();


    }

    private void initialSetUp()
    {
        totalCost=basePrice+processorPrice+itemPrice;
        computer.add("Intel Corei9 PC");
        computer.add("The Base price is "+basePrice);
        computer.add("Its built-in parts are ");
        computer.add("Processor: "+processorType+"  Price: "+processorPrice );

        computer.add(item+" Price: "+itemPrice );
        computer.add(String.format("Initial Set up price is "+totalCost));


    }

    private void FinalSetUp()
    {
        computer.add("Total cost for building this pc is "+totalCost);
    }

    @Override
    public void addGraphicsCard(List <String> l) {
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
