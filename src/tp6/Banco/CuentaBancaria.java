package tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	// abstract class

	private String titular;
	private double saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	// operacion concreta
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarMovimientos(String string) {
		this.movimientos.add(string);
	}

	/// operacion primitiva
	public abstract boolean cumplioRequisito(Double monto);

	public void extraer(double monto) {
		// template method
		if (this.cumplioRequisito(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}

}
