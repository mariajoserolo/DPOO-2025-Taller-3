package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	private int capacidad;
	private String nombre;
	
	
	//Constructor
	public Avion(int capacidad, String nombre) {
		
		this.capacidad = capacidad;
		this.nombre = nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	

}
