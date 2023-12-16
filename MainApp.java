package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mot so nguyen");
		int n = sc.nextInt();
		switch (KiemTraSoNguyen(n)) {
		case 1:
			System.out.println(n + "la so nguyen duong");
			break;
		case -1:
			System.out.println(n + "la so nguyen am");
			break;
		default:
			System.out.println(n + "ko phai la so nguyen duong hay am");
			break;
		}
	}

	static int KiemTraSoNguyen(int n) {
		if (n > 0) {
			return 1;
		} else if (n < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
