package off2prob3;

import java.util.Random;
import java.util.Scanner;

public class StockOutState implements State {
    private VendingMachine vendingMachine;
    Scanner scanner = new Scanner(System.in);
    public StockOutState(VendingMachine vendingMachine) {
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
        System.out.println("Sorry ,we are out of product...No more requests can be processed!!!");
        while(true){
            System.out.println("Press 0 to exit: ");

            int x = scanner.nextInt();
            if(x == 0)
                System.exit(0);
        }

    }
}
