package tp7.Poquer;

import java.util.ArrayList;
import java.util.Collections;

public class PoquerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String jugada = "Nada";
		if (this.esPoquer(this.hacerListaDeNumeros(carta1, carta2, carta3, carta4, carta5), carta4, carta5)) {
			jugada = "Poquer";
		} else if (this.esTrio(this.hacerListaDeNumeros(carta1, carta2, carta3, carta4, carta5), carta3, carta4, carta5)){
			jugada = "Trio";
		} else if (this.esColor(this.hacerListaDeCartas(carta1, carta2, carta3, carta4, carta5) , carta1)) {
			jugada = "Color";
		} 
		return jugada;
	}

	private boolean esColor(ArrayList<Palo> lista, Carta carta1) {
		
		return  lista.stream().allMatch(p -> p.equals(carta1.getPalo()));
	}

	private boolean esTrio(ArrayList<Integer> lista, Carta carta3, Carta carta4, Carta carta5) {
		return Collections.frequency(lista,carta4.getValor()) >= 3 ||Collections.frequency(lista,carta3.getValor()) >= 3
				|| Collections.frequency(lista,carta5.getValor()) >= 3;
	}

	private boolean esPoquer(ArrayList<Integer>lista, Carta carta4, Carta carta5) {
		
		return Collections.frequency(lista,carta4.getValor()) >= 4 ||
				Collections.frequency(lista,carta5.getValor()) >= 4 ;
	}

	private ArrayList<Palo> hacerListaDeCartas(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Palo> lista = new ArrayList<Palo> ();
		lista.add(carta1.getPalo());
		lista.add(carta2.getPalo());
		lista.add(carta3.getPalo());
		lista.add(carta4.getPalo());
		lista.add(carta5.getPalo());
		return lista ;
	}
	private ArrayList<Integer> hacerListaDeNumeros (Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		/// preguntar si se puede pasar con la lista
		ArrayList<Integer> lista = new ArrayList<Integer> ();
		lista.add(carta1.getValor());
		lista.add(carta2.getValor());
		lista.add(carta3.getValor());
		lista.add(carta4.getValor());
		lista.add(carta5.getValor());
		return lista ;
	}
}
