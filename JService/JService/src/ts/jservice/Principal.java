package ts.jservice;

import javax.swing.JOptionPane;

import ts.jservice.swing.OrdemDeServicoPanel;

public class Principal {
	
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "lixo");
		OrdemDeServicoPanel os = new OrdemDeServicoPanel();
		os.setVisible(true);
		
	}

}
