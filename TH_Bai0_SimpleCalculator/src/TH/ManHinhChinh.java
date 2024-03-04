package TH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lbSoA;
	private JTextField lbSoB;
	private JLabel lblKtQu;
	private JTextField lbKQ;

	public ManHinhChinh() {
		setFont(new Font("Arial", Font.BOLD, 14));
		setAlwaysOnTop(true);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(101, 52, 165, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpSTh.setBounds(101, 121, 165, 48);
		contentPane.add(lblNhpSTh);
		
		lbSoA = new JTextField();
		lbSoA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbSoA.setBounds(276, 59, 356, 41);
		contentPane.add(lbSoA);
		lbSoA.setColumns(10);
		
		lbSoB = new JTextField();
		lbSoB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbSoB.setColumns(10);
		lbSoB.setBounds(276, 128, 356, 41);
		contentPane.add(lbSoB);
		
		lblKtQu = new JLabel("KẾT QUẢ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKtQu.setBounds(164, 331, 102, 48);
		contentPane.add(lblKtQu);
		
		lbKQ = new JTextField();
		lbKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbKQ.setColumns(10);
		lbKQ.setBounds(276, 338, 356, 41);
		contentPane.add(lbKQ);
		
		JButton btnPlus = new JButton("CỘNG");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.setBounds(101, 265, 113, 33);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("TRỪ");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(245, 265, 113, 33);
		contentPane.add(btnMinus);
		
		JButton btnMul = new JButton("NHÂN");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMul.setBounds(379, 265, 113, 33);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("CHIA");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDiv.setBounds(519, 265, 113, 33);
		contentPane.add(btnDiv);
	}
	void HamXuLyCong() {
		String str_soA = lbSoA.getText();
		String str_soB = lbSoB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double Tong = soA + soB;
		
		lbKQ.setText( String.valueOf(Tong) );
	}
	void HamXuLyTru() {
		String str_soA = lbSoA.getText();
		String str_soB = lbSoB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double Tong = soA - soB;
		
		lbKQ.setText( String.valueOf(Tong) );
	}
	void HamXuLyNhan() {
		String str_soA = lbSoA.getText();
		String str_soB = lbSoB.getText();
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double Tong = soA * soB;
		
		lbKQ.setText( String.valueOf(Tong) );
	}
	void HamXuLyChia() {
		String str_soA = lbSoA.getText();
		String str_soB = lbSoB.getText();
		
		double a = Double.parseDouble(str_soA);
		double b = Double.parseDouble(str_soB);
		
		double Tong;
		
		if(b != 0) {
			Tong = a/b;
			lbKQ.setText( String.valueOf(Tong) );
		}
		else
			lbKQ.setText( "Không thể chia cho 0" );
	}
}
