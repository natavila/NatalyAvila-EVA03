package src.ar.edu.unlam.pb2.eva03;

public class Nadador extends Deportista{
	private String estilo;

	public Nadador(Integer numeroSocio, String nombre, String estilo) {
		super(numeroSocio, nombre);


		this.estilo = estilo;
	}

	public String getEstiloPreferido() {
		
		return this.estilo;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroSocio;
	}

}
