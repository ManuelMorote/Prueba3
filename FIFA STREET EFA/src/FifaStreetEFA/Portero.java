package FifaStreetEFA;

public class Portero extends Jugadores{
	
	protected int reflejos, estirada, colocacion;
	
	public Portero (String Nombre, int Edad, int Dorsal, int reflejos, int estirada, int colocacion) {
		super(Nombre, Edad, Dorsal);
		this.reflejos = reflejos;
		this.estirada = estirada;
		this.colocacion = colocacion;
	}

	public int getReflejos() {
		return reflejos;
	}

	public void setReflejos(int reflejos) {
		this.reflejos = reflejos;
	}

	public int getEstirada() {
		return estirada;
	}

	public void setEstirada(int estirada) {
		this.estirada = estirada;
	}

	public int getColocacion() {
		return colocacion;
	}

	public void setColocacion(int colocacion) {
		this.colocacion = colocacion;
	}
	
	public String toString() {
		return "[Reflejos " + reflejos + " | Estirada: " + estirada + " | Colocación:" + colocacion;
	}
	
	public int calcularmedia() {
		int media = (int) (reflejos + estirada + colocacion)/3;
		return media;
	}

}
