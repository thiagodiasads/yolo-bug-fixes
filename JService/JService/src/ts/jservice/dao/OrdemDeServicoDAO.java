package ts.jservice.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import ts.jservice.pojo.OrdemDeServico;

public class OrdemDeServicoDAO {

	private static final String INSERT_CMD = "insert into ordensdeservico(codigo_cliente_os, codigo_equipamento_os, problema_os) values (?, ?, ?)";

	private Connection connection = null;
	
	public OrdemDeServicoDAO() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	public int insertOrdemDeServico(OrdemDeServico os) throws SQLException, FileNotFoundException, IOException {
		ResultSet generatedKeys = null;
		PreparedStatement insertStmt = null;
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("jservice.properties"));
			String url = props.getProperty("url");
			connection = DriverManager.getConnection(url, props);
			insertStmt = connection.prepareStatement(OrdemDeServicoDAO.INSERT_CMD, Statement.RETURN_GENERATED_KEYS);
			insertStmt.setInt(1, os.getCliente());
			insertStmt.setInt(2, os.getEquipamento());
			insertStmt.setString(3, os.getDescricao());
			
	        int affectedRows = insertStmt.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Falha na criação da OS.");
	        }
	
	        generatedKeys = insertStmt.getGeneratedKeys();
	        if (generatedKeys.next()) {
	            os.setId_os(generatedKeys.getInt(1));
	        } else {
	            throw new SQLException("Falha na criação da OS.");
	        }
	        return os.getId_os();
	    } finally {
	        if (generatedKeys != null) try { generatedKeys.close(); } catch (SQLException logOrIgnore) {}
	        if (insertStmt != null) try { insertStmt.close(); } catch (SQLException logOrIgnore) {}
	        if (connection != null) try { connection.close(); } catch (SQLException logOrIgnore) {}
	    }
	}
}