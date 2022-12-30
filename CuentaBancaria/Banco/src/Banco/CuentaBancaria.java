package Banco;

public class CuentaBancaria {
	private int numeroCuenta;
	private double saldo;
	private Cliente cliente;

	public CuentaBancaria(Cliente cliente) {
		numeroCuenta = 0;
		saldo = 0;
		this.cliente = cliente;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 *	Esta función le añade una cantidad al saldo de la cuenta.
	 * @param cantidad en formato 0.00, la cantidad que se añade al saldo.
	 */
	public void añadirSaldo(double cantidad) {
		saldo += cantidad;
	}
	/**
	 * Esta función le resta una cantidad al saldo de la cuenta.
	 * @param cantidad en formato 0.00, la cantidad que se resta al saldo.
	 */
	public void retirarSaldo(double cantidad) {
		if (saldo - cantidad < 0) {
			System.out.println("No puedes retirar esta cantidad, porque tu cuenta quedaría en números rojos.");
		} else {
			saldo -= cantidad;
		}
	}

	@Override
	public String toString() {
		return String.format("Cliente=%s. \nNumero de cuenta: %s. \nSaldo: %s.]", cliente, numeroCuenta, saldo);
	}

}
