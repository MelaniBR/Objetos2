package tp4.Trabajador;



import java.util.ArrayList;

public class Trabajador {
	protected ArrayList <Ingreso > ingresoPercibidosPorA�o = new ArrayList();
	

	public double getTotalPercibido() {
		
		return ingresoPercibidosPorA�o.stream().mapToDouble(ingreso->ingreso.getMontoPercibido()).sum();
	}

	public void agregarIngreso(Ingreso ingreso) {
		ingresoPercibidosPorA�o.add(ingreso);
		
	}

	public Double getMontoImponible() {
		// TODO Auto-generated method stub
		return ingresoPercibidosPorA�o.stream()
				.filter(ingreso->ingreso.getConcepto()!="Horas Extras")
				.mapToDouble(ingreso->ingreso.getMontoPercibido())
				.sum();
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

}
