package tp9.ReproductorMP3;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ReproductorMP3Test {
	private ReproductorMP3 reproductor;
	private Song cancion;

	@BeforeEach
	public void setUp() {
		reproductor = new ReproductorMP3();
		cancion = mock(Song.class);
		reproductor.seleccionarCancion(cancion);
	}

	@Test
	void SeleccionDeCancionPlay() throws Exception {
		reproductor.play();
		verify(cancion).play();

	}

	@Test
	void SeleccionDeCancionPause() throws Exception {

		Exception exception = Assertions.assertThrows(Exception.class, () -> {
			reproductor.pause();
		});
		assertEquals("No hay ninguna cancion reproducciendo", exception.getMessage());

	}

	@Test
	void ReproduciendoPlay() throws Exception {
		reproductor.play();
		Exception exception = Assertions.assertThrows(Exception.class, () -> {
			reproductor.play();
		});
		assertEquals("La cancion se esta reproducciendo", exception.getMessage());

	}
	@Test
	void ReproduciendoPause() throws Exception {
		reproductor.play();
		reproductor.pause();
		verify(cancion).pause();

	}
	@Test
	void ReproduciendoStop() throws Exception {
		reproductor.play();
		reproductor.stop();
		verify(cancion).stop();

	}
	@Test
	void PausaStop() throws Exception {
		reproductor.play();
		reproductor.pause();
		reproductor.stop();
		verify(cancion).stop();

	}
	@Test
	void PausaPause() throws Exception {
		reproductor.play(); // first
		reproductor.pause();
		reproductor.pause(); // two
		verify(cancion,times(2)).play();

	}
	@Test
	void PausaPlay() throws Exception {
		reproductor.play();
		reproductor.pause();
		Exception exception = Assertions.assertThrows(Exception.class, () -> {
			reproductor.play();
		});
		assertEquals("La cancion no se puede reproducir", exception.getMessage());


	}
}
