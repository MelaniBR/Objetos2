package tp5;

public class ProductoCoperativa extends Producto {

	public ProductoCoperativa(double precio, String nombre) {
		super(precio, nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPrecio() {
		return precio * 0.9d ; 
	}
}
