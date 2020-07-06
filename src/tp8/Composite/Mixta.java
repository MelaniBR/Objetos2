package tp8.Composite;

import java.util.ArrayList;

public class Mixta implements PorcionProductiva {
	private ArrayList<PorcionProductiva> porcionesProductiva ;
	public Mixta() {
		this.porcionesProductiva = new ArrayList<PorcionProductiva>();
	}

	@Override
	public double gananciasAnuales() {
		return  this.porcionesProductiva.stream().mapToDouble(porcion -> porcion.gananciasAnuales()).sum();
	}

	
	public void addPorcionProductiva(PorcionProductiva porcion) {
		this.porcionesProductiva.add(porcion);
	}

	
	public void eliminarPorcionProductiva(PorcionProductiva porcion) {
		this.porcionesProductiva.remove(porcion);
		
	}



	


}
