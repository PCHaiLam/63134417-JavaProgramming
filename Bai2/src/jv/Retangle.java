package jv;

import java.util.Scanner;

public class Retangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double dai, rong;
				
				Scanner s = new Scanner(System.in);
				
				System.out.print("Nhập chiều dài: ");
				dai = s.nextDouble();
				System.out.print("Nhập chiều rộng: ");
				rong = s.nextDouble();
				
				double chuVi = (dai + rong)*2;
				System.out.printf("Chu vi: %.2f", chuVi);
				
				double dienTich = dai*rong;
				System.out.printf("\nDiện tích: %.2f", dienTich);
				
				System.out.printf("\nCạnh nhỏ: %.2f", Math.min(dai, rong));
	}

}
