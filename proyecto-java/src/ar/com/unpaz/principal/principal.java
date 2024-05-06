package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.*;

public class principal extends Thread{

	public static void main(String[] args) {
		Proceso1 proceso1 = new Proceso1();
		Proceso2 proceso2 = new Proceso2();
			
		
		Thread hilo1 = new Thread();		
		hilo1 = proceso1;
		
		
		Thread hilo2 = new Thread();
		hilo2 = proceso2;		
		
		hilo1.start(); //impresion de string "primer parcial"
		hilo2.start(); //impresión de string "lectura txt"
	}

}
