package tp5;

public class CajaResgistradora {

	private Stock stock;
	private double montoTotal;
	

	public CajaResgistradora(Stock stock) {
				this.stock = stock ;
				montoTotal = 0d ;
	}

	public void registrar(Registrable registrable) {
			montoTotal += registrable.getPrecio();
			registrable.registrarPago(stock);
	}

	public double montoTotal() {
	
		return montoTotal;
	}
	
}
