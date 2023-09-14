package nopbai;

import java.util.Scanner;

public class TinhTongCacSoChan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Mời nhập Giá trị đầu");
        int start = Integer.parseInt(input.nextLine());
        System.out.println("Mời nhập giá trị cuối");
        int end = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = start; i < end ; i++) {
            if (i % 2 ==0){
                sum +=i;
            }
        }
        System.out.println("Tính Tổng các số chẵn trong khoảng từ " +start + " đến " + end +" là " + sum);
    }
}
