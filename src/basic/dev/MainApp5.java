package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		System.out.println("Nhap c");
		int c = sc.nextInt();
		switch (kiemTraCacCanh(a,b,c)) {
		case "TamGiac":
			System.out.println("Ba so" +a + "," + b +"," +c + "la tam giac");
		    break;
		default:
			System.out.println("Ba so" + a + "," + b +"," + c + "ko phai tam giac");
			break;
		}
	}
	public static String kiemTraCacCanh(int a, int b, int c) {
		if (a+ b > c && a + c > b && b + c > a) {
			return "TamGiac";
		}else {
			return "KhongPhaiTamGiac";
		}
	}

}
