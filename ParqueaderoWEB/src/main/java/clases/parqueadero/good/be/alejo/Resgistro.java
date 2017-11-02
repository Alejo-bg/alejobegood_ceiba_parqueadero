package clases.parqueadero.good.be.alejo;

import java.util.Calendar;

public class Resgistro {

	//private String identificador;
	private Calendar fechaEntrada;
	private Calendar fechaSalida;
	private String Placa;
	
	public Resgistro(Calendar fechaEntrada, Calendar fechaSalida, String placa) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		Placa = placa; 
	}
	
}
