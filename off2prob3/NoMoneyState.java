package off2prob3;

import java.util.Scanner;

public class NoMoneyState implements State{

    VendingMachine vendingMachine;
    Scanner scanner = new Scanner(System.in);
    public  NoMoneyState(VendingMachine vm)
    {
        vendingMachine=vm;
    }
    @Override
    public void insertMoney(int taka) {
        vendingMachine.currentMoney=taka;
        System.out.println("You have inserted "+taka);
        vendingMachine.setState(vendingMachine.getHasMoney());
        //vendingMachine.checkState();
        vendingMachine.getCurrentState().verifyAmount();
    }

    @Override
    public void verifyAmount() {

    }


    @Override
    public void machinePrompt() {
        if (vendingMachine.count != 0)
        {
            System.out.println("Please enter 10 taka to buy a product....For exit Press 0 : ");
           int x = scanner.nextInt();
            if (x == 0) {
            System.out.println("Thank you for being With us ");
            System.exit(0);
        }
            else
            {
            insertMoney(x);
            }
       }
        else
        {
            vendingMachine.setState(vendingMachine.getStockOut());
            vendingMachine.getCurrentState().machinePrompt();
        }
    }
}
