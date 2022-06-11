package FifaStreetEFA;

import java.util.ArrayList;

public class Equipos {
	
	private ArrayList<Jugadores> Jugadores;
	
	public Equipos (ArrayList<Jugadores> Jugadores) {
		super();
		this.Jugadores = Jugadores;
	}

	public ArrayList<Jugadores> getJugadores() {
		return Jugadores;
	}

	public void setJugadores(ArrayList<Jugadores> jugadores) {
		Jugadores = jugadores;
	}
	
	public String toString() {
		return "[Jugadores: " + Jugadores + "]";
	}
	
	public int mediaequipo() {
		int mediaequipo = 0;
		
		for(int i = 0; i < Jugadores.size(); i++) {
			mediaequipo = mediaequipo + Jugadores.get(i).calcularmedia();
		}
		
		mediaequipo = mediaequipo / Jugadores.size();
		
		return mediaequipo;
	}

}
