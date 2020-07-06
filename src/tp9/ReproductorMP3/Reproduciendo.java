package tp9.ReproductorMP3;

public class Reproduciendo implements EstadoDeReproduccion {

	@Override
	public void play(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("La cancion se esta reproducciendo");
		
	}

	@Override
	public void pause(ReproductorMP3 reproductor) throws Exception {
		reproductor.setEstadoDeReproduccion(new Pausa());
		reproductor.getCancionAReproducir().pause();
		
	}

	@Override
	public void stop(ReproductorMP3 reproductor) throws Exception {
		reproductor.setEstadoDeReproduccion(new SeleccionDeCancion());
		reproductor.getCancionAReproducir().stop();
		
	}

}
