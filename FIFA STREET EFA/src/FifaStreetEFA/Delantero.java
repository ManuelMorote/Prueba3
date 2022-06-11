package FifaStreetEFA;

public class Delantero extends Jugadores {

	protected int tiro, regate, potencia;
	
	public Delantero (String Nombre, int Edad, int Dorsal, int tiro, int regate, int potencia) {
		super(Nombre, Edad, Dorsal);
		this.tiro = tiro;
		this.regate = regate;
		this.potencia = potencia;
	}

	public int getTiro() {
		return tiro;
	}

	public void setTiro(int tiro) {
		this.tiro = tiro;
	}

	public int getRegate() {
		return regate;
	}

	public void setRegate(int regate) {
		this.regate = regate;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String toString() {
		return "[Tiro: " + tiro + " | Regate " + regate + " | Potencia: " + potencia + "]";
	}
	
	public int calcularmedia() {
		int media = (int) (tiro + regate + potencia)/3;
		return media;
	}
}
