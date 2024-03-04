package TH;

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
import javax.swing.JOptionPane; 

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtMK;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Đăng Nhập Hệ Thông Quản Lý Bán Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(77, 92, 175, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMtKhu.setBounds(77, 171, 175, 40);
		contentPane.add(lblMtKhu);
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtTen.setBounds(273, 92, 243, 40);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtMK = new JTextField();
		txtMK.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtMK.setColumns(10);
		txtMK.setBounds(273, 171, 243, 40);
		contentPane.add(txtMK);
		
		JButton btnNewButton = new JButton("ĐĂNG NHẬP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(225, 273, 188, 40);
		contentPane.add(btnNewButton);
	}
	void XuLyDangNhap() {
		String strTen = txtTen.getText();
		String strMK = txtMK.getText();
		
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			HomeFrame home = new HomeFrame();
			home.setVisible(true);
			
			this.setVisible(false);
		}
		else {
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this ,"Đăng Nhập Thất Bại");
		}
	}

}
