package buoi3;

public class bai23 {
    public static void main(String[] args) {
        System.out.println("Các số từ 10 đến 99 thỏa mãn điều kiện:");

        for (int n = 10; n <= 99; n++) {
            int a = n / 10;   // chữ số hàng chục
            int b = n % 10;   // chữ số hàng đơn vị

            if (a * b == 2 * (a + b)) {
                System.out.println(n);
            }
        }
    }
    }

