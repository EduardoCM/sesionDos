package packageb;

public class Client {
	
  public String name;
  public Account account;

  public void confirmAccount(){
  	System.out.println("Name: " + name);
  	System.out.println("Account number: " + account.number);
  	System.out.println("Account balance: " + account.balance);
  }

}