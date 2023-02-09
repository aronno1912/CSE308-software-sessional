package off1;

import java.util.List;

public class Pc2 implements Builder {

    Computer computer;
    int totalCost;
    String processorType;
    String coolerType;
    int processorPrice;
    int coolerPrice;
    int basePrice;

    Pc2()
    {    computer=new Computer();
        basePrice=70000;
        processorType="Intel Core i7";
        processorPrice=37000;
        coolerType="Liquid cooler";
        coolerPrice=17000;
        totalCost=0;
        initialSetUp();


    }

    private void initialSetUp()
    {
        totalCost=basePrice+processorPrice+coolerPrice;
        computer.add("Intel Corei7 PC");
        computer.add("The Base price is "+basePrice);
        computer.add("Its built-in parts are ");
        computer.add("Processor: "+processorType+"  Price: "+processorPrice );
        computer.add("Cooler: "+coolerType+"  Price: "+coolerPrice );
        computer.add("Initial Set up price is "+totalCost);

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
