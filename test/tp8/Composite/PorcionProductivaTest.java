package tp8.Composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PorcionProductivaTest {
	private Cultivo soja ;
	private Cultivo trigo ;
	private Pura puraTrigo ;
	private Pura puraSoja ; 
	private Mixta mixta ; 
	
	@BeforeEach 
	public void setUp(){
		soja = new Soja() ;
		trigo = new Trigo();
		puraTrigo = new Pura(trigo);
		puraSoja = new Pura(soja);
		mixta = new Mixta();
				}
	
	
	@Test
	void ganaciasAnualesSojaYTrigo() {
		assertTrue(trigo.gananciasAnuales() == 75);
		assertTrue(soja.gananciasAnuales()==125);
	}
	@Test
	void ganaciasAnualesPuraSojaYTrig() { 
		assertTrue(puraSoja.gananciasAnuales() == 500);
		assertTrue(puraTrigo.gananciasAnuales()==300);
	}
	@Test
	void ganaciasAnualesMixta() { 
		mixta.addPorcionProductiva(soja);
		mixta.addPorcionProductiva(trigo);
		mixta.addPorcionProductiva(puraSoja);
		mixta.addPorcionProductiva(puraTrigo);
		
		
		
		
		assertTrue(mixta.gananciasAnuales() == 1000);
	}

}
