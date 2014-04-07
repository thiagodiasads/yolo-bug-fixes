package ts.jservice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testGetClienteEmail() {
		Cliente cliente = null;
		cliente = Cliente.findClienteByEmail("marco.mangan@gmail.com");
		int actual = cliente.getCodigoCliente();
		int expected = 1;
		assertEquals(expected, actual);

	}
}
