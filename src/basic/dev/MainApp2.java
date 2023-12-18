package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot so nguyen n");
		int n = sc.nextInt();
		switch (n % 15) {
		case 0: 
			System.out.println("so" + n + "Chia het cho ca 3 va 5");
			break;
		case 3:
			System.out.println("so" + n + "chia het cho 3 ");
			break;
		case 5:
			System.out.println("so" + n + "chia het cho 5");
			break;
			default:
				System.out.println("so" + n + "ko chia het cho ca 3 va 5");
		}
	}

}
