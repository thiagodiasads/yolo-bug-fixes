package ts.jservice.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import ts.jservice.swing.OSFrame;
import ts.jservice.swing.OrdemDeServicoPanel;

public class CancelarOSAction extends AbstractAction {

	private static final long serialVersionUID = -7490439649108137931L;
	
	private OrdemDeServicoPanel ordemDeServico;

	public CancelarOSAction(OrdemDeServicoPanel ordemDeServico) {
		putValue(NAME, "Cancelar");
		putValue(SHORT_DESCRIPTION, "Cancelar Ordem de serviço");
		this.ordemDeServico = ordemDeServico;

	}

	public void actionPerformed(ActionEvent e) {
		ordemDeServico.getFramePrincipal().showFrame(OSFrame.PAINEL_PRINCIPAL);
	}
}