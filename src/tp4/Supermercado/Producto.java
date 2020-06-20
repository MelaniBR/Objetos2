package tp4.Supermercado;



import java.util.function.BooleanSupplier;

public class Producto {
	protected String nombre ;
	protected double precio;
	protected boolean esPrecioCuidado = false;

	public Producto(String string, double d) {
		nombre = string;
		precio= d;
	}

	public Producto(String string, double d, boolean b) {
		// TODO Auto-generated constructor stub
		nombre = string;
		precio= d;
		esPrecioCuidado = b;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public boolean esPrecioCuidado() {
		// TODO Auto-generated method stub
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double d) {
		precio = precio + d;
		
	}

}
