package nopbai;

import java.util.Scanner;

public class TinhChuVi_DienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("*********MENU*********");
            System.out.println("1. Tính chu vi diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi diện tích hình tam giác");
            System.out.println("3. Tính chu vi diện tích hình hình tròn");
            System.out.println("4. thoát");
            System.out.println("Vui lòng chọn chức năng (1-4)");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập chiều dài: ");
                    double length = sc.nextDouble();
                    System.out.println("Mời nhập chiều rộng : ");
                    double width = sc.nextDouble();
                    System.out.println("Diện tích hình chữ nhật là " + length * width);
                    System.out.println("Chu vi hình chữ nhật là " + 2 * length * width);
                    break;
                case 2:
                    System.out.println("Nhập cạnh a : ");
                    double canhA = sc.nextDouble();
                    System.out.println("Mời nhập cạnh b: ");
                    double canhB = sc.nextDouble();
                    System.out.println("Mời nhập cạnh c:");
                    double canhC = sc.nextDouble();
                    double chuViTamGiac = canhA + canhB + canhC;
                    double p = chuViTamGiac / 2;
                    double dienTichTamGiac = Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
                    System.out.println("Chu vi hình tam giác" + chuViTamGiac);
                    System.out.println("Diện tích hình tam giác " + dienTichTamGiac );
                    break;
                case 3 :
                    System.out.println("Nhập bán kính đường tròn");
                    double banKinh = sc.nextDouble();
                    double chuVi = 2 * Math.PI * banKinh;
                    double dienTich = Math.PI * Math.pow (banKinh ,2);
                    System.out.println("Chu vi hình tròn " + chuVi);
                    System.out.println("Diện tích hình tròn " + dienTich);
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
            sc.nextLine();

        }
    }
}
