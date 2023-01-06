

public class AccountStatus {

    {
    	System.out.println("This is Instance Initializer Block");
    }

    static {
    	System.out.println("This is a static initializer Block");
    }

    public AccountStatus(){
    	System.out.println("Constructor without arguments");
    }

    public AccountStatus(String client, String email){
    	System.out.println("Constructor with arguments");
    	this.client = client;
    	this.email = email;
    }

	public String client;

	public String email;


   public void sendAccountStatus(){
   	System.out.println(" account statement to: " + client + " sent by mail: " + email);
   }
    

	

}