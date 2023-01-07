package main;


import business.CuentaNominaWrapperClass;
import business.CuentaNomina;
import java.util.Date;


public class TiposDatosPrimitivosMain {

	public static void main(String args[]){

	CuentaNomina cuentaNominaNueva = new CuentaNomina();
        

        //System.out.println("Datos Primitivos : "cuentaNominaNueva);


        CuentaNomina cuentaNominaPrimitivos = new CuentaNomina();
        System.out.println("Primitivos: " + cuentaNominaPrimitivos);


        CuentaNominaWrapperClass cuentaNominaWrapperClass = new CuentaNominaWrapperClass();
        
        cuentaNominaWrapperClass.isActive = true;
        cuentaNominaWrapperClass.age = 40;
        cuentaNominaWrapperClass.gender = 'M';
        cuentaNominaWrapperClass.employeeNumber = 4356;
        cuentaNominaWrapperClass.contractNumber = 34523;
        cuentaNominaWrapperClass.serialNumber= 2342342L;
        cuentaNominaWrapperClass.salary=120000.5f;
        cuentaNominaWrapperClass.deposits=0d;
        cuentaNominaWrapperClass.name="Edgar Garcia Aguilar";
        cuentaNominaWrapperClass.hiringDate= new Date();


        System.out.println("WraperClass: " + cuentaNominaWrapperClass);


	}

}