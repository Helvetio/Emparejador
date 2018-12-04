
public class Coach extends Jugador implements CalculaHabilidad {
	final private int HABILIDAD = 3;
	final private double INGENIO = 0.2;
	
	public Coach() {
		super();
	}
	
	public Coach(String nombre, String apellido, int rapidez, int ingenio) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setRapidez(rapidez);
		this.setIngenio(ingenio);
	}

	public double calculaHabilidad() {
		return ((this.getRapidez()* HABILIDAD)+(this.getIngenio() * INGENIO));
	}
}
