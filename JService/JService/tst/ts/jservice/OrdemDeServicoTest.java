package ts.jservice;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import ts.jservice.swing.OrdemDeServicoPanel;

public class OrdemDeServicoTest {

	/**
	 * 
	 */
	@Test
	public void testeCriarOrdemDeServicoComClienteExistenteEquipamentoExistente() {
		OrdemDeServico ordem = new OrdemDeServico(1, 1, "N�o liga");
		int actual = ordem.getCliente();
		int expected = 1;
		assertEquals(expected, actual);
	}

}
