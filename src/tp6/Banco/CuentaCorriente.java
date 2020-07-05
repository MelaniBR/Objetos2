package tp6.Banco;

public class CuentaCorriente extends CuentaBancaria {
	// concrete class
	private double descubierto;

	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}
	public double getDescubierto() {
		return descubierto;
	}
	@Override
	public boolean cumplioRequisito(Double monto) {
		return this.getSaldo() + descubierto > monto;
	}

}
