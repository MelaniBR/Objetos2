package tp9.ReproductorMP3;

public class ReproductorMP3 {
	private EstadoDeReproduccion estado ;
	private Song cancionAReproducir;

	public ReproductorMP3() {
		super();
		this.estado = new SeleccionDeCancion();
	}
	public void setEstadoDeReproduccion(EstadoDeReproduccion estadoDeReproduccion) {
		estado = estadoDeReproduccion ; 
		
	}

	public Song getCancionAReproducir() {
		return cancionAReproducir;
	}
	public void seleccionarCancion(Song cancion) {
		cancionAReproducir = cancion;
	}
	public void play ()  throws Exception {
		estado.play(this);
	}
	public void pause ()throws Exception {
		estado.pause(this);
	}
	public void stop() throws Exception{
		estado.stop(this);
	}
	
}
