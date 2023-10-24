package Practica_Cliente;

public class Hilo_Cliente extends Thread{
	private Cuenta_Bancaria cuenta;

	public Hilo_Cliente(Cuenta_Bancaria cuenta) {
       		this.cuenta = cuenta;
        }

	public void run() {
		cuenta.Ingresar(100);
	}
}
