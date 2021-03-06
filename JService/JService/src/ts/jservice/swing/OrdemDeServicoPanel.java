package ts.jservice.swing;

import java.awt.Font;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ts.jservice.action.CancelarOSAction;
import ts.jservice.action.GravarOSAction;
import ts.jservice.pojo.OrdemDeServico;

public class OrdemDeServicoPanel extends JPanel {
	
	private static final long serialVersionUID = -9107893096031621113L;
	private JTextField tfEquipamento;
	private JTextField tfCliente;
	private JTextArea taProblema;
	private final Action actionGravarOrdem = new GravarOSAction(this);
	private final Action actionCancelar = new CancelarOSAction(this);
	private final OSFrame framePrincipal;

	/**
	 * Create the panel.
	 */
	public OrdemDeServicoPanel(OSFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
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

		JButton btnCancelar = new JButton("Cancelar");

		btnCancelar.setAction(actionCancelar);
		btnCancelar.setBounds(423, 420, 89, 23);
		add(btnCancelar);

		JLabel lblOrdemDeServico = new JLabel("Ordem de Servi\u00E7o");
		lblOrdemDeServico
				.setFont(new Font("Traditional Arabic", Font.PLAIN, 17));
		lblOrdemDeServico.setBounds(204, 11, 139, 23);
		add(lblOrdemDeServico);

		taProblema = new JTextArea();
		taProblema.setBounds(31, 243, 480, 105);
		add(taProblema);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.setAction(actionGravarOrdem);

		btnGravar.setBounds(291, 420, 89, 23);
		add(btnGravar);
	}

	/*
	 * Foi criado os get and set do novo atributo id_os, falta acrescentar no
	 * return da classe abaixo.
	 */
	public OrdemDeServico getOrdemDeServico() throws Exception {
		try {
			int cliente = Integer.parseInt(tfCliente.getText());
			int equipamento = Integer.parseInt(tfEquipamento.getText());
			String problema = taProblema.getText();
			return new OrdemDeServico(cliente, equipamento, problema);
		} catch(NumberFormatException e) {
			//JOptionPane.showMessageDialog(framePrincipal, "Informar apenas algarismos nos c�digos de cliente e de equipamentos");
			throw new Exception("Informar apenas algarismos nos c�digos de cliente e de equipamentos");
		}
	}

	public OSFrame getFramePrincipal() {
		return framePrincipal;
	}
}