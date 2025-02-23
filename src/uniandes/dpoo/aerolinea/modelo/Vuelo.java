package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private Avion avion;
	private String fecha;
	private Ruta ruta;
	private Map<String, Tiquete> tiquetes;
	
	//Constructor
	public Vuelo(Avion avion, String fecha, Ruta ruta) {
	
		this.avion = avion;
		this.fecha = fecha;
		this.ruta = ruta;
	}

	public Avion getAvion() {
		return avion;
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Map<String, Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	

	
}
