package ts.jservice.swing;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OSFrame extends JFrame {

	private static final long serialVersionUID = 2894872370201254311L;
	
	private JPanel contentPane;
	
	public static final String PAINEL_PRINCIPAL = "PRINCIPAL";
	public static final String PAINEL_CADASTRAR_OS = "CADASTRAR_OS";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OSFrame frame = new OSFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OSFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 529);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		JMenuItem mntmCadastrarOrdemDe = new JMenuItem("Cadastrar Ordem de Servi\u00E7o");
		mnArquivo.add(mntmCadastrarOrdemDe);
		mntmCadastrarOrdemDe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showFrame(OSFrame.PAINEL_CADASTRAR_OS);
			}
		});
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		mntmSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel ordemDeServicoPanel = new OrdemDeServicoPanel(this);
		JPanel principal = new JPanel();
		contentPane.setLayout(new CardLayout());
		contentPane.add(principal, OSFrame.PAINEL_PRINCIPAL);
		contentPane.add(ordemDeServicoPanel, OSFrame.PAINEL_CADASTRAR_OS);
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	public void showFrame(String nomePainel) {
		CardLayout a = (CardLayout) contentPane.getLayout();
		a.show(contentPane, nomePainel);
	}
}