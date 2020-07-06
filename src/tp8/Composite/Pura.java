package tp8.Composite;

public class Pura implements PorcionProductiva{
	private Cultivo cultivo ;

	public Pura(Cultivo cultivo) {
		super();
		this.cultivo = cultivo;
	} 
	public double gananciasAnuales() {
		return cultivo.gananciasAnuales() * 4 ;
	}
	public Cultivo getCultivo(){
		return cultivo ;
	}
}
