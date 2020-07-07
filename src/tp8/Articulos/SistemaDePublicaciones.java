package tp8.Articulos;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDePublicaciones {

	private List<Suscriptor> suscriptores;
	private List<Articulo> articulos;
	
	public SistemaDePublicaciones() {
		suscriptores = new LinkedList<Suscriptor>();
		articulos = new LinkedList<Articulo>();
	}
	
	public void registrar(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void publicar(Articulo articulo) {
		articulos.add(articulo);
		notificarSubscritores(articulo);
	}
	public void eliminar(Suscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}

	private void notificarSubscritores(Articulo articulo) {
		suscriptoresInteresados(articulo).stream().forEach(subscrito -> subscrito.update(articulo));;
		
	}
	
	private List<Suscriptor> suscriptoresInteresados(Articulo articulo) {
		return suscriptores.stream().filter(suscriptor -> suscriptor.esDeInteres(articulo)).collect(Collectors.toList());
		
	}
	

}
