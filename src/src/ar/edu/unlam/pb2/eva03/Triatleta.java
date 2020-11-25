package src.ar.edu.unlam.pb2.eva03;

import src.ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{
	private TipoDeBicicleta tipo;
	private String distanciaPreferida;
	
	public Triatleta(Integer numeroSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(numeroSocio, nombre);
		
		this.distanciaPreferida = distanciaPreferida;
		this.tipo = tipo;
	}

	public String getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return this.distanciaPreferida;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroSocio;
	}


	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipo) {
		this.tipo = tipo;
	}

	
}
