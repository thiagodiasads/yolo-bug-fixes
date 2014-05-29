package ts.jservice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ts.jservice.pojo.Cliente;

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
