package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	
	
	static String NATURAL;
	private String nombre;
	
	//Constructor
	public ClienteNatural(String nombre) {
		//super(tiquetesSinUsar, tiquetesUsados);
		this.nombre = nombre;
	}

	@Override
	public String getIdentificador() {
		return nombre;
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}
	

	

}
