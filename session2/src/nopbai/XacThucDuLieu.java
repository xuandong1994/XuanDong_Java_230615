package nopbai;

import java.util.Scanner;

public class XacThucDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTriangle = false;
        while (!isTriangle) {
            System.out.println("****** NHẬP CẠNH TAM GIÁC ******");
            System.out.println("Mời nhập canh a: ");
            double canhA = sc.nextDouble();
            System.out.println("Mời nhập canh b : ");
            double canhB = sc.nextDouble();
            System.out.println("Mời nhập cạnh c : ");
            double canhC = sc.nextDouble();
            if (canhA > 0 && canhB >0 && canhC > 0 && (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA)){
                isTriangle =true;
                double chuVi = canhA + canhB +canhC;
                double p = chuVi / 2 ;
                double dienTich = Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
                System.out.println("Chu vi tam giác là : " + chuVi);
                System.out.println("Diện tích tam giác là : " + dienTich);
            }else {
                System.out.println("Ba cạnh không thỏa mãn điều kiện ,Vui lòng nhập lại");
            }
            System.out.println();
        }
    }
}
