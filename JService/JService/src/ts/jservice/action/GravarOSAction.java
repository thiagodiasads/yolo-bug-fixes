package ts.jservice.action;

import java.awt.event.ActionEvent;

import javax.swing.*;

import ts.jservice.dao.OrdemDeServicoDAO;
import ts.jservice.pojo.OrdemDeServico;
import ts.jservice.swing.OrdemDeServicoPanel;

public class GravarOSAction extends AbstractAction {

	private static final long serialVersionUID = -2273211784807921272L;
	
	private OrdemDeServicoPanel ordemDeServico;

	public GravarOSAction(OrdemDeServicoPanel ordemDeServico) {
		putValue(NAME, "Gravar");
		putValue(SHORT_DESCRIPTION, "Gravar ordem de serviço.");
		this.ordemDeServico = ordemDeServico;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			OrdemDeServico os = ordemDeServico.getOrdemDeServico();
			OrdemDeServicoDAO dao = new OrdemDeServicoDAO();
			int idGerada = dao.insertOrdemDeServico(os);
			JOptionPane.showMessageDialog(ordemDeServico.getFramePrincipal(), "Gerada OS: " + idGerada);
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(ordemDeServico.getFramePrincipal(), "Informar apenas algarismos nos códigos de cliente e de equipamentos");
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(ordemDeServico.getFramePrincipal(), ex.getMessage());
		}
	}
}