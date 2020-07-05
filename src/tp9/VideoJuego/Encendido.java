package tp9.VideoJuego;

public class Encendido implements EstadoDelJuego {

	

	@Override
	public String iniciar( ) {
		
		
		return "Ingrese Fichas Para Comenzar! ";
	}

	@Override
	public void actualizarEstado(MaquinaDeVideoJuego maquina) {
		if (maquina.getCantFichas() == 1) {
			maquina.setEstadoDelJuego(new UnJugador());
		} else if (maquina.getCantFichas() == 2) {
			maquina.setEstadoDelJuego(new DosJugadores());
		}
		
	}

	@Override
	public void terminarJuego(MaquinaDeVideoJuego maquina) {
		
	}
		
}
