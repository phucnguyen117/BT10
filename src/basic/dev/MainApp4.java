package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao he so a");
		double a = sc.nextDouble();
		System.out.println("Nhap vao he so b");
		double b = sc.nextDouble();
		System.out.println("Nhap vao he so c");
		double c = sc.nextDouble();
		double delta = b * b - 4 * a * c;
		switch (kiemTraDelta(delta)) {
		case "PhuongTrinhVoNghiem":
			System.out.println("Phuong trinh vo nghiem");
			break;
		case "PhuongTrinhCoMotNghiem":
			double x = -b / (2 * a);
			System.out.println("Phuong trinh co mot nghiem duy nhat x =");
			break;
		case "PhuongTrinhCoHaiNghiem":
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong Trinh co hai nghiem x1 =" + x1 + "va x2 =" + x2);
			break;
		}
	}

	public static String kiemTraDelta(double delta) {
		if (delta < 0) {
			return "PhuongTrinhVoNghiem";
		} else if (delta == 0) {
			return "PhuongTrinhCoMotNgiem";
		} else {
			return "PhuongTrinhCoHaiNghiem";
		}
	}

}
