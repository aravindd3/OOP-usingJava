import java.util.Scanner;
import java.util.HashMap;
 class handle {
    double balance;
    String accno;
    public handle(double b,String a)
    {
        this.balance=b;
        this.accno=a;
    }
    public void balance()
    {
        System.out.println("The acoount balance of acc no. "+accno+" is "+balance);
    }
    public void withdraw(double w)
    {
        if(w>balance)
        {
            System.out.println("Insufficient account balance");
        }
        else
        {
            balance-=w;
            System.out.println("Successfully withdarwn");
            balance();
        }
    }
    public void deposit(double d)
    {
        balance+=d;
        System.out.println("Succesfully deposited");
        balance();
    }

    
}


public class Bank
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Double> account=new HashMap<>();
        account.put("1001",5900.0);
        System.out.println("enter the account number");
        String inp=sc.nextLine();
        if(!account.containsKey(inp))
        {
            System.out.println("Invalid account number!");
            return;
        }
        
        
        handle obj=new handle(account.get(inp),inp);
        System.out.println("Account accessed succesfully");
        
        while(true)
        {
        System.out.println("enter 1 for checking account balance");
        System.out.println("enter 2 for withdrawing money");
        System.out.println("enter 3 for depositing money");
        System.out.println("Enter 4 to exit");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            obj.balance();
                break;
        
            case 2:
            System.out.println("Please enter the anount to be withdrawn.");
            double z=sc.nextDouble();
            obj.withdraw(z);
                break;
            
            case 3:
            System.out.println("Please enter the amount to be deposited.");
            double v=sc.nextDouble();
            obj.deposit(v);
            break;

            case 4:
            System.out.println("Exited Succesfully,Thankyou!");
            return;

            default:
            System.out.println("Please enter a correct choice.");
        }
    }
    }
}
