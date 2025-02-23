package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private Cliente clienteComprador;
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	
	//Constructor
	public Tiquete(Cliente clienteComprador, String codigo, int tarifa, Vuelo vuelo) {
	
		this.clienteComprador = clienteComprador;
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
	
	}

	public Cliente getClienteComprador() {
		return clienteComprador;
	}


	public String getCodigo() {
		return codigo;
	}


	public int getTarifa() {
		return tarifa;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void marcarComoUsado() {
		
		if(!usado) {
			usado = true;	
		}
		
	}
	public boolean esUsado() {
		return usado;
	}
	
	
	
}
