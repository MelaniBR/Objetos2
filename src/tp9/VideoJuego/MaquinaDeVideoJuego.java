package tp9.VideoJuego;

public class MaquinaDeVideoJuego {

	private EstadoDelJuego estado;
	private Integer cantFichas ;

	public MaquinaDeVideoJuego() {
		super();
		estado = new Encendido();
		cantFichas = 0 ;
	}
	public String inicio() {
		estado.actualizarEstado(this);
		return estado.iniciar() ;
	}
	public void agregarFicha() {
		cantFichas += 1 ;
	}
	public int getCantFichas() {
		return cantFichas;
	}
	public void setEstadoDelJuego(EstadoDelJuego estado) {
		this.estado = estado ;
		
	}
	public void terminarJuego() {
		estado.terminarJuego(this);
		cantFichas = 0 ;
		
	}
}
