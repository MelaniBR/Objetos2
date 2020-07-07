package tp8.Articulos;

public class InteresTitulo {
private String titulo;
	
	public InteresTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean verificar(Articulo articulo) {
		return titulo.equals(articulo.getTitulo());
	}
	
	public String getTitulo() {
		return titulo;
	}
}
