package test.parqueadero.good.be.alejo;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import clases.parqueadero.good.be.alejo.Portero;

public class PorteroTest extends Portero{

	@Test
	public void ingresarVehiculoTest() {
		Portero portero = new Portero();
		portero.registrarIngresoCarro("ABC");
		assertNotNull(portero.getParqueadero().getZonaParqueCarros());
		
		
	}

}