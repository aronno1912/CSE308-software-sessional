package off2prob3;

public class ReleaseProductState implements State{
    VendingMachine vendingMachine;
    public ReleaseProductState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int taka) {
        
    }

    @Override
    public void verifyAmount() {

    }



    @Override
    public void machinePrompt() {
        //vendingMachine.currentMoney=0;
        //System.out.println("release er vitore");
        //System.out.println("ekhon product ache "+vendingMachine.count);
        vendingMachine.count=vendingMachine.count-1;
        if(vendingMachine.count<0)
        {
            vendingMachine.setState(vendingMachine.getStockOut());
            vendingMachine.getCurrentState().machinePrompt();
        }
        else
        {     System.out.println("Here is your product!!!  Please collect it...!");
            System.out.println("The machine has currently "+vendingMachine.count+" more products");
            if(vendingMachine.currentMoney==0)
            {   //System.out.println("hereeeeeee1");
                vendingMachine.setState(vendingMachine.getNoMoney());
                vendingMachine.getCurrentState().machinePrompt();
            }
            else
            {
                //System.out.println("hereeeeeee");
                vendingMachine.setState(vendingMachine.getHasMoney());
               vendingMachine.getCurrentState().machinePrompt();
            }

            //System.out.println("release product er prompt");
        }

    }
}
