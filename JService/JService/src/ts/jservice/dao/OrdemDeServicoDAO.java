package ts.jservice.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import ts.jservice.pojo.OrdemDeServico;


public class OrdemDeServicoDAO {

	public void insertOrdemDeServico(final OrdemDeServico os) {


		final String cmd = "insert into ordensdeservico(cliente, equipamento, problema) values (?, ?, ?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties props = new Properties();
			props.load(new FileInputStream("jservice.properties"));
			String url = props.getProperty("url");

			if (os.getId_os() != -1) {
				throw new Exception("Erro ao inserir Ordem de Serviço!");
			}

			connection = DriverManager.getConnection(url, props);

			statement = connection.prepareStatement(cmd);
			statement.setInt(1, os.getCliente());
			statement.setInt(2, os.getEquipamento());
			statement.setString(3, os.getDescricao());
			int r = statement.executeUpdate();
			if (r != 1) {
				throw new Exception("Erro ao inserir Ordem de Servico!");
			}
			
			ResultSet x = statement.getGeneratedKeys();
			x.next();
			int k = x.getInt(1);
			//Implementar método setId_os na classe OrdemDeServico.java
			//os.setId_os(k);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
