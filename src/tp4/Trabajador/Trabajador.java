package tp4.Trabajador;



import java.util.ArrayList;

public class Trabajador {
	protected ArrayList <Ingreso > ingresoPercibidosPorAño = new ArrayList();
	

	public double getTotalPercibido() {
		
		return ingresoPercibidosPorAño.stream().mapToDouble(ingreso->ingreso.getMontoPercibido()).sum();
	}

	public void agregarIngreso(Ingreso ingreso) {
		ingresoPercibidosPorAño.add(ingreso);
		
	}

	public Double getMontoImponible() {
		// TODO Auto-generated method stub
		return ingresoPercibidosPorAño.stream()
				.filter(ingreso->ingreso.getConcepto()!="Horas Extras")
				.mapToDouble(ingreso->ingreso.getMontoPercibido())
				.sum();
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

}
