package tp9.VideoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideoJuegoTest {
	
		private MaquinaDeVideoJuego maquina;
		
		@BeforeEach
		public void setUp() {
			maquina = new MaquinaDeVideoJuego();
		}

		@Test
		void testMaquinaSeCreaConEstadoInicial() {
			
			
			assertEquals("Ingrese Fichas Para Comenzar! ", maquina.inicio());
		}
		
		@Test
		void testMaquinaIngresaUnaMonedaEIniciaJuegoDeUnaPersona() {
			maquina.agregarFicha();
			
			
			
			assertEquals("Juega un jugador", maquina.inicio());
		}
		
		
		
		@Test
		void jueganDosJugadores() {
			maquina.agregarFicha();
			maquina.agregarFicha();
			
			assertTrue (maquina.getCantFichas() == 2);
			assertEquals("Juegan dos Jugadores",  maquina.inicio());
		}
		
		@Test
		void testTerminoElJuego() {
			maquina.agregarFicha();
			maquina.agregarFicha();
			
			
			maquina.terminarJuego();
			
			assertEquals("Ingrese Fichas Para Comenzar! ",  maquina.inicio());
		}

	
}
