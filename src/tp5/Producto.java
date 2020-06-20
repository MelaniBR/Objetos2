package tp5;

public abstract class Producto implements Registrable {
	protected double precio ;
	
	protected  String nombre ;
	public Producto(double precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}	
	@Override
	public void registrarPago(Stock stock) {
			stock.descrementar(this);
	}
}
