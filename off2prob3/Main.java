package off2prob3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("provide money...!!");
        //int money=scanner.nextInt();
        VendingMachine vm=new VendingMachine(15);
       // vm.insertMoney(money);
        vm.start();

    }
}
