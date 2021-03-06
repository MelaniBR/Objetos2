package tp9.Encriptacion;
public class EncriptadorNaive {
	
	private ModoDeEncriptacion modoDeEncriptacion;
	
	public EncriptadorNaive(ModoDeEncriptacion modoDeEncriptacion) {
		this.modoDeEncriptacion = modoDeEncriptacion;
	}
	
	public ModoDeEncriptacion getModoDeEncriptacion() {
		return modoDeEncriptacion;
	}

	public void setModoDeEncriptacion(ModoDeEncriptacion modoDeEncriptacion) {
		this.modoDeEncriptacion = modoDeEncriptacion;
	}

	public String encriptar(String texto) {
		return getModoDeEncriptacion().encriptar(texto);
	}

	public String desencriptar(String texto) {
		return getModoDeEncriptacion().desencriptar(texto);
	}

}
