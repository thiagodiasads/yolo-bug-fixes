package ts.jservice;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class OrdemDeServico extends JPanel {
	private JTextField tfEquipamento;
	private JTextField tfCliente;
	private final Action actionGravarOrdem = new SwingAction();
	private final Action actionCancelar = new SwingAction_1();

	/**
	 * Create the panel.
	 */
	public OrdemDeServico() {
		setLayout(null);
		
		JLabel lblEquipamento = new JLabel("Equipamento:");
		lblEquipamento.setBounds(31, 74, 78, 14);
		add(lblEquipamento);
		
		tfEquipamento = new JTextField();
		tfEquipamento.setBounds(119, 71, 86, 20);
		add(tfEquipamento);
		tfEquipamento.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(31, 116, 46, 14);
		add(lblCliente);
		
		tfCliente = new JTextField();
		tfCliente.setBounds(119, 113, 86, 20);
		add(tfCliente);
		tfCliente.setColumns(10);
		
		JLabel lblProblema = new JLabel("Problema:");
		lblProblema.setBounds(31, 208, 78, 14);
		add(lblProblema);
		
		JButton btnOk = new JButton("OK");
		btnOk.setAction(actionGravarOrdem);
		btnOk.setBounds(324, 420, 89, 23);
		add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setAction(actionCancelar);
		btnCancelar.setBounds(423, 420, 89, 23);
		add(btnCancelar);
		
		JLabel lblOrdemDeServio = new JLabel("Ordem de Servi\u00E7o");
		lblOrdemDeServio.setFont(new Font("Traditional Arabic", Font.PLAIN, 17));
		lblOrdemDeServio.setBounds(204, 11, 139, 23);
		add(lblOrdemDeServio);
		
		JTextArea taProblema = new JTextArea();
		taProblema.setBounds(31, 243, 480, 105);
		add(taProblema);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Gravar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Cancelar");
			putValue(SHORT_DESCRIPTION, "Some short description");
			
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
