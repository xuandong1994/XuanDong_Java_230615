package Baitaptonghop;

import java.util.Scanner;

public class JavaConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number != 8) {
            System.out.println("********MENU*********");
            System.out.println("1. Kiểm tra số chẵn lẻ ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số hoàn hảo");
            System.out.println("4. In ra chia hết cho 3 và 5 trong khoảng 1 - number");
            System.out.println("5. Tính tổng các ước số của number");
            System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1-number");
            System.out.println("7. . Nhập 2 số nguyên (number1, number2), kiểm tra number có trong\n" +
                    "khoảng (number1,number2)\n");
            System.out.println("Thoát");
            System.out.println("Mời bạn chọn số từ 1- 8");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Mời nhập số : ");
                    int number1 = sc.nextInt();
                    if (number1 % 2 == 0) {
                        System.out.println("Là số chẵn");
                    } else System.out.println("là số lẻ");
                    break;
                case 2:
                    System.out.println("Mời nhập số nguyên");
                    int number2 = sc.nextInt();
                    boolean isPrime = true;
                    if (number2 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i < number2; i++) {
                            if (number2 % i == 0) {
                                isPrime = true;
                                break;
                            }

                        }
                    }
                    if (isPrime) {
                        System.out.println("Là số nguyên tố");
                    } else System.out.println("Không phải số nguyên tố");
                    break;
                case 3:
                    System.out.println("Mời nhập số");
                    int soHoanHao = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i < soHoanHao; i++) {
                        if (soHoanHao % i == 0) {
                            sum += i;
                        }

                    }
                    if (sum == soHoanHao) {
                        System.out.println("Là số hoàn hả0");

                    } else System.out.println("Không phải số hoàn hảo");
                    break;
                case 4:
                    System.out.println("Mời nhập số ");
                    int soChia = sc.nextInt();
                    for (int i = 0; i < soChia; i++) {
                        if (soChia % 3 == 0 && soChia % 5 == 0) {
                            System.out.println("Các số chia hết cho 5 và 7" + i + " ");
                            break;
                        }

                    }
                    System.out.println();

                case 5:
                    System.out.println("Mời nhập số ");
                    int tinhTong = sc.nextInt();
                    int sum1 = 0;
                    for (int i = 0; i < tinhTong / 2; i++) {
                        if (tinhTong % i == 0) {
                            sum1 += i;
                        }

                    }
                    System.out.println("Tổng các ước" + tinhTong + " là " + sum1);
                    break;
                case 6:
                    System.out.println("Mời nhập số");
                    int tinhTongSoNguyenTo = sc.nextInt();
                    int sum2 = 0;

                    if (tinhTongSoNguyenTo <= 1) {
                        System.out.println("Số nhập phải lớn hơn 1");
                    } else {
                        for (int i = 2; i <= tinhTongSoNguyenTo; i++) {
                            boolean isPrime1 = true;
                            for (int j = 2; j < i; j++) {
                                if (i % j == 0){
                                    isPrime1 = false;
                                    break;
                                }
                                
                            }
                            if (isPrime1) {
                                sum2 += i;

                            }
                        }
                        System.out.println("Tông các số nguyên tố từ 1-" + tinhTongSoNguyenTo + " là " + sum2 + ".");
                        break;
                    }
                case 7:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Mời nhập số thứ 1 ");
                    int numberOne = sc.nextInt();
                    System.out.println("Mời nhập số thứ 2");
                    int numberTow = sc.nextInt();
                    if (number >= numberOne && number <= numberTow){
                        System.out.println( number + "nằm trong khoảng " + numberOne + "," +numberTow);
                    }else System.out.println( number + "không nằm trong khoảng " + numberOne + "," +numberTow);

            }
        }
        System.out.println();
    }
}
