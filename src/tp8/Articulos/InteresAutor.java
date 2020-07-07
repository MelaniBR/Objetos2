package tp8.Articulos;

public class InteresAutor implements Interes {
	private String autor ;
	
	public InteresAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.fueEscritoPor(autor);
	}

}
