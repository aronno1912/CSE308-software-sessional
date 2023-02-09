package off1;

import java.util.List;

public class Pc1 implements Builder
    {
     Computer computer;
     int totalCost;
     String processorType;
     String coolerType;
     int processorPrice;
     int coolerPrice;
     int basePrice;

     Pc1()
     {    computer=new Computer();
         basePrice=70000;
         processorType="Intel Core i5";
         processorPrice=20000;
         coolerType="CPU cooler";
         coolerPrice=36000;
         totalCost=0;
         initialSetUp();


     }

     private void initialSetUp()
     {
         totalCost=basePrice+processorPrice+coolerPrice;
         computer.add("Intel Corei5 PC");
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

     // l is a list where 1st parameter is the name of the item and 2nd parameter is the price
    @Override
    public void addGraphicsCard(List <String> l) {
        String str=l.get(0)+" Graphics Card is added "+",Price: "+l.get(1);
        computer.add(str);
        totalCost+=Integer.parseInt(l.get(1));

    }

        // l is a list where 1st parameter is the name of the item and 2nd parameter is the price
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
