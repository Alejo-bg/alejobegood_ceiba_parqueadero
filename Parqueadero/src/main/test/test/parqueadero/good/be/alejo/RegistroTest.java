package test.parqueadero.good.be.alejo;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;

import clases.parqueadero.good.be.alejo.Registro;
import clases.parqueadero.good.be.alejo.TipoVehiculo;

public class RegistroTest {
	
	private String placaCarro = "BGA";
	private String placaMoto = "RAM";
	private TipoVehiculo Moto = TipoVehiculo.MOTO;
	private TipoVehiculo Carro = TipoVehiculo.CARRO;
	
	@Test
	public void iniciarRegistroTest() {
		Registro registro = new Registro(placaCarro,Carro);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		dateFormat.format(registro.getFechaEntrada());
		assertEquals("2017/02/17","2017/02/17");
		
	}

}
