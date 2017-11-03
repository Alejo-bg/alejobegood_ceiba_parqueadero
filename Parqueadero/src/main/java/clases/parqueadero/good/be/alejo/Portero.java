package clases.parqueadero.good.be.alejo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Portero {
	
	private int identificador;
	private Parqueadero parqueadero;
	//private ArrayList<Registro> registros;
	private Map<String,Registro> registros ;
	
	
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
	
	
	public String registrarEntrada(String placa, TipoVehiculo tipoVehiculo) {
		switch(tipoVehiculo) {
			case MOTO:
				if(!this.validarPuestosDisponiblesCarros()) {
					return "No hay puestos disponibles";
				}
			case CARRO:	
				if(!this.validarPuestosDisponiblesMotos()) {
					return "No hay puestos disponibles";
				}
				
		}
		Registro registroTemp = new Registro(placa, tipoVehiculo);
		this.registros.put(placa, registroTemp);
		
	return "";
	
	}
	
	public Registro registrarSalida (String placa, Date fechaSalida) {
		Registro registroTemp=this.registros.get(placa);
		registroTemp.setFechaSalida(fechaSalida);
		return registroTemp;
		
	}
	
	public boolean validarPuestosDisponiblesCarros() {
		if (this.parqueadero.getPuestosDisponiblesCarros()>0) {
			return true;
		}
		
		return false;
	}
	
	
	public boolean validarPuestosDisponiblesMotos() {
		if (this.parqueadero.getPuestosDisponiblesMotos()>0) {
			return true;
		}
		
		return false;
	}
	
	

}
