package Parqueadero.clases.good.be.alejo;

public class Portero {
	
	private int identificador;
	private Parqueadero parqueadero;
	
	
	public Parqueadero getParqueadero() {
		return parqueadero;
	}
	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}
	/**
	 * la función recibe un identificador del vehiculo y luego registra su ingreso al parqueadero
	 * @param placa identificador del vehiculo
	 */
	public void registrarIngresoCarro(String placa) {
		this.parqueadero.getZonaParqueCarros().add(placa);
		
	}
	/**
	 * la función recibe un identificador del vehiculo y luego registra su salide del parqueadero
	 * @param placa identificador del vehiculo
	 */
	public void registrarSalidaCarro(String placa) {
		
		
	}
	
	public boolean comprobarDisponibilidadParquederoCarros(){
		return true;
	}
	
	public double calcularValorParqueoCarros(String placa) {
		return 0.0;
	}
	
	public boolean buscarCarro(String carro) {
		return true;
	}

}
