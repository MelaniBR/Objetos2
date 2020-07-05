package tp9.VideoJuego;

public interface EstadoDelJuego {
	public String iniciar() ;
	public void actualizarEstado(MaquinaDeVideoJuego maquina);
	public void terminarJuego(MaquinaDeVideoJuego maquina) ;
}
