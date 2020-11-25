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
	public Integer inscribirEnEvento(String nombreDelEvento, Deportista deportista) throws NoEstaPreparado {
		Integer numeroInscripciones = 0;
		Evento evento = competencias.get(nombreDelEvento); //Se crea un evento para usar el  metodo de la clase Evento
		switch(competencias.get(nombreDelEvento).getTipo()) {
		case CARRERA_42K:
			if(deportista instanceof Corredor){ //verifica si el deportista es corredor
				numeroInscripciones = evento.agregarDeportista(deportista);//agregar al deportista al evento
				numeroInscripciones++;
				break;
			}
			
			default:
				throw new NoEstaPreparado("No se puede inscribir");
		
		}
		
		return numeroInscripciones; //devulve el numero de inscripcion
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
