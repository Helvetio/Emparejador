
public class Jugador {
	private String nombre;
	private String apellido;
	private int rapidez;
	private int ingenio;		
	private double habilidad;
	
	public Jugador() {}
	
	public Jugador(String nombre, String apellido, int rapidez, int ingenio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rapidez = rapidez;
		this.ingenio = ingenio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getRapidez() {
		return rapidez;
	}
	public void setRapidez(int rapidez) {
		this.rapidez = rapidez;
	}
	public int getIngenio() {
		return ingenio;
	}
	public void setIngenio(int ingenio) {
		this.ingenio = ingenio;
	}
	public double getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(double habilidad) {
		this.habilidad = habilidad;
	}
	
}
