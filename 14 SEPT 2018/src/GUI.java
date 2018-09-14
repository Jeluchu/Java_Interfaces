import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.Frame;
import java.util.Locale;
import java.awt.ComponentOrientation;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPopupMenu;

public class GUI {

	private JFrame frmWindowsinterfaceuser;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmWindowsinterfaceuser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWindowsinterfaceuser = new JFrame();
		frmWindowsinterfaceuser.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		frmWindowsinterfaceuser.setLocale(new Locale("es", "ES"));
		frmWindowsinterfaceuser.setTitle("WindowsInterfaceUser");
		frmWindowsinterfaceuser.getContentPane().setForeground(new Color(0, 0, 0));
		frmWindowsinterfaceuser.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Desktop\\eclipse-workspace\\20180914\\res\\windows.png"));
		frmWindowsinterfaceuser.getContentPane().setBackground(SystemColor.textHighlight);
		frmWindowsinterfaceuser.setResizable(false);
		frmWindowsinterfaceuser.setBounds(100, 100, 523, 264);
		frmWindowsinterfaceuser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindowsinterfaceuser.getContentPane().setLayout(null);
		
		JToggleButton btnNewButton_1 = new JToggleButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.exit(0); //PARA SALIR DEL PROGRAMA
				String mensaje;
				mensaje = "¡NO HAS ESCRITO NINGÚN CAMPO!";
				System.out.println(mensaje);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 102, 153));
		btnNewButton_1.setBounds(237, 168, 86, 23);
		frmWindowsinterfaceuser.getContentPane().add(btnNewButton_1);
			
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(91, 74, 54, 14);
		frmWindowsinterfaceuser.getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(155, 73, 171, 20);
		frmWindowsinterfaceuser.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(155, 107, 171, 20);
		frmWindowsinterfaceuser.getContentPane().add(passwordField);
		
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setForeground(Color.WHITE);
		lblContrasea_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblContrasea_1.setBounds(70, 108, 75, 14);
		frmWindowsinterfaceuser.getContentPane().add(lblContrasea_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\eclipse-workspace\\20180914\\res\\windows.png"));
		lblNewLabel.setBounds(370, 0, 147, 235);
		frmWindowsinterfaceuser.getContentPane().add(lblNewLabel);
		
		JLabel lblIniciaSesin = new JLabel("Inicia sesi\u00F3n");
		lblIniciaSesin.setForeground(new Color(255, 255, 255));
		lblIniciaSesin.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblIniciaSesin.setBounds(237, 36, 98, 20);
		frmWindowsinterfaceuser.getContentPane().add(lblIniciaSesin);
		
		JCheckBox chckbxRecordarContrasea = new JCheckBox("Recordar contrase\u00F1a");
		chckbxRecordarContrasea.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		chckbxRecordarContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxRecordarContrasea.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		chckbxRecordarContrasea.setForeground(new Color(255, 255, 255));
		chckbxRecordarContrasea.setBorder(null);
		chckbxRecordarContrasea.setContentAreaFilled(false);
		chckbxRecordarContrasea.setBounds(155, 134, 168, 23);
		frmWindowsinterfaceuser.getContentPane().add(chckbxRecordarContrasea);
		
		JSeparator separator = new JSeparator();
		separator.setEnabled(false);
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(297, 60, 30, 1);
		frmWindowsinterfaceuser.getContentPane().add(separator);
		
	}
}
