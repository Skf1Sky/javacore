package buoi7;

import Util.ArrayUtil;

public class Bai1 {
    public static void main(String[] args) {

        int[] a = {1, 2, 8, 7, 3, 7, 4, 2, 1};

        System.out.print("Mang ban dau: ");

        ArrayUtil.printArray(a);
        System.out.println("-----------------------------");

        // a. Tách số nguyên tố
        int[] primes = ArrayUtil.extractPrimes(a);
        System.out.print("a. Cac so nguyen to (Mang b): ");
        ArrayUtil.printArray(primes);

        // b. Tách mảng dương và phần còn lại
        int[][] splitResult = ArrayUtil.splitArray(a);
        System.out.print("b. Mang duong: ");
        ArrayUtil.printArray(splitResult[0]);
        System.out.print("   Mang con lai: ");
        ArrayUtil.printArray(splitResult[1]);

        // f. Kiểm tra đối xứng (Kiểm tra trước khi sắp xếp làm thay đổi mảng)
        if (ArrayUtil.isSymmetric(a)) {
            System.out.println("f. Mang a LA mang doi xung.");
        } else {
            System.out.println("f. Mang a KHONG phai mang doi xung.");
        }

        // g. Đếm số cặp đối xứng
        int pairs = ArrayUtil.countSymmetricPairs(a);
        System.out.println("g. So cap doi xung trong mang: " + pairs);

        // c. Sắp xếp giảm dần

        int[] tempA = a.clone();
        ArrayUtil.sortDescending(tempA);
        System.out.print("c. Mang sap xep giam dan: ");
        ArrayUtil.printArray(tempA);

        // d. Sắp xếp đặc biệt (Dương giảm -> Âm tăng -> 0)
        int[] dArr = {5, -2, 0, 9, -1, 0, 3, -8};
        System.out.print("d. Test sap xep phuc tap voi mang: ");
        ArrayUtil.printArray(dArr);

        ArrayUtil.specialSort(dArr);

        System.out.print("   Ket qua: ");
        ArrayUtil.printArray(dArr);

        // e. Đảo ngược mảng (Dùng mảng a gốc)
        ArrayUtil.reverseArray(a);
        System.out.print("e. Mang a sau khi dao nguoc: ");
        ArrayUtil.printArray(a);
    }
}