package jv;

import java.util.Scanner;

public class PTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double a,b,c;
				
				Scanner s = new Scanner(System.in);
				
				System.out.print("Nhập hệ số bậc 2: ");
				a = s.nextDouble();
				System.out.print("Nhập hệ số bậc 1: ");
				b = s.nextDouble();
				System.out.print("Nhập hệ tự do: ");
				c = s.nextDouble();
				
				double Delta = Math.pow(b, 2) - 4 * a * c;
				System.out.printf("Delta: %.2f", Delta);

				double squareDelta = Math.sqrt(Delta);
				System.out.printf("\nCăn Delta: %.2f", squareDelta);
	}

}
