package tp7.Poquer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerStatusTest {

	private PoquerStatus ps;
	private Carta carta1;
	private Carta carta2 ;
	private Carta carta3 ;
	private Carta carta4 ;
	private Carta carta5 ;
	@BeforeEach
	public void setUp() {
		ps = new PoquerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	@Test
	void hizoPoquer() {
		when(carta1.getValor()).thenReturn(4);
		when(carta2.getValor()).thenReturn(5);
		assertEquals (ps.verificar(carta1,carta1,carta1,carta1,carta2),"Poquer");
	}
	@Test
	void hizoTrio() {
		when(carta1.getValor()).thenReturn(4);
		when(carta2.getValor()).thenReturn(5);
		assertEquals (ps.verificar(carta1,carta1,carta1,carta2,carta2),"Trio");
	}
	@Test
	void hizoColor() {
		when(carta1.getPalo()).thenReturn(Palo.CORAZON);
		when(carta2.getPalo()).thenReturn(Palo.CORAZON);
		when(carta3.getPalo()).thenReturn(Palo.CORAZON);
		when(carta4.getPalo()).thenReturn(Palo.CORAZON);
		when(carta5.getPalo()).thenReturn(Palo.CORAZON);
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(2);
		when(carta3.getValor()).thenReturn(4);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(4);
		
		assertEquals (ps.verificar(carta1,carta2,carta3,carta4,carta5),"Color");
		
	}
	@Test
	void noHizoNada() {
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE);
		when(carta2.getPalo()).thenReturn(Palo.CORAZON);
		when(carta3.getPalo()).thenReturn(Palo.CORAZON);
		when(carta4.getPalo()).thenReturn(Palo.CORAZON);
		when(carta5.getPalo()).thenReturn(Palo.CORAZON);
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(2);
		when(carta3.getValor()).thenReturn(4);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(4);
		
		assertEquals (ps.verificar(carta1,carta2,carta3,carta4,carta5),"Nada");
}}
