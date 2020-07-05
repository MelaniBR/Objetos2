package tp6.Banco;

public class CuentaDeAhorro extends CuentaBancaria {
	// concrete class
	private int limite ;
	public CuentaDeAhorro(String titular , int limite) {
		super(titular);
		this.limite = limite ;
	}


	@Override
	public boolean cumplioRequisito(Double monto) {
		return this.getSaldo()>= monto && limite >= monto ;
	}
}
