package nopbai;

public class TimSoChiaHet {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            if (count % 5 == 0 && count % 7 == 0 && count % 11 == 0) {
                break;
            }
            count++;
        }
        System.out.println("số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là : " + count);
    }
}
