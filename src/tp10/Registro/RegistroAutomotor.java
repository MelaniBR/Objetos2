package tp10.Registro;



import java.time.LocalDate;

public class RegistroAutomotor {
	/*
	  Bad smell: debeRealizarVtv() 
	  Feature Envy : Esta accediendo a los datos del vehiculo demasiado'
	  Es por eso que es mejor delegarlo y hacer que vehiculo diga si necesita realizar la vtv o no
 
	 
	 */
	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {
		return (vehiculo.debeRealizarVTV(fecha));

	}
}
