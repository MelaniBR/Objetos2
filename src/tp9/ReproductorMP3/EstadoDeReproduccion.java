package tp9.ReproductorMP3;

public interface EstadoDeReproduccion {
	public void play (ReproductorMP3 reproductor)  throws Exception ;
	public void pause (ReproductorMP3 reproductor)throws Exception ;
	public void stop(ReproductorMP3 reproductor) throws Exception;
		
}
