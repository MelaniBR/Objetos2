package tp4.Trabjador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.Trabajador.*;


public class ImpuestoTest {

	private Trabajador trabajador;
	private Ingreso ingresoDeEnero;
	private Ingreso ingresoDeFebrero;
	private IngresoPorHorasExtras ingresoDeFHorasExtras;
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoDeEnero = new Ingreso(1,"trabajo",new Double(35000));
		ingresoDeFebrero = new Ingreso(2,"trabajo", new Double(35000));
		ingresoDeFHorasExtras = new IngresoPorHorasExtras(2,"Horas Extras",new Double(5000),5);
		
		
	}
	@Test
	public void testTotalPercibido() {
		// No hay ingreso en el Trabajador 
		assertEquals(0, trabajador.getTotalPercibido());
		// Se Agrega el ingreso de Enero
		trabajador.agregarIngreso(ingresoDeEnero);
		assertEquals(new Double(35000), trabajador.getTotalPercibido());
		// SeAgrega el Ingreso de Febrero 
		trabajador.agregarIngreso(ingresoDeFebrero);
		assertEquals(new Double(70000), trabajador.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		// No hay Monto Imponible
		assertEquals(0, trabajador.getMontoImponible());
		// El monto Imponible para horas extras es 0
		trabajador.agregarIngreso(ingresoDeFHorasExtras);
		assertEquals(0, trabajador.getMontoImponible());
		// El monto imponible del Ingreso de Enero 
		trabajador.agregarIngreso(ingresoDeEnero);
		assertEquals(new Double(35000), trabajador.getMontoImponible());
	}
	@Test
	public void testImpuestoAPagar() {
		// Impuesto a pagar es 0 , no hay impuesto para horas Extras
		trabajador.agregarIngreso(ingresoDeFHorasExtras);
		assertEquals(0, trabajador.getImpuestoAPagar());
		// El impuesto a pagar del Ingreso de Enero 
		trabajador.agregarIngreso(ingresoDeEnero);
		assertEquals(new Double(700), trabajador.getImpuestoAPagar());
	}
}
