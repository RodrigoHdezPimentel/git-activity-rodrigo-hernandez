package Practica_Cliente;

public class Hilo_Cliente extends Thread{
	private Cuenta_Bancaria cuenta;
	
	public void run() {
		cuenta.Ingresar(100);
	}
}
