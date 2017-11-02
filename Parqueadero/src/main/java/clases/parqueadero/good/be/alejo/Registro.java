package clases.parqueadero.good.be.alejo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Registro {

	//private String identificador;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String Placa;
	private TipoVehiculo tipoVehiculo;
	
	
	public Registro(String placa, TipoVehiculo tipoVehiculo) {
		super();
		this.fechaEntrada = new Date();
		Placa = placa;
		this.tipoVehiculo= tipoVehiculo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public String getPlaca() {
		return Placa;
	}
	
	public void setFechaSalida(Date fecha) {
		this.fechaSalida = fecha;
	}
	
	
}