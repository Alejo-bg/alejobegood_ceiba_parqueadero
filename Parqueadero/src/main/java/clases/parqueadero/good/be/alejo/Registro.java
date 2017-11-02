package clases.parqueadero.good.be.alejo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Registro {

	//private String identificador;
	private Calendar fechaEntrada;
	private Calendar fechaSalida;
	private String Placa;
	
	public Registro(String placa) {
		super();
		this.fechaEntrada = Calendar.getInstance();
		Placa = placa; 
	}

	public Calendar getFechaEntrada() {
		return fechaEntrada;
	}

	public Calendar getFechaSalida() {
		return fechaSalida;
	}

	public String getPlaca() {
		return Placa;
	}
	
	
}