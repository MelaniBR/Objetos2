package tp10.Cuenta;



public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	public boolean puedeExtraer(Integer monto) {
		return this.saldo >= monto;
	}

	
	
	


}
