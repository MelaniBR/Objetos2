package tp9.VideoJuego;

public class DosJugadores implements EstadoDelJuego {

	@Override
	public String iniciar() {
		return "Juegan dos Jugadores";
	}

	@Override
	public void actualizarEstado(MaquinaDeVideoJuego maquina) {

	}
	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		maquina.setEstadoDelJuego(new Encendido());
		
	}
}
