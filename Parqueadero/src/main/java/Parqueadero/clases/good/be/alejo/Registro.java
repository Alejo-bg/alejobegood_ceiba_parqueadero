package Parqueadero.clases.good.be.alejo;

import java.util.Calendar;

public class Registro {

	//private String identificador;
	private Calendar fechaEntrada;
	private Calendar fechaSalida;
	private String Placa;
	
	public Registro(Calendar fechaEntrada, Calendar fechaSalida, String placa) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		Placa = placa; 
	}
	
}