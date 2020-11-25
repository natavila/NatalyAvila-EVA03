package src.ar.edu.unlam.pb2.eva03;

import src.ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Ciclista extends Deportista{
	
	private String tipoBicicleta;

	public Ciclista(Integer numeroSocio, String nombre, String tipoBicicleta) {
		super(numeroSocio, nombre);
		
		this.tipoBicicleta = tipoBicicleta;
	}

	public String getTipoDeBicicleta() {
		
		return this.tipoBicicleta;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroSocio;
	}

	public String getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	

	
}
