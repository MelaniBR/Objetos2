package tp8.Articulos;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

class ArticuloTest {

	Investigador investigador1;
	Investigador investigador2;
	Articulo articulo1;
	Articulo articulo2;
	SistemaDePublicaciones sistema;
	InteresAutor autores;
	InteresFiliacion filiacion;
	InteresLugarDePublicacion lugarDePublicacion;
	InteresPalabrasClaves palabrasClaves;
	InteresTipo tipo;
	InteresTitulo titulo;
	String smalltalks = "Smalltalks" ;
	
	@BeforeEach
	void setUp(){
		sistema = new SistemaDePublicaciones();
		articulo1 = mock(Articulo.class);
		articulo2 = mock(Articulo.class);
		lugarDePublicacion = new InteresLugarDePublicacion( smalltalks);
		investigador1 = new Investigador("");
		sistema.registrar(investigador1);
		
	}

	@Test
	void testEsDeInteresLugarDePublicacion() {
		investigador1.agregarInteres(lugarDePublicacion);
		when(articulo1.getLugarDePublicacion()).thenReturn(smalltalks);
		assertTrue(investigador1.esDeInteres(articulo1));
		

	}
	@Test
	void testNoEsDeInteresLugarDePublicacion() {
		investigador1.agregarInteres(lugarDePublicacion);
		when(articulo1.getLugarDePublicacion()).thenReturn("UNQ");
		assertFalse(investigador1.esDeInteres(articulo1));
		

	}
}
