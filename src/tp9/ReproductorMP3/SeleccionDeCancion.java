package tp9.ReproductorMP3;

public class SeleccionDeCancion implements EstadoDeReproduccion {

	@Override
	public void play(ReproductorMP3 reproductor) throws Exception {
			reproductor.getCancionAReproducir().play();
			reproductor.setEstadoDeReproduccion(new Reproduciendo()) ;
	}

	@Override
	public void pause(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("No hay ninguna cancion reproducciendo");
	}

	@Override
	public void stop(ReproductorMP3 reproductor) throws Exception {

	}

}
