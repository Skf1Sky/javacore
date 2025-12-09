package Buoi5;

import java.util.Locale;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String S = "Hello World";
        String Sspace = " Hello World ";
        String SQC="SQC";
        System.out.println("lay ra chu world" + S.substring(6));
        System.out.println("thay o bang f " + S.replace("o", "f"));
        int demL = 0;
        for (int i = 0; i <= S.length(); i++) {
            if (S.charAt(i) == 'l') {
                demL++;
            }
        }
        System.out.println("dem i" + demL);
        int viTriDau = S.indexOf('l');
        int viTriCuoi = S.lastIndexOf('l');
        System.out.println("vi tri dau " + viTriDau);
        System.out.println("vi tri cuoi " + viTriCuoi);

        System.out.println("xoa khoang trang "+ Sspace.replace(" ", ""));
        String daoChuoi="";
        for (int i=S.length()-1;i>=0;i--){
            daoChuoi+=S.charAt(i);
        }
        System.out.println("dao chuoi " + daoChuoi);
        System.out.println("noi chuoi "+SQC.concat(S));
        System.out.println("in hoa"+ S.toUpperCase());
        System.out.println("in thuong" +S.toLowerCase(Locale.ROOT));

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao diem bat dau");
        int n= sc.nextInt();
        System.out.println("nhap vao diem ket thuc");
        int m= sc.nextInt();

    }
}
