import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Util {
	double habilidadJugador;
	List<Jugador> list = new ArrayList<>(); // Para guardar todos los jugadores
	
	public Jugador[] rellenarEquipo(char nombre, Jugador[] equipo) {
		Jugador j = null;		
		
		for(int i=0; i<5; i++) {	
			int res = (int) (Math.random() * 2) + 1;
			switch(res) {
			case 1:
				j = new Carry();
				break;
			case 2:
				j = new Coach();
				break;
			}
			
			equipo[i] = j;
			equipo[i].setNombre("Nombre " + nombre + " " + i);
			equipo[i].setApellido("Apellido " + nombre + " " + i);
			equipo[i].setRapidez(calcularRapidezAleatoria());
			equipo[i].setIngenio(calcularIngenioAleatorio());
			
			if(equipo[i] instanceof Carry) {
				Carry aux = (Carry)equipo[i];
				habilidadJugador = aux.calculaHabilidad();
			}else if(equipo[i] instanceof Coach) {
				Coach aux = (Coach)equipo[i];
				habilidadJugador = aux.calculaHabilidad();
			}
			
			equipo[i].setHabilidad(habilidadJugador);
			list.add(equipo[i]);
			
		} 
		// Calculo la habilidad del equipo y pongo el nombre y la habilidad en un map, luego ordenaré ese map
		return equipo;
	}
	
	private int calcularRapidezAleatoria() {
		int rapidez;
		rapidez = (int) (Math.random() * 100) + 1;
		return rapidez;
	}
	
	private int calcularIngenioAleatorio() {
		int ingenio;
		ingenio = (int) (Math.random() * 100) + 1;
		return ingenio;
	}
	
	public double sumarHabilidadesJugadores(Jugador[] equipo) {
		double resultado = 0;
		for(int i=0; i<equipo.length; i++) {
			resultado = resultado + equipo[i].getHabilidad();
		}
		return resultado;
	}
	
	public HashMap crearListaEquipos(HashMap equipos, int numEquipos) {
		Jugador[] equipo = new Jugador[5];
		String nombres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String nombreEquipo;
		for(int j = 0; j<numEquipos; j++) {
			nombreEquipo = "Equipo " + nombres.charAt(j);
			equipos.put(nombreEquipo, rellenarEquipo(nombres.charAt(j), equipo));
		}
		return equipos;
	}
		
	public void mostrarMejoresJugadores(HashMap equipos) {
		Collection<Jugador> jugadores = equipos.values();
	    List<Jugador> list = new ArrayList<>(jugadores);	    
	    Collections.sort(list, new Comparador());
	    
	    for (Iterator<Jugador> it = list.iterator(); it.hasNext();) {
	      Jugador jug = (Jugador) it.next();
	      System.out.println("Nombre: " + jug.getNombre());
	      System.out.println("Habilidad: " + jug.getHabilidad());
	    }
	}
}