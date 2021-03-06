package tp4.Trabajador;



import java.util.ArrayList;

public class Trabajador {
	protected ArrayList <Ingreso > ingresoPercibidosPorAņo = new ArrayList();
	

	public double getTotalPercibido() {
		
		return ingresoPercibidosPorAņo.stream().mapToDouble(ingreso->ingreso.getMontoPercibido()).sum();
	}

	public void agregarIngreso(Ingreso ingreso) {
		ingresoPercibidosPorAņo.add(ingreso);
		
	}

	public Double getMontoImponible() {
		// TODO Auto-generated method stub
		return ingresoPercibidosPorAņo.stream()
				.filter(ingreso->ingreso.getConcepto()!="Horas Extras")
				.mapToDouble(ingreso->ingreso.getMontoPercibido())
				.sum();
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

}
