package tp7.Poquer;

import java.util.function.BooleanSupplier;

public class Carta {
	private Palo palo ;
	private int valor ;

	public Carta(int i, Palo palo) {
		valor = i;
		this.palo = palo ;
	}

	public Palo getPalo() {
		return palo;
	}

	public Integer getValor() {
		return valor ;
	}

	public Boolean tieneElMismoPalo(Carta carta) {
		return palo == carta.getPalo();
	}

	public Boolean esSuperiorAOtra(Carta carta) {
		return valor > carta.getValor();
	}

}
