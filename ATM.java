package ATM;
import java.util.Scanner;
class myATM
{
double bal;
int passkey,count;
boolean confirmpin;

public  myATM(double initialbal)
{
	bal=initialbal;
	}
public void get_balance()
{
	System.out.println("The balance is\t"+bal);
}
public void Setdeposit(double amount)

{
bal+=amount;
System.out.println("The balance is\t"+bal);
}
public void setWithdraw(double amount)
{
	if(amount<=bal) {
		bal-=amount;
		//get_balance();
	}
	else {
				System.out.println("Insufficient balance for withrawal.");
		 }
	}


public boolean mypin(int num)
{
	Scanner in = new Scanner(System.in);
	do
	{
	System.out.println("Please enter your pin to access your ATM");
	passkey=in.nextInt();
	if(num==passkey)
	{  confirmpin=true;
		return confirmpin;
	}			
	else
	{
		System.out.println("Wrong Pin. Please try again!");
		count++	;
	}
	
	}
	while(count<3);
	return false;
}



}


public class ATM
{
public static void main (String[] args)
	{ 
	
	int pin = 1234;
	
	myATM a = new myATM(1000);
	// Create an ATM object with an initial balance of $1000
	int num,repeater,count;
	boolean result;
	
	Scanner scanner = new Scanner(System.in);
	
	boolean isRunning = true;
	count=0;
	
	
	if (a.mypin(pin))
	{
	
    while (isRunning) {
    	
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Make a Deposit");
        System.out.println("3. Make a Withdrawal");
        System.out.println("4. Exit");
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1->
            {
            	
            	a.get_balance();
                break;
            	}
            	
				case 2->
				{
               	System.out.println("Enter the deposit amount: $");
                double depositAmount = scanner.nextDouble();
               
                a.Setdeposit(depositAmount);
                break;
               }
              
            case 3->
            {
            	
            	System.out.println("Enter the withdrawal amount: $");
                double withdrawalAmount = scanner.nextDouble();
               
                a.setWithdraw(withdrawalAmount);
                break;
            	}
            	
        	case 4->
        	{
        		isRunning = false;
        	
                System.out.println("Thank you for using the ATM. Your card will now be ejected");
        	}    
            
        	default->
                System.out.println("Invalid choice. Please select 1-4.");
	
	 }
		
}
	}
	else
	{
		System.out.println("You have entered wrong pin maximum number of times. Your card has been blocked. To unblock, contact customer care.");
	}
	}
}		

