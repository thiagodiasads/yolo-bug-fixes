package ts.jservice.action;

import java.awt.event.ActionEvent;

import javax.swing.*;

import ts.jservice.dao.OrdemDeServicoDAO;
import ts.jservice.pojo.OrdemDeServico;
import ts.jservice.swing.OrdemDeServicoPanel;

public class GravarOSAction extends AbstractAction {
	private OrdemDeServicoPanel ordemDeServico;

	public GravarOSAction(OrdemDeServicoPanel ordemDeServico) {
		putValue(NAME, "Gravar");
		putValue(SHORT_DESCRIPTION, "Gravar ordem de serviço.");
		this.ordemDeServico = ordemDeServico;

	}

	public void actionPerformed(ActionEvent e) {
		OrdemDeServico ordem = ordemDeServico.getOrdemDeServico();
		OrdemDeServico.gravaOrdem(ordem);
	}

	/*
	 * public void gravaOrdem (int objOrdemDeServico){
	 * 
	 * OrdemDeServicoDAO con = new OrdemDeServicoDAO(); OrdemDeServico os = new
	 * OrdemDeServico(); OrdemDeServicoPanel osp = new OrdemDeServicoPanel();
	 * 
	 * 
	 * os.setId_os(objOrdemDeServico); osp.set
	 */

}
