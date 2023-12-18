package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot thang trong nam");
		int thang = sc.nextInt();
		int songay;
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			songay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			songay = 30;
			break;
		case 2:
			songay = 28;
		default:
			System.out.println("thang ko hop le");
			return;
		}
		System.out.println("tháng" + thang + "có" + songay + "ngày");
	}

}
