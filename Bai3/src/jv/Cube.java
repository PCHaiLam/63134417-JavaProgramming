package jv;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double canh;
				
				Scanner s = new Scanner(System.in);
				
				System.out.print("Nhập cạnh của khối lập phương: ");
				canh = s.nextDouble();
				
				System.out.printf("Thể tích: %.2f", Math.pow(canh, 3));
	}

}
