package TH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField txtKQ;

	/**
	 * Create the frame.
	 */
	public PTB2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập hệ số của PTB2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 36, 212, 42);
		contentPane.add(lblNewLabel);
		
		a = new JTextField();
		a.setFont(new Font("Tahoma", Font.PLAIN, 20));
		a.setBounds(127, 88, 66, 42);
		contentPane.add(a);
		a.setColumns(10);
		
		JLabel lblX = new JLabel(" x");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX.setBounds(194, 88, 25, 42);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("2");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX_1.setBounds(214, 75, 25, 42);
		contentPane.add(lblX_1);
		
		b = new JTextField();
		b.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b.setColumns(10);
		b.setBounds(275, 88, 66, 42);
		contentPane.add(b);
		
		JLabel lblX_2 = new JLabel(" x");
		lblX_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX_2.setBounds(342, 88, 25, 42);
		contentPane.add(lblX_2);
		
		c = new JTextField();
		c.setFont(new Font("Tahoma", Font.PLAIN, 20));
		c.setColumns(10);
		c.setBounds(411, 88, 66, 42);
		contentPane.add(c);
		
		JLabel lblX_4 = new JLabel(" +");
		lblX_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX_4.setBounds(229, 88, 25, 42);
		contentPane.add(lblX_4);
		
		JLabel lblX_4_1 = new JLabel(" +");
		lblX_4_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX_4_1.setBounds(365, 88, 25, 42);
		contentPane.add(lblX_4_1);
		
		JLabel lblX_4_1_1 = new JLabel(" =");
		lblX_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX_4_1_1.setBounds(487, 88, 25, 42);
		contentPane.add(lblX_4_1_1);
		
		JLabel lblX_4_1_1_1 = new JLabel("0");
		lblX_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblX_4_1_1_1.setBounds(522, 88, 25, 42);
		contentPane.add(lblX_4_1_1_1);
		
		JButton btnNewButton = new JButton("Kiểm tra nghiệm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPTB2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(242, 181, 197, 42);
		contentPane.add(btnNewButton);
		
		JLabel lbkq = new JLabel("Kết quả: ");
		lbkq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbkq.setBounds(25, 291, 82, 42);
		contentPane.add(lbkq);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(127, 291, 244, 42);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
	}
	void GiaiPTB2() {
	    double A = Double.parseDouble(a.getText());
	    double B = Double.parseDouble(b.getText());
	    double C = Double.parseDouble(c.getText());

	    double delta = B * B - 4 * A * C;

	    if (delta > 0) {
	        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
	        double x2 = (-B - Math.sqrt(delta)) / (2 * A);

	        txtKQ.setText("x1 = " + x1 + ", x2 = " + x2);
	    } else if(delta == 0) {
	    	double x = -B / (2 * A);
	        txtKQ.setText("Phương trình có nghiệm kép: x = " + x);
	    }
	    else
	    	txtKQ.setText("Phương trình vô nghiệm");
	}

}
