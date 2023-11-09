package inheritance;

public class BankTestMain {

	public static void main(String[] args) 
	{
		Bank siliconValleyBank = new Bank();
		
		siliconValleyBank.openAccount(new SavingsAccount(445, 3));
		siliconValleyBank.openAccount(new CurrentAccount(12,-50));
		siliconValleyBank.openAccount(new Account(34));
		
		siliconValleyBank.getAccount(0).deposit(500);
		siliconValleyBank.getAccount(1).withdraw(64);
		siliconValleyBank.getAccount(2).deposit(23);
		
		System.out.println(siliconValleyBank);
		
		siliconValleyBank.update();
		
		System.out.println(siliconValleyBank);
		
		siliconValleyBank.payDividens(300);
		
		System.out.println(siliconValleyBank);
		
	}

}
