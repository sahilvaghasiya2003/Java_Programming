import java.util.*;


class BankApplication{
 String name;
 String id;
 double prevtransaction;
 double balance;
 double amount;
    BankApplication(String name, String id){
        this.name=name;
        this.id=id;
    }
    void Deposit(double amount){
        this.amount = amount;
        if (amount > 0){
            balance += amount;
            prevtransaction = amount;

        }

    }
 void withdraw(double amount){
     this.amount = amount;
        if (amount>0 && amount <= balance){
            balance -= amount;
            prevtransaction = -amount;
        }
        else if(amount > balance) {
            System.out.println("Balance are not enough for your withdrawal");
        }
    }

    void previous_transaction(){
        if (prevtransaction > 0){
            System.out.println("Deposit money : "+ amount +"\n" + "totle balance : "+balance);
        } else if (prevtransaction < 0) {
            System.out.println("withdraw money : "+ amount +"\n" + "totle balance : "+balance);
        }
        else {
            System.out.println("no made transaction");
        }
    }

    void menu(){
    int choice = 0;
    Scanner m = new Scanner(System.in);
        System.out.println("Welcome "+name);
        System.out.println("Your ID: "+id);
        System.out.println("\n");
        System.out.println("1. check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. previous transaction");
        System.out.println("5. Exit");
    do{
//        System.out.println("*****************************************");
        System.out.println("enter your choice: ");
        choice = m.nextInt();
        System.out.println("\n");

        switch(choice){
            case 1:
                System.out.println("................................");
                System.out.println("balance : "+balance);
                System.out.println("................................");
                break;
            case 2:
                System.out.println("................................");
                System.out.println("Enter amount for deposit: ");
                double amt = m.nextDouble();
                Deposit(amt);
                System.out.println("................................");
                break;
            case 3:
                System.out.println("................................");
                System.out.println("Enter amount for withdraw: ");
                double Wamt = m.nextDouble();
                withdraw(Wamt);
                System.out.println("................................");
                break;
            case 4:
                System.out.println("................................");
//                System.out.println("previous transaction : "+prevtransaction);
                previous_transaction();
                System.out.println("................................");
                break;
            case 5:
                System.out.println("...........EXIT................");
                break;
            default:
                System.out.println("enter valid choice");
        }

    }while (choice!=5);
    }

}

public class Mini_project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name and id");
        String name = sc.nextLine();
        String id = sc.nextLine();
        BankApplication obj = new BankApplication(name , id);
        obj.menu();

    }
}
