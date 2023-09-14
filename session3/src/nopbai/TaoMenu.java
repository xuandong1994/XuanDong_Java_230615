package nopbai;

import java.util.Scanner;

public class TaoMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("**********MENU**********");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số có chia hết cho 3 không");
            System.out.println("4. Thoát ");
            System.out.println("Vui lòng chọn chức năng từ (1-4):");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập số nguyên:");
                    int number1 = scanner.nextInt();
                    if (number1 % 2 == 0) {
                        System.out.println("Là số chẵn");
                    } else {
                        System.out.println("Là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số nguyên:");
                    int number2 = scanner.nextInt();
                    boolean isPrime = true;
                    if (number2 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i < number2; i++) {
                            if (number2 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(number2 + " là số nguyên tố");
                    } else {
                        System.out.println(number2 + " không là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập số nguyên:");
                    int number3 = scanner.nextInt();
                    if (number3 % 3 == 0) {
                        System.out.println(number3 + " chia hết cho 3");
                    } else {
                        System.out.println(number3 + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số nguyên để tránh lỗi khi đọc lựa chọn tiếp theo.
        }

    }
}