


public class HelloNeoBank {
	
	public static void main(String... params){

		Account accountNew = new Account();
		accountNew.number = "1233-1234-3453";
		accountNew.balance = 1_000_000d;

		Client eduardo = new Client();
		eduardo.name = "Eduardo";
		eduardo.account = accountNew;

		eduardo.printInfo();


	}

}


class Account {

   String number;
   Double balance;

}


class Client {

  String name;
  Account account;

  public void printInfo(){
  	System.out.println("Name: " + name);
  	System.out.println("Account number: " + account.number);
  	System.out.println("Account balance: " + account.balance);
  }

}
