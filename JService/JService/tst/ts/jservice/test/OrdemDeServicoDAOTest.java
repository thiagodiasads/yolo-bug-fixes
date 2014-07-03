package ts.jservice.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

import ts.jservice.dao.OrdemDeServicoDAO;
import ts.jservice.pojo.OrdemDeServico;

public class OrdemDeServicoDAOTest {

	@Test
	public void testInsertOrdemDeServico() {
		OrdemDeServico os = new OrdemDeServico(1, 1, "Não liga");
		OrdemDeServicoDAO dao;
		try {
			dao = new OrdemDeServicoDAO();
			int idGerada = dao.insertOrdemDeServico(os);
			int previsto = 2;
			assertTrue("Id gerado (" + idGerada + ") deve ser maior do que o valor previsto (" + previsto + ")", previsto < idGerada);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
