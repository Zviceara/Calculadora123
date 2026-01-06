package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadoraDoAndr;
	private JTextField txfield;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadoraDoAndr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDoAndr = new JFrame();
		frmCalculadoraDoAndr.getContentPane().setBackground(new Color(192, 192, 192));
		frmCalculadoraDoAndr.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagens/pngtree-calculator-icon-calculator-icon-photo-png-image_13598040.png")));
		frmCalculadoraDoAndr.setTitle("Calculadora do André");
		frmCalculadoraDoAndr.setBounds(100, 100, 308, 452);
		frmCalculadoraDoAndr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDoAndr.getContentPane().setLayout(null);
		
		txfield = new JTextField();
		txfield.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txfield.setBackground(new Color(238, 238, 238));
		txfield.setBounds(10, 11, 272, 53);
		frmCalculadoraDoAndr.getContentPane().add(txfield);
		txfield.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfield.setText("");
			}
		});		
		btnC.setForeground(new Color(0, 0, 0));
		btnC.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnC.setBounds(230, 75, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnC);
		
		JButton btndiv = new JButton("÷");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txfield.getText());
				txfield.setText("");
				operacao ="/";
			}
		});
		btndiv.setForeground(new Color(0, 0, 0));
		btndiv.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btndiv.setBounds(230, 128, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btndiv);
		
		JButton btnmult = new JButton("X");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txfield.getText());
				txfield.setText("");
				operacao ="*";
			}
		});
		btnmult.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btnmult.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnmult.setBounds(230, 181, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnmult);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txfield.getText());
				txfield.setText("");
				operacao ="-";
			}
		});
		btnsub.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btnsub.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnsub.setBounds(230, 234, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnsub);
		
		JButton btnadic = new JButton("+");
		btnadic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txfield.getText());
				txfield.setText("");
				operacao ="+";
				
			}
		});
		btnadic.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btnadic.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnadic.setBounds(230, 287, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnadic);
		
		JButton btntotal = new JButton("=");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txfield.getText());
				if(operacao.equals("+")) {
					resultado = numero1 + numero2;
					txfield.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")) {
					resultado = numero1 - numero2;
					txfield.setText(String.valueOf(resultado));
				}else if(operacao.equals("*")) {
					resultado = numero1 - numero2;
					txfield.setText(String.valueOf(resultado));
			}else if(operacao.equals("/")) {
				resultado = numero1 - numero2;
				txfield.setText(String.valueOf(resultado));
			}
			}
		});
		
		btntotal.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btntotal.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btntotal.setBounds(230, 340, 52, 62);
		frmCalculadoraDoAndr.getContentPane().add(btntotal);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn7.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn7.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn7.setBounds(10, 181, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn8.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn8.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn8.setBounds(85, 181, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn9.getText();
				txfield.setText(IngressarNumero);
			}
		});		
		btn9.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn9.setBounds(160, 181, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn4.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn4.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn4.setBounds(10, 234, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn5.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn5.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn5.setBounds(85, 234, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn1.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn1.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn1.setBounds(10, 287, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn2.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn2.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn2.setBounds(85, 287, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn2);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn6.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn6.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn6.setBounds(160, 234, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn3.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn3.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn3.setBounds(160, 287, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn3);
		
		JButton btnPosiNega = new JButton("+/-");
		btnPosiNega.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btnPosiNega.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnPosiNega.setBounds(10, 350, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnPosiNega);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn0.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btn0.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn0.setBounds(85, 350, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btn0);
		
		JButton btnvirg = new JButton(",");
		btnvirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txfield.getText()+btn0.getText();
				txfield.setText(IngressarNumero);
			}
		});
		btnvirg.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		btnvirg.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnvirg.setBounds(160, 350, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnvirg);
		
		JButton btnparen = new JButton("( )");
		btnparen.setForeground(Color.BLACK);
		btnparen.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnparen.setBounds(10, 128, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnparen);
		
		JButton btnporcen = new JButton("%");
		btnporcen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnporcen.setForeground(Color.BLACK);
		btnporcen.setFont(new Font("Arial Black", Font.PLAIN, 14));		
		btnporcen.setBounds(85, 128, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnporcen);
		
		JButton btnraiz = new JButton("√");
		btnraiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnraiz.setForeground(Color.BLACK);
		btnraiz.setFont(new Font("Arial Black", Font.PLAIN, 14));		
		btnraiz.setBounds(160, 128, 52, 42);
		frmCalculadoraDoAndr.getContentPane().add(btnraiz);
	}
}
