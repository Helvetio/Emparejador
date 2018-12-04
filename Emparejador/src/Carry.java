
public class Carry extends Jugador implements CalculaHabilidad {
	final private int HABILIDAD = 2;
	final private double INGENIO = 0.5;
	
	public Carry() {
		super();
	}
	
	public Carry(String nombre, String apellido, int rapidez, int ingenio) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setRapidez(rapidez);
		this.setIngenio(ingenio);
	}

	public double calculaHabilidad() {
		return ((this.getRapidez()* HABILIDAD)+(this.getIngenio() * INGENIO));
	}	
}
