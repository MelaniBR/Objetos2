package tp8.Articulos;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<String> autoras;
	private List<String> filiacion;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autoras, List<String> filiacion, String tipoDeArticulo,
		String lugarDePublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autoras = autoras;
		this.filiacion = filiacion;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public Boolean fueEscritoPor(String autora) {
		return this.autoras.contains(autora);
	}

	public Boolean tieneFiliacion(String institucion) {
		return this.filiacion.contains(institucion);
	}

	public Boolean tienePalabraClave(String palabraClave) {
		return this.palabrasClave.contains(palabraClave);
	}

}
