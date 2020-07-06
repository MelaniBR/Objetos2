package tp9.ReproductorMP3;

public class Pausa implements EstadoDeReproduccion {

	@Override
	public void play(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("La cancion no se puede reproducir");
		

	}

	@Override
	public void pause(ReproductorMP3 reproductor) throws Exception {
		reproductor.setEstadoDeReproduccion(new Reproduciendo());
		reproductor.getCancionAReproducir().play();;

	}

	@Override
	public void stop(ReproductorMP3 reproductor) throws Exception {
		reproductor.setEstadoDeReproduccion(new SeleccionDeCancion());
		reproductor.getCancionAReproducir().stop();
	}

}
