package tp10.Cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;

	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	/*
	  Bad smell: extraer() se repetia codigo en las sub clases
	  Ahora cada subclase da su propia condicon en  puedeExtraer()
	  y el metodo extraer() es el mismo para todas. 
	 
	 */

	public void extraer(Integer monto) {
		if(this.puedeExtraer(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extraccion", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	public abstract boolean puedeExtraer(Integer monto);
	}