package tp5;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaResgistradoraProductosTestTest{
	private CajaResgistradora caja ;
	private ProductoTradicional arroz ; 
	private ProductoCoperativa salsaTomate ; 
	private Stock stock ;
	
	@BeforeEach
	public void setUp() {
		stock = mock(Stock.class);
		caja = new CajaResgistradora (stock) ; 
		arroz = mock(ProductoTradicional.class);
		salsaTomate = new ProductoCoperativa(20d ,"SalsaTomate") ; 
	
	
	
	}
	@Test
	public void TestDeMontoTontal() {
		when(arroz.getPrecio()).thenReturn(25d);
		doNothing().when(stock).descrementar(arroz);
		doNothing().when(stock).descrementar(salsaTomate);
		caja.registrar(arroz);
		caja.registrar(salsaTomate);
		assertEquals(caja.montoTotal(),43d);
		assertEquals(salsaTomate.getPrecio(),18);
	}

}