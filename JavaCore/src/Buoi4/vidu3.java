package Buoi4;

import java.util.Scanner;

public class vidu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chu");
        String a = sc.nextLine();
        System.out.println(inHoa(a));
    }

    public static String inHoa(String a) {
        return a.toUpperCase();
    }
}
