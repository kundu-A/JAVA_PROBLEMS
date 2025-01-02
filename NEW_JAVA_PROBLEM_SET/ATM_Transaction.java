import java.util.*;
interface ATM{
    public double withdraw(double amount);
    public double deposite(double amount);
    public void checkBalance(double amount);
}
class ATM_Interface implements ATM{

    Scanner sc=new Scanner(System.in);

    @Override
    public double withdraw(double amount) {
        checkBalance(amount);
        System.out.println("Please enter the amount which you want to withdrwal: ");
        int money=sc.nextInt();
        if(money<amount){
            amount=amount-money;
            System.out.println("Money WithDrwal Successfully!!");
        }
        else
            System.out.println("Please enter a valid amount!!");
        return amount;
    }

    @Override
    public double deposite(double amount) {
        checkBalance(amount);
        System.out.println("Please enter the amount which you want to deposite: ");
        int money=sc.nextInt();
        amount=amount+money;
        System.out.println("Amount deposited successfully!!");
        return amount;
    }

    @Override
    public void checkBalance(double amount) {
        System.out.println("Your Currect Balance = "+amount);
    }

}
public class ATM_Transaction {
    public static void main(String[] args) {
        double amount=0;
        int cont=0;
        Scanner sc=new Scanner(System.in);
        ATM_Interface obj=new ATM_Interface();
        do{
            System.out.println("Press 1 to check balance\nPress 2 to deposite money\nPress 3 to withdrwal money\nPress 4 to Exit from the Transaction: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: obj.checkBalance(amount);
                        break;
                case 2: amount=obj.deposite(amount);
                        break;
                case 3: amount=obj.withdraw(amount);
                        break;
                case 4: System.exit(0);
                        break;
                default: System.out.println("Please enter the Correct choice!!!");
                    break;
            }
            System.out.println("Please enter 1 to continue operations otherwise 0: ");
            cont=sc.nextInt();
        } while (cont==1);
        sc.close();
    }
}
