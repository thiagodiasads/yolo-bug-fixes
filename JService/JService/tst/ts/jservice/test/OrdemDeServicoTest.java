package ts.jservice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ts.jservice.pojo.OrdemDeServico;

public class OrdemDeServicoTest {

	/**
	 * adicionado o ultimo parametro por causa do id
	 */
	@Test
	public void testeCriarOrdemDeServicoComClienteExistenteEquipamentoExistente() {
		OrdemDeServico ordem = new OrdemDeServico(1, 1, "Não liga");
		int actual = ordem.getCliente();
		int expected = 1;
		assertEquals(expected, actual);
	}
}
