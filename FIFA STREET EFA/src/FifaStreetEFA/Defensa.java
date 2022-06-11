package FifaStreetEFA;

public class Defensa extends Jugadores {
	
	protected int entrada, fuerza, pase;
	
	public Defensa (String Nombre, int Edad, int Dorsal, int entrada, int fuerza, int pase) {
		super(Nombre, Edad, Dorsal);
		this.entrada = entrada;
		this.fuerza = fuerza;
		this.pase = pase;
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPase() {
		return pase;
	}

	public void setPase(int pase) {
		this.pase = pase;
	}
	
	public String toString() {
		return "[Entrada: " + entrada + " | Fuerza: " + fuerza + " | Pase: " + pase + "]";
	}
	
	public int calcularmedia() {
		int media = (int) (entrada + fuerza + pase)/3;
		return media;
	}

}
