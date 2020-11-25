package src.ar.edu.unlam.pb2.eva03;

import src.ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Deportista {

	public static  TipoDeEvento tipo;
	protected Integer numeroSocio;
	protected String nombre;
	
	public Deportista(Integer numeroSocio, String nombre) {
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
		this.tipo = tipo;
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public static TipoDeEvento getTipo() {
		return tipo;
	}

	public static void setTipo(TipoDeEvento tipo) {
		Deportista.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroSocio == null) ? 0 : numeroSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		if (numeroSocio == null) {
			if (other.numeroSocio != null)
				return false;
		} else if (!numeroSocio.equals(other.numeroSocio))
			return false;
		return true;
	}
	
	
}
