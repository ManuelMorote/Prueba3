package FifaStreetEFA;

import java.util.*;

public class PrincipalApp {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		boolean salir = false;
		int opcion, opcion2;
		ArrayList<Portero> Porteros = new ArrayList<Portero>();
		ArrayList<Delantero> Delanteros = new ArrayList<Delantero>();
		ArrayList<Defensa> Defensas = new ArrayList<Defensa>();
		
		Inicializarjugadores(Porteros, Delanteros, Defensas);
		
		do {
			System.out.println("Eliza una de las siguientes opciones:");
			System.out.println("1. Visualizar listas de jugadores");
			System.out.println("2. Modificar listas de jugadores");
			System.out.println("3. Simular enfrentamiento");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				Visualizarjugadores(Porteros, Delanteros, Defensas);
				break;
			case 2:
				System.out.println();
				System.out.println("	Eliza una de las siguientes opciones:");
				System.out.println("	1. Añadir jugador");
				System.out.println("	2. Eliminar jugador");
				opcion2 = sc.nextInt();
				
				switch (opcion2) {
				case 1:
					AñadirJugador(Porteros, Delanteros, Defensas);
					break;
				case 2:
					EliminarJugadores(Porteros, Delanteros, Defensas);
					break;
					
				default:
					System.out.println("Opción inválida, volviendo al menú principal...");
				}
				break;
			case 3:
				SimulacionPartido(Porteros, Delanteros, Defensas);
				break;
			case 4:
				salir = false;
				break;
			default:
				System.out.println("Esa no es una opción válida");
			}
		}while(salir != true);
		
	}
	
	public static void Inicializarjugadores(ArrayList<Portero> Porteros, ArrayList<Delantero> Delanteros, ArrayList<Defensa> Defensas) {
		Porteros.add(new Portero("Oblak", 28, 13, 80, 92, 89));
		Porteros.add(new Portero("Keylor", 34, 1, 95, 89, 71));
		Porteros.add(new Portero("Karius", 27, 20, 84, 82, 56));
		Porteros.add(new Portero("Neuer", 35, 1, 82, 82, 85));
		
		Defensas.add(new Defensa("Casemiro", 29, 14, 88, 92, 81));
		Defensas.add(new Defensa("Busquets", 32, 5, 86, 71, 89));
		Defensas.add(new Defensa("Kante", 30, 7, 97, 92, 81));
		Defensas.add(new Defensa("Kimich", 26, 6, 82, 80, 93));
		
		Delanteros.add(new Delantero("Cristiano", 36, 7, 93, 68, 94));
		Delanteros.add(new Delantero("Messi", 33, 10, 88, 98, 72));
		Delanteros.add(new Delantero("Haaland", 30, 9, 92, 80, 98));
		Delanteros.add(new Delantero("Neymar", 29, 11, 81, 97, 74));
	}
	
	public static void Visualizarjugadores(ArrayList<Portero> Porteros, ArrayList<Delantero> Delanteros, ArrayList<Defensa> Defensas) {
		
		System.out.println("Delanteros:");
		for(int i = 0; i < Delanteros.size(); i++) {
			System.out.println(Delanteros.get(i).getNombre() + ": " + Delanteros.get(i).toString());
		}
		
		System.out.println("Defensas: ");
		for(int i = 0; i < Defensas.size(); i++) {
			System.out.println(Defensas.get(i).getNombre() + ": " + Defensas.get(i).toString());
		}
		
		System.out.println("Porteros: ");
		for(int i = 0; i < Porteros.size(); i++) {
			System.out.println(Porteros.get(i).getNombre() + ": " + Porteros.get(i).toString());
		}
	}
	
	public static void AñadirJugador(ArrayList<Portero> Porteros, ArrayList<Delantero> Delanteros, ArrayList<Defensa> Defensas) {
		String Opcion, nombre;
		int edad, dorsal, stat1, stat2, stat3;
		System.out.println("Elija una posición:");
		Opcion = sc.next();
		System.out.println("Elija un nombre:");
		nombre = sc.next();
		System.out.println("Elija una edad:");
		edad = sc.nextInt();
		System.out.println("Elija un dorsal:");
		dorsal = sc.nextInt();
		if (Opcion.equals("Delantero")) {
			
			System.out.println("Elija un tiro:");
			stat1 = sc.nextInt();
			System.out.println("Elija un regate:");
			stat2 = sc.nextInt();
			System.out.println("Elija una potencia:");
			stat3 = sc.nextInt();
			
			if (stat1 > 100 | stat2 > 100 | stat3 > 100) {
				System.out.println("Los valores introducidos son incorrectos, no se creará el jugador");
			}
			else {
				Delanteros.add(new Delantero(nombre, edad, dorsal, stat1, stat2, stat3));
			}
		}
		else if (Opcion.equals("Defensa")) {
			
			System.out.println("Elija una entrada:");
			stat1 = sc.nextInt();
			System.out.println("Elija una fuerza:");
			stat2 = sc.nextInt();
			System.out.println("Elija un pase:");
			stat3 = sc.nextInt();
			
			if (stat1 > 100 | stat2 > 100 | stat3 > 100) {
				System.out.println("Los valores introducidos son incorrectos, no se creará el jugador");
			}
			else {
				Defensas.add(new Defensa(nombre, edad, dorsal, stat1, stat2, stat3));
			}
		}
		else if (Opcion.equals("Portero")) {
			
			System.out.println("Elija unos reflejos:");
			stat1 = sc.nextInt();
			System.out.println("Elija una estirada:");
			stat2 = sc.nextInt();
			System.out.println("Elija una colocación:");
			stat3 = sc.nextInt();
			
			if (stat1 > 100 | stat2 > 100 | stat3 > 100) {
				System.out.println("Los valores introducidos son incorrectos, no se creará el jugador");
			}
			else {
				Porteros.add(new Portero(nombre, edad, dorsal, stat1, stat2, stat3));
			}
		}
		else {
			System.out.println("Los valores introducidos son incorrectos, no se creará el jugador");
		}
	}
	public static void EliminarJugadores(ArrayList<Portero> Porteros, ArrayList<Delantero> Delanteros, ArrayList<Defensa> Defensas) {
		String Opcion;
		int seleccion;
		System.out.println("Elija una posición:");
		Opcion = sc.next();
		
		if (Opcion.equals("Delantero")) {
			for(int i = 0; i < Delanteros.size(); i++) {
				System.out.println(i + ". " + Delanteros.get(i).getNombre());
			}
			System.out.println("¿Cual desea eliminar? (Elija por número)");
			seleccion = sc.nextInt();
			Delanteros.remove(seleccion);
		}
		
		else if (Opcion.equals("Defensa")) {
			for(int i = 0; i < Defensas.size(); i++) {
				System.out.println(i + ". " + Defensas.get(i).getNombre());
			}
			System.out.println("¿Cual desea eliminar? (Elija por número)");
			seleccion = sc.nextInt();
			Defensas.remove(seleccion);
		}
		
		else if (Opcion.equals("Portero")) {
			for(int i = 0; i < Porteros.size(); i++) {
				System.out.println(i + ". " + Porteros.get(i).getNombre());
			}
			System.out.println("¿Cual desea eliminar? (Elija por número)");
			seleccion = sc.nextInt();
			Porteros.remove(seleccion);
		}
			
		}
	public static void SimulacionPartido(ArrayList<Portero> Porteros, ArrayList<Delantero> Delanteros, ArrayList<Defensa> Defensas) {
		ArrayList<Equipos> equipos = new ArrayList<Equipos>();
		int delanteror, defensar, porteror;
		for (int i = 0; i < 2; i++) {
			System.out.println("El equipo " + (i+1) + " Está conformado por:");
			delanteror = (int)Math.random()*Delanteros.size();
			defensar = (int)Math.random()*Defensas.size();
			porteror = (int)Math.random()*Defensas.size();;
			Delantero delantero = Delanteros.get(delanteror);
			Delanteros.remove(delanteror);
			Defensa defensa = Defensas.remove(defensar);
			Defensas.remove(defensar);
			Portero portero = Porteros.get(porteror);
			Porteros.remove(porteror);
			ArrayList<Jugadores> equipo = new ArrayList<Jugadores>(Arrays.asList(delantero, defensa, portero));
			equipos.add(new Equipos(equipo));
			System.out.println(equipos.get(i).toString());
		}
		if (equipos.get(0).mediaequipo() > equipos.get(1).mediaequipo()) {
			System.out.println("ganó e equipo 1");
		}
		else if (equipos.get(0).mediaequipo() < equipos.get(1).mediaequipo()) {
			System.out.println("ganó e equipo 2");
		}
		else {
			System.out.println("Es un empate");
		}
	}
	
}
