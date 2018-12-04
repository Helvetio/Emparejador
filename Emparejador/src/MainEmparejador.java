import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainEmparejador {
	static int opc_menu;
	static Util u = new Util();
	
	public static void main(String[] args) {
		MainEmparejador obj = new MainEmparejador();
		HashMap equipos = new HashMap<String, Jugador[]>();
		
		Jugador[] equipo1 = new Jugador[5];
		equipo1 = u.rellenarEquipo('A', equipo1);
		
		equipos = u.crearListaEquipos(equipos, 2);
		System.out.println(equipos.toString());
		
		do {
			obj.menuPrincipal();
			switch(opc_menu) {
			case 1:
				break;
			case 2:
				u.mostrarMejoresJugadores(equipos);
				break;
			case 3:
				break;
			}
		}while(opc_menu!=0);
	}
	
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- MENÚ ----");
		System.out.println("1. Calcular emparejamiento.");
		System.out.println("2. Obtener 5 mejores jugadores.");
		System.out.println("3. Obtener 5 mejores equipos.");
		System.out.println("0. Salir.");
		
		try {				
			opc_menu = sc.nextInt();
			if(opc_menu==0)
				System.out.println("Ejecución finalizada.");
		}catch(Exception e) {
			System.out.println("Error en la entrada de datos.");						
		};
	}
}
