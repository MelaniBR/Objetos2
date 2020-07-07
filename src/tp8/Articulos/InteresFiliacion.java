package tp8.Articulos;

public class InteresFiliacion implements Interes {
	private String institucion ;
	
	public InteresFiliacion(String institucion) {
		super();
		this.institucion = institucion;
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.tieneFiliacion(institucion);
	}

}
