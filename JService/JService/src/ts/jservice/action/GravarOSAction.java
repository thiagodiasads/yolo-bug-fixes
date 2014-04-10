package ts.jservice.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

class GravarOSAction extends AbstractAction {
	public GravarOSAction() {
		putValue(NAME, "Gravar");
		putValue(SHORT_DESCRIPTION, "Some short description");
	}
	public void actionPerformed(ActionEvent e) {
	}
}