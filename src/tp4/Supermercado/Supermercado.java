package tp4.Supermercado;



import java.util.ArrayList;

public class Supermercado {
private String nombre;
private String direccion;
private ArrayList <Producto> productos;

	public Supermercado(String string, String string2) {
		nombre = string;
		direccion=string;
		productos = new ArrayList();
	}

	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		
	}

	public Double getPrecioTotal() {
		double sumaTotal = 0;
		for (Producto p : productos) {
			sumaTotal += p.getPrecio();
		}
		return sumaTotal;
	}



}
