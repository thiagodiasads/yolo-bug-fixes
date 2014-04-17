package ts.jservice.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.smartcardio.Card;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

import ts.jservice.OrdemDeServico;

import java.awt.CardLayout;

public class OSFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private CardLayout a;

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
		configureFrame(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmCadastrarOrdemDe = mnArquivo.add(action);
		mntmCadastrarOrdemDe.setText("Cadastrar Ordem de Servi\u00E7o");

		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 a = new CardLayout(0,0); 
		JPanel p1 = new OrdemDeServico();
		JPanel p2 = new JPanel();
		contentPane.setLayout(a);
		contentPane.add(p2, "p2");
		contentPane.add(p1,"p1");
		

	}

	private static void configureFrame(final JFrame frame) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		URL iconFile = OSFrame.class
				.getResource("/ts/jservice/swing/Image/TSIcon.png");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(iconFile));
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}

		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Ordem De Serviço");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			a.show(contentPane, "p1");
			
		}
	}
}
