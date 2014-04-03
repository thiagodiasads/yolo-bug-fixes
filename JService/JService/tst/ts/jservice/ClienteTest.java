package ts.jservice;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testGetClienteEmail() {
		Cliente cliente;
		cliente = Cliente.findClienteByEmail("thiagodiasads@gmail.com");
		int actual = cliente.getCodigo();
		int expected = 2;
		assertEquals(expected, actual);

	}
}
