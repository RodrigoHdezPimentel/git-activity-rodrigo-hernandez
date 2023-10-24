package Practica_Cliente;

public class Cuenta_Bancaria {
	private double saldo;
	private int numIngresos;
	private String registro = "";
	
	
	public synchronized void Ingresar(int cantidad) {
		saldo += cantidad;
		registro += "Saldo: " + saldo + "\n";
		numIngresos++;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public int getNumIngresos() {
		return numIngresos;
		
	}
}
