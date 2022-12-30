package Banco;

public class testeo {
	public static void main(String[] args) {
		//Instancio un par de clientes.
		Cliente c1 = new Cliente("Kenny", 46, "12345678A");
		Cliente c2 = new Cliente("Lee", 34, "12345678B");
		//Instancio una cuenta.
		CuentaBancaria cb1 = new CuentaBancaria(c1);
		
		cb1.añadirSaldo(500); //Le añado saldo.
		System.out.println(cb1);

		cb1.retirarSaldo(100.45); //Le quito saldo.
		System.out.println(cb1);

		cb1.retirarSaldo(500); //Compruebo que no me permite dejar la cuenta en números rojos.
		System.out.println(cb1);
		System.out.println("test");
	}
}
