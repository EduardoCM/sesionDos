

public class RequestAccountStatement {


	public static void main(String[] args) {

		System.out.println("Inicia envio de estados de cuenta");

		AccountStatus accountStatus1 = new AccountStatus("Eduardo Castillo Mendoza", "ecastillo@codigorupestre.org");
		//accountStatus1.email = "ecastillo@codigorupestre.org";
		accountStatus1.sendAccountStatus();

        AccountStatus accountStatus2 = new AccountStatus("Juan Antonio Bermúdez García", "juan_antonio_bermudez@codigorupestre.org");
		//accountStatus2.email = "juan_antonio_bermudez@codigorupestre.org";
		accountStatus2.sendAccountStatus();

		AccountStatus accountStatus3 = new AccountStatus("Edgar Garcia Aguilar", "edgar_garcia@codigorupestre.org");
		//accountStatus3.email = "edgar_garcia@codigorupestre.org";
		accountStatus3.sendAccountStatus();


		System.out.println("Finaliza Envio de estados de cuenta");
	}
	
}