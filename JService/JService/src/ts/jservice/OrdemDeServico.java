package ts.jservice;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ts.jservice.action.*;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrdemDeServico extends JPanel {
	private JTextField tfEquipamento;
	private JTextField tfCliente;
	private final Action actionGravarOrdem = new GravarOSAction();
	private final Action actionCancelar = new CancelarOSAction();

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
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setAction(actionGravarOrdem);
		btnOk.setBounds(324, 420, 89, 23);
		add(btnOk);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setAction(actionCancelar);
		btnCancelar.setBounds(423, 420, 89, 23);
		add(btnCancelar);

		JLabel lblOrdemDeServio = new JLabel("Ordem de Servi\u00E7o");
		lblOrdemDeServio
				.setFont(new Font("Traditional Arabic", Font.PLAIN, 17));
		lblOrdemDeServio.setBounds(204, 11, 139, 23);
		add(lblOrdemDeServio);

		JTextArea taProblema = new JTextArea();
		taProblema.setBounds(31, 243, 480, 105);
		add(taProblema);

	}
}
