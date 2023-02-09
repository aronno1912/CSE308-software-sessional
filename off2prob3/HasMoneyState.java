package off2prob3;

import java.util.Scanner;

public class HasMoneyState implements State{
    VendingMachine vendingMachine;
    Scanner scanner = new Scanner(System.in);
    //int currentMoney;
    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;

    }

    @Override
    public void insertMoney(int taka) {
        vendingMachine.currentMoney= vendingMachine.currentMoney+taka;
        verifyAmount();

    }

    @Override
    public void verifyAmount() {
        //System.out.println("Current balance is "+vendingMachine.currentMoney);
        if(vendingMachine.currentMoney==10)
        {
            //currentMoney=currentMoney-10;
            vendingMachine.currentMoney= vendingMachine.currentMoney-10;
            vendingMachine.setState(vendingMachine.getReleaseProduct());
            vendingMachine.getCurrentState().machinePrompt();
        }
        else if (vendingMachine.currentMoney>10)
        {
            //currentMoney=currentMoney-10;
            vendingMachine.currentMoney= vendingMachine.currentMoney-10;
            //releaseProduct();
            vendingMachine.setState(vendingMachine.getReleaseProduct());
            vendingMachine.getCurrentState().machinePrompt();
        }
        else if (vendingMachine.currentMoney<10)
        {
            vendingMachine.setState(vendingMachine.getHasMoney());
            moreMoneyNeeded();
        }


    }



    @Override
    public void machinePrompt() {
        if(vendingMachine.count!=0)
        verifyAmount();
        else
        {
            vendingMachine.setState(vendingMachine.getStockOut());
            vendingMachine.getCurrentState().machinePrompt();
        }

    }
    public void moreMoneyNeeded()
    {
        System.out.println("Current balance is  "+vendingMachine.currentMoney);
        System.out.println("Product price is 10 taka");
        System.out.println("Insert more money or press 0 to exit");
        System.out.println("Remember if you exit,you won't get back your current money");
        int x = scanner.nextInt();
        if(x == 0){
            System.out.println("Thank you for being with us ");
            System.exit(0);
        }else{
            insertMoney(x);
        }
    }
}
