package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
    private List<Tiquete> tiquetesSinUsar;
    private List<Tiquete> tiquetesUsados;

    
   /*Constructor
    public Cliente(List<Tiquete> tiquetesSinUsar, List<Tiquete> tiquetesUsados) {
		
		this.tiquetesSinUsar = new ArrayList<Tiquete>();
		this.tiquetesUsados = new ArrayList<Tiquete>();
	}*/
    
    
    public Cliente() {}


	public abstract String getIdentificador();
    public abstract String getTipoCliente();
    
    public void agregarTiquete(Tiquete tiquete) {
    		
    	tiquetesSinUsar.add(tiquete);
    }
    
    public void usarTiquetes(Vuelo vuelo) {
    	
    	for(Tiquete tiquete: tiquetesSinUsar) {
    		
    		if(tiquete.getVuelo().equals(vuelo)) {
    			
    			tiquete.marcarComoUsado();
    			tiquetesSinUsar.remove(tiquete);
    			tiquetesUsados.add(tiquete);
    		}
    	}
    }
    
    public int calcularValorTiquetes() {
    	
    	int totalTiquetes = 0;
    	
    	for(int i = 0; i<tiquetesUsados.size(); i++) {
    		Tiquete tiquete = tiquetesUsados.get(i);
    		totalTiquetes+= tiquete.getTarifa();
    		
    	}
    	return totalTiquetes;
	}

}
