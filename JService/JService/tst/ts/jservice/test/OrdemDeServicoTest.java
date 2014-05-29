package ts.jservice.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import ts.jservice.pojo.OrdemDeServico;
import ts.jservice.swing.OrdemDeServicoPanel;

public class OrdemDeServicoTest {

	/**
	 * adicionado o ultimo parametro por causa do id
	 */
	@Test
	public void testeCriarOrdemDeServicoComClienteExistenteEquipamentoExistente() {

		OrdemDeServico ordem = new OrdemDeServico(1, 1, "Não liga",1);
		int actual = ordem.getCliente();
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	/**
	 * adicionado o ultimo parametro por causa do id
	 */
	@Test
	public void testeGravarOrdemDeServicoComClienteExistenteEquipamentoExistente() {
		OrdemDeServico ordem = new OrdemDeServico(1, 1, "Não liga",1);
//		int actual = ordem.getCliente();
//		int expected = 1;
//		assertEquals(expected, actual);

		/**
		 * criar metodo na classe OrdemServico
		 */	
	//OrdemDeServico.gravarOrdem(ordem);
	}

	
	@Test
	public void testeGravarOS() {
		OrdemDeServico ordem = new OrdemDeServico(1, 1, "Não liga",1);
		
		OrdemDeServico.gravaOrdem(ordem); 
		
//		int actual = ordem.getCliente();
//		int expected = 1;
//		assertEquals(expected, actual);
	}
	
}
