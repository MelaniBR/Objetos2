package tp8.Articulos;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Suscriptor{
	private String nombre;
	private List<Interes> intereses;
	
	public Investigador(String nombre) {
		this.nombre = nombre;
		intereses = new ArrayList<Interes>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}
	
	public void eliminarInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	public void suscribirseASistema(SistemaDePublicaciones sistema) {
		sistema.registrar(this);;
	}
	
	public void desuscribirseDeSistema(SistemaDePublicaciones sistema) {
		sistema.eliminar(this);
	}
	
	
	
	
	public String llegoNuevoArticulo(Articulo articulo) {
		return "Esta disponible el siguiente articulo : " + articulo.getTitulo();
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return intereses.stream().anyMatch(interes -> interes.esDeInteres(articulo));
		
	};
	

	@Override
	public void update(Articulo articulo) {
			llegoNuevoArticulo(articulo);
	}

}
