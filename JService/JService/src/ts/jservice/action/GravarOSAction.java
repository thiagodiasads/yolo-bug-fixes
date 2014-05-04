package ts.jservice.action;

import java.awt.event.ActionEvent;

import javax.swing.*;

import ts.jservice.swing.OrdemDeServicoPanel;

public class GravarOSAction extends AbstractAction {
	private OrdemDeServicoPanel ordemDeServico;

	public GravarOSAction(OrdemDeServicoPanel ordemDeServico) {
		putValue(NAME, "Gravar");
		putValue(SHORT_DESCRIPTION, "Gravar ordem de serviço.");
		this.ordemDeServico = ordemDeServico;

	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Teste");
		
	}
}