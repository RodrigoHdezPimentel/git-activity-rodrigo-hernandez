package Practica_Cliente;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cuenta_Bancaria cb = new Cuenta_Bancaria();
		
		ArrayList<Hilo_Cliente> clientes = new ArrayList<Hilo_Cliente>();
		
		for(int x = 0; x < 25; x++) {
			Hilo_Cliente cliente = new Hilo_Cliente(cb);
			clientes.add(cliente);
			cliente.start();
		}
		try {
			for(int x = 0; x < 25; x++) {
				clientes.get(x).join();
			}
		}catch (InterruptedException e) {
		}
		System.out.println(cb.getSaldo());
		System.out.println(cb.getRegistro());
		System.out.println(cb.getNumIngresos());
	}

}
