package tp4.Supermercado;


public class ProductoPrimeraNecesidad extends Producto {

private double descuento;

	
	public ProductoPrimeraNecesidad(String string, double p, boolean b,double d) {
		super(string, p, b);
		descuento = d ;
	}
		@Override 
	public Double getPrecio() {
		return precio = precio - precio* descuento/ 100 ;
	}
}
