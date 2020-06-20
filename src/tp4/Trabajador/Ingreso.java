package tp4.Trabajador;



public class Ingreso {
	private Integer mes;
	private String concepto;
	private Double montoPercibido;

	public Ingreso(int i, String string, Double double1) {
			mes = i;
			concepto = string;
			montoPercibido = double1;
	}

	public double getMontoPercibido() {
		// TODO Auto-generated method stub
		return montoPercibido;
	}

	public String getConcepto() {
		// TODO Auto-generated method stub
		return concepto;
	}

}
