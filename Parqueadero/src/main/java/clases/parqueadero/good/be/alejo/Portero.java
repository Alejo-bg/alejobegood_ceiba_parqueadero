package clases.parqueadero.good.be.alejo;

import java.util.ArrayList;
import java.util.Calendar;
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
	 * la funci�n recibe un identificador del vehiculo y luego registra su ingreso al parqueadero
	 * @param placa identificador del vehiculo
	 */
	public void registrarIngresoCarro(String placa) {
		this.parqueadero.getZonaParqueCarros().add(placa);
		
	}
	/**
	 * la funci�n recibe un identificador del vehiculo y luego registra su salide del parqueadero
	 * @param placa identificador del vehiculo
	 */
	public void registrarSalidaCarro(String placa) {
		
		
	}
	
	
	public double calcularValorParqueoCarros(String placa) {
		return 0.0;
	}
	
	public boolean buscarCarro(String carro) {
		return true;
	}
	
	
	public String registrarEntradaMotos(String placa) {
		if(!this.validarIngresoPlaca(placa)) {
			return "no puede ingresar porque no est� en un dia h�bil";
		}
		
		if(!this.validarPuestosDisponiblesMotos()) {
					return "No hay puestos disponibles";
		}
		
		Registro registroTemp = new Registro(placa, TipoVehiculo.MOTO);
		this.registros.put(placa, registroTemp);
		this.parqueadero.setPuestosDisponiblesMotos(this.parqueadero.getPuestosDisponiblesMotos()-1);
	return registroTemp.toString();
	}
	
	public String registrarEntradaCarros(String placa) {
		if(!this.validarIngresoPlaca(placa)) {
			return "no puede ingresar porque no est� en un dia h�bil";
		}
		
		
		if(!this.validarPuestosDisponiblesCarros()) {
			return "No hay puestos disponibles";
		}
		Registro registroTemp = new Registro(placa, TipoVehiculo.CARRO);
		this.registros.put(placa, registroTemp);
		this.parqueadero.setPuestosDisponiblesCarros(this.parqueadero.getPuestosDisponiblesCarros()-1);
	return registroTemp.toString();
	
	
	
	}
	
	public Registro registrarSalida (String placa, Date fechaSalida) {
		Registro registroTemp=this.registros.get(placa);
		registroTemp.setFechaSalida(fechaSalida);
		return registroTemp;
		
	}
	
	public boolean validarPuestosDisponiblesCarros() {
		if(this.parqueadero.getPuestosDisponiblesCarros()>0) {
			return true;
		}
		
		return false;
	}
	
	
	public boolean validarPuestosDisponiblesMotos() {
		if(this.parqueadero.getPuestosDisponiblesMotos()>0) {
			return true;
		}
		
		return false;
	}
	
	
	public boolean validarIngresoPlaca(String placa) {
		Calendar fechaActual = Calendar.getInstance();
		if((fechaActual.DAY_OF_WEEK==Calendar.SUNDAY)||(fechaActual.DAY_OF_WEEK==Calendar.MONDAY)) {
			if(placa.charAt(0)=='A') {
				return true;
			}
		}	
		return false;
	}
	

}
