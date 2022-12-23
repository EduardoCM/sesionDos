package packagea;

import javax.swing.JOptionPane;

import packageb.Account;
import packageb.Client;



public class MainNeoBank {
	

public static void main(String[] params){
	
	/**
	Account accountNew = new Account();
    accountNew.number = "234234";
    accountNew.balance = 1_000_000d;

	Client eduardo = new Client();
	eduardo.name = "Eduardo Castillo Mendoza";
    eduardo.account = accountNew;
    */

    Account accountNew = new Account();
    accountNew.number = JOptionPane.showInputDialog("Input your number account: ");
    accountNew.balance = 1_000_000d;

	Client eduardo = new Client();
	eduardo.name = JOptionPane.showInputDialog("Input your name: ");
    eduardo.account = accountNew;

		

   eduardo.confirmAccount();

}

}