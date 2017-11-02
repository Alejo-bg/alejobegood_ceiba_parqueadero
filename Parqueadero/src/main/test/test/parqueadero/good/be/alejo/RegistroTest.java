package test.parqueadero.good.be.alejo;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		Date fecha= new Date();
		String fechaActual = dateFormat.format(new Date());
		String fechaOptenida = dateFormat.format(registro.getFechaEntrada());
		assertEquals(fechaActual, fechaOptenida);
		
	}
	
	@Test
	public void registrarSalidaTest() {
		Registro registro = new Registro(placaCarro,Carro);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha= new Date();
		registro.setFechaSalida(fecha);
		String fechaActual = dateFormat.format(new Date());
		String fechaOptenida = dateFormat.format(registro.getFechaSalida());
		assertEquals(fechaActual, fechaOptenida);
	}

}
