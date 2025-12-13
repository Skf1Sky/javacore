package Buoi5;

import java.util.Locale;
import java.util.Scanner;

public class bai1 {
    public static String cauA(String s){
        return s.substring(6);
    }
    // b. Thay o thành f
    public  static String cauB(String s){
        return s.replace('o','f');
    }
    //c. Đếm xem có bao nhiêu chữ l
    public static int cauC(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'l'){
                count++;
            }
        }
        return count;
    }
    //d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
    public static String cauD(String s){
        int firt = s.indexOf('l');
        int last = s.lastIndexOf('l');

        return "Vi tri dau: " + firt + " Vi tri cuoi: " + last;
    }
    //e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
    public static String cauE(String s){
        return s.replace(" ","");
    }
    //f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
    public static String cauF(String s){
        return s.trim();
    }
    //g. Đảo chuỗi thành dlroW olleH
    public static String cauG(String s){
        String count = "";
        for(int i = s.length() - 1; i >= 0; i--){
            count += s.charAt(i);
        }
        return count;
    }
    //h. Tạo thành chuỗi "SQC Hello World": Có thể sử dụng phương thức concat() hoặc toán tử '+' để nối chuỗi.
    public static String cauH(String s){
        return "SQC ".concat(s);
    }
    //i. Đổi toàn bộ kí tự của S sang chữ Hoa: Sử dụng phương thức toUpperCase().
    public static String cauI(String s){
        return cauH(s).toUpperCase();
    }
    //k. Đổi toàn bộ kí tự của S sang chữ thường
    public static String cauK(String s){
        return cauI(s).toLowerCase();
    }
    // l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
    public static String cauL(String s, int n, int m){
        return cauH(s).substring(n,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Hello World";
        System.out.println("Cau a: " + cauA(s));
        System.out.println("Cau b: " + cauB(s));
        System.out.println("Cau c: " + cauC(s));
        System.out.println("Cau d: " + cauD(s));
        System.out.println("Cau e: " + cauE(s));
        System.out.println("Cau f: " + cauF(s));
        System.out.println("Cau g: " + cauG(s));
        System.out.println("Cau h: " + cauH(s));
        System.out.println("Cau i: " + cauI(s));
        System.out.println("Cau j: " + cauK(s));

        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap m: ");
        int m  = sc.nextInt();

        System.out.println("Caul: " + cauL(s,n,m));
    }

}

