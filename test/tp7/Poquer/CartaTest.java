package tp7.Poquer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class CartaTest {

	private Carta carta1;
	private Carta carta2 ; 
	private Palo palo ;
	@BeforeEach
	public void setUp() {
		carta1 = new Carta(4,palo.CORAZON );
		carta2 = mock(Carta.class);
	}
	@Test
	void cartaTest() {
		assertEquals (carta1.getPalo() , palo.CORAZON);
		assertEquals (carta1.getValor(),4);
	}
	
	
	@Test
	
	void tieneElMismoPalo() {
		when(carta2.getPalo()).thenReturn(palo.CORAZON);
		assertTrue(carta1.tieneElMismoPalo(carta2));
	}
	@Test
	void noTieneElMismoPalo() {
		when(carta2.getPalo()).thenReturn(palo.PICAS);
		assertFalse(carta1.tieneElMismoPalo(carta2));
	}
	@Test
	void noEsSuperior() {
		when(carta2.getValor()).thenReturn(5);
		assertFalse(carta1.esSuperiorAOtra(carta2));
	}
	void esSuperior() {
		when(carta2.getValor()).thenReturn(3);
		assertTrue(carta1.esSuperiorAOtra(carta2));
	}

}
