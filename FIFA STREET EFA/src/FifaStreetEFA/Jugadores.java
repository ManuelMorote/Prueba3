package FifaStreetEFA;

public abstract class Jugadores {
	
	protected String Nombre;
	protected int Edad;
	protected int Dorsal;
	
	public Jugadores (String Nombre, int Edad, int Dorsal) {
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Dorsal = Dorsal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getDorsal() {
		return Dorsal;
	}

	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}
	
	public String toString(){
		return "[Nombre: " + Nombre + " | Edad: " + Edad + " | Dorsal: " + Dorsal + "]";
	}
	
	public abstract int calcularmedia();

}
