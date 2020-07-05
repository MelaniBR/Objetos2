package tp9.VideoJuego;

public class UnJugador implements EstadoDelJuego {

	@Override
	public String iniciar() {
		return "Juega un jugador";
	}

	@Override
	public void actualizarEstado(MaquinaDeVideoJuego maquina) {
		
	}

	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		maquina.setEstadoDelJuego(new Encendido());
		
	}

}
