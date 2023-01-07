package clase6;



public class CreatorMain {

	public static void main(String [] args){

		System.out.println("Inicia generador de nominas");

		String banco = args[0];
		String sucursal = args[1];

		CreadorNominas creador = new CreadorNominas();
		
		creador.solicitarNomina(banco, sucursal);

		System.out.println("Finaliza generador de nominas");

	}

}