package src.ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import src.ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {
	
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias; 
	

	public Club(String string) {
		
		this.nombre = nombre;
		socios = new HashSet<Deportista>();
		competencias = new HashMap<String, Evento>();
		
	}
	
	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
		
	}
	
	public Integer getCantidadSocios() {
		
		return this.socios.size();
	}
	public Integer inscribirEnEvento(String string, Deportista deportista) {
		Integer numeroInscripcion = 0;
		
		return null; //devulve el numero de inscripcion
	}
	public Evento crearEvento(TipoDeEvento tipo, String nombre) {
		return this.competencias.put(nombre, new Evento(tipo));
		
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}
	
	
	
}
