package ts.jservice;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PrincipalTest {

	@Test
	public void testeCriarOrdemDeServicoComClienteExistenteEquipamentoExistente() {
		Cliente cliente;
		Equipamento equipamento;
		OrdemDeServico ordemDeServico;
		ordemDeServico = new OrdemDeServico(1,1,"Não liga");		
		int codigo = ordemDeServico.getCodigo();
		
	}

}
