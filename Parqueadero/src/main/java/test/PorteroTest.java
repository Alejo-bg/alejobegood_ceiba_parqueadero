package test;

import static org.junit.Assert.*;
import org.junit.Test;

import Parqueadero.clases.good.be.alejo.Portero;

public class PorteroTest extends Portero{

	@Test
	public void ingresarVehiculoTest() {
		Portero portero = new Portero();
		portero.registrarIngresoCarro("ABC");
		assertNotNull(portero.getParqueadero().getZonaParqueCarros());
		
		
	}

}
