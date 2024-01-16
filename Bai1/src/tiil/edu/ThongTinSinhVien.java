package tiil.edu;

import java.util.Scanner;

public class ThongTinSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diem;
		String hoTen;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nhập họ tên: ");
		hoTen = s.nextLine();
		System.out.print("Nhập điểm TB: ");
		diem = s.nextDouble();
		
		System.out.printf("%s %.2f", hoTen, diem);
	}

}
