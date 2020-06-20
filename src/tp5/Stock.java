package tp5;

import java.util.HashMap;
import java.util.Map;

public class Stock {
	private Map<Producto, Integer> stockDeProductos;
	
	public Stock() {
		stockDeProductos = new HashMap<Producto,Integer>();
	}
	
	public void descrementar(Producto producto) {
		Integer stockActualizado =  this.stockDe(producto) - 1;
		this.stockDeProductos.replace(producto, stockActualizado);
		
	}
	private int stockDe(Producto producto) {
		// TODO Auto-generated method stub
		return  this.stockDeProductos.get(producto);
	}
	
	
}
