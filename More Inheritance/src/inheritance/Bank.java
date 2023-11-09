package inheritance;

import java.util.ArrayList;

public class Bank 
{
	ArrayList<Account> accounts;
	
	public Bank()
	{
		accounts = new ArrayList<Account>();
	}
	
	public void openAccount(Account a)
	{
		accounts.add(a);
	}
	
	public void closeAccount(int pos)
	{
		if(pos>=accounts.size())
		{
			System.err.println("Bank.closeAccount(...): "
			+"cannot have a non-negative odLimit.");
		}
		else
		accounts.remove(pos);
	}
	
	public Account getAccount(int pos)
	{
		if(pos>=accounts.size())
		{
			System.err.println("Bank.getAccount(...): "
			+"index " + pos + " out of bounds.");
			return null;
		}
		else
		return accounts.get(pos);
	}
	
	public int getTotalAccounts()
	{
		return accounts.size();
	}
	
	public void update()
	{
		for(int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i) instanceof SavingsAccount)
			{
				((SavingsAccount) accounts.get(i)).addInterest();
			}
			//checks to see if the currentaccount is overdrafted
			if(accounts.get(i) instanceof CurrentAccount && accounts.get(i).getBalance() < ((CurrentAccount) accounts.get(i)).getODLimit())
			{
				System.out.println("Sent overdraft notice letter to account " + accounts.get(i).getAccountNumber());
			}
		}
	}
	
	public String toString()
	{
		String returnString="";
		for(int i = 0; i < accounts.size(); i++)
		{
			if(i<accounts.size()-1)
			{
				returnString+= accounts.get(i).toString() + "\n";
			}
			else
			{
				returnString+= accounts.get(i).toString();
			}
		}
		return returnString;
	}
	
	public void payDividens(double dividen)
	{
		for(int i = 0; i < accounts.size(); i++)
		{
			accounts.get(i).deposit(dividen);
		}
	}
}
 