package ATM;
import java.util.Scanner;
class ATM_go
{
double bal;
int passkey;

public  ATM_go(double initialbal)
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
	System.out.println("Please enter your pin");
	passkey=in.nextInt();
	if(num==passkey)

		return true;
				
	else
		return false;
	
}




}
public class ATM
{
public static void main (String[] args)
	{ 
	ATM_go a = new ATM_go(1000);
	
	// Create an ATM object with an initial balance of $1000
	int pin,confirmPin,num,repeater;
	boolean result;
	
	Scanner scanner = new Scanner(System.in);
	
	boolean isRunning = true;
	
	do
	{
	System.out.println("Please create your pin");
	pin = scanner.nextInt();
	
	System.out.println("Please confirm your pin");
	confirmPin = scanner.nextInt();
	}
	while (pin!=confirmPin);
	
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
            	
            	result = a.mypin(pin);
            	if (result)
            		{
            	
            	a.get_balance();
                break;
            	}
            	
            	else 
            	{
            		System.out.println("Wrong pin please try again");
            		
            	}
            	
            	
            	
            
            	
            }
				case 2->
				{
               	System.out.println("Enter the deposit amount: $");
                double depositAmount = scanner.nextDouble();
                result = a.mypin(pin);
                if (result) 
                {

                a.Setdeposit(depositAmount);
                break;
               }
               else 
           		{System.out.println("Wrong pin please try again");
           		}
                
				}
            case 3->
            {
            	
            	System.out.println("Enter the withdrawal amount: $");
                double withdrawalAmount = scanner.nextDouble();
                result = a.mypin(pin);
                if (result)
            	{
                a.setWithdraw(withdrawalAmount);
                break;
            	}
            	else 
            		{System.out.println("Wrong pin please try again");
            		}
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
}
			

