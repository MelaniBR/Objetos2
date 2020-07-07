package tp8.Articulos;

public class InteresPalabrasClaves implements Interes {

	private String palabraClave;

	public InteresPalabrasClaves(String palabraClave) {
		super();
		this.palabraClave = palabraClave;
	}

	

	public String getPalabraClave() {
		return palabraClave;
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.tienePalabraClave(palabraClave);
	}

}
