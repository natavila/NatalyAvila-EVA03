package src.ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista{
	
	private Integer distanciaPreferida;
	private Integer CantidadDekilometrosEntrenados;
	
	public Corredor(Integer numeroSocio, String nombre, Integer distanciaPreferida) {
		super(numeroSocio, nombre);
		
		this.distanciaPreferida = distanciaPreferida;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.CantidadDekilometrosEntrenados = cantidadDeKilometrosEntrenados;
		
	}

	public Integer getDistanciaPreferida() {
		
		return this.distanciaPreferida;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroSocio;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		
		return this.CantidadDekilometrosEntrenados;
	}

}
