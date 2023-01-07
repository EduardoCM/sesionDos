package main;

import javax.swing.JOptionPane;

import business.Account;
import business.Client;

import business.CuentaNomina;
import business.CuentaNominaWrapper;

import java.util.Date;


public class MainNeoBanks {

	public static void main(String params[]){
     
     CuentaNomina nuevaCuenta = new CuentaNomina();

     nuevaCuenta.isActiva = true;
     nuevaCuenta.edad = 40;
     nuevaCuenta.gender = 'M';
     nuevaCuenta.employeNumber = 30000;
     nuevaCuenta.contractNumber = 23423442;
     nuevaCuenta.serialNumber= 234234234;
     nuevaCuenta.salary = 120_000f;
     nuevaCuenta.deposits = 0;
     nuevaCuenta.withDrawals = 0;

     nuevaCuenta.name = "Edgar Garcia Aguilar";
     nuevaCuenta.hiringDate = new Date();

     System.out.println(nuevaCuenta);

     CuentaNomina segundaCuenta = new CuentaNomina();

     System.out.println("Segunda Cuenta: " + segundaCuenta);


     CuentaNominaWrapper cuentaWrapper = new CuentaNominaWrapper();

     System.out.println("Wrapper Class: " + cuentaWrapper);




	}


}
