package clase6;

import javax.swing.JOptionPane;
import java.util.Date;

import business.CuentaNomina;

public class CreadorNominas {

	public String banco;

	public String sucursal;
	

	public void solicitarNomina(String banco, String sucursal){
        //"Space Money"
        this.banco = banco;
        //"Saturno"
        this.sucursal = sucursal;

       CuentaNomina nuevaCuentaNomina = this.crearCuentaNomina();
       System.out.println("Nueva cuenta de Nomina creada de forma exitosa");
	   System.out.println("Info cuenta: " + nuevaCuentaNomina);
	}

	public CuentaNomina crearCuentaNomina(){
		System.out.println("Creando Nomina en el banco: " + banco);
		System.out.println("En la sucursal: " + sucursal);

        String nameInput = JOptionPane.showInputDialog("Ingresa el nombre del nuevo socio");
		String ageInput = JOptionPane.showInputDialog("Ingresa la edad de " + nameInput);
		String genderInput = JOptionPane.showInputDialog("Ingera el genero de " + nameInput);
		String employeeNumberInput = JOptionPane.showInputDialog("Ingera el numero de empleado de " + nameInput);
		String contractNumberInput = JOptionPane.showInputDialog("Ingera el numero de contrado de " + nameInput);
		String salaryInput = JOptionPane.showInputDialog("Ingera el salario " + nameInput);

		String name = nameInput;
		byte age = Byte.parseByte(ageInput);
		char gender = genderInput.charAt(0);
		short employeeNumber = Short.parseShort(employeeNumberInput);
		int contractNumber = Integer.parseInt(contractNumberInput);
		float salary = Float.parseFloat(salaryInput);

        this.validacionesBanco(name);
        this.validacionesSucursal(name);
        
        CuentaNomina nuevaCuentaNomina = new CuentaNomina();
        
        nuevaCuentaNomina.name = name;
		nuevaCuentaNomina.isActive = false;
		nuevaCuentaNomina.age = age;
		nuevaCuentaNomina.gender = gender;
		nuevaCuentaNomina.employeeNumber = employeeNumber;
		nuevaCuentaNomina.contractNumber = contractNumber;
		nuevaCuentaNomina.salary = salary;
		nuevaCuentaNomina.hiringDate = new Date();
		nuevaCuentaNomina.banco = banco;
		nuevaCuentaNomina.sucursal = sucursal;

		return nuevaCuentaNomina;
	}

    public void validacionesBanco(String name){
    	System.out.println("Realizando validaciones en banco: " + banco);
    	System.out.println("Para el cliente: " + name);
    }

    public void validacionesSucursal(String name){
    	System.out.println("Realizando validaciones en la sucursal: " + sucursal);
    	System.out.println("Para el cliente: " + name);
    }


}