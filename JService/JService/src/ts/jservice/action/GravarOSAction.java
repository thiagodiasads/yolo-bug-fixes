package ts.jservice.action;

import java.awt.event.ActionEvent;
import javax.swing.*;


//
import ts.jservice.dao.OrdemDeServicoDAO;
import ts.jservice.swing.OrdemDeServicoPanel;
import ts.jservice.OrdemDeServico;

//


import ts.jservice.swing.OrdemDeServicoPanel;

public class GravarOSAction extends AbstractAction {
	private OrdemDeServicoPanel ordemDeServico;

	public GravarOSAction(OrdemDeServicoPanel ordemDeServico) {
		putValue(NAME, "Gravar");
		putValue(SHORT_DESCRIPTION, "Gravar ordem de servi�o.");
		this.ordemDeServico = ordemDeServico;
		
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Teste");
	}
	
	
	/*
	public void gravaOrdem (int objOrdemDeServico){
		
		OrdemDeServicoDAO con = new OrdemDeServicoDAO();
		OrdemDeServico os = new OrdemDeServico();
		OrdemDeServicoPanel osp = new OrdemDeServicoPanel();
		
				
		os.setId_os(objOrdemDeServico);
		osp.set
	
	*/
	
}
