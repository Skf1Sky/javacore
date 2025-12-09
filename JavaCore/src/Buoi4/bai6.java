package Buoi4;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String ten = nhanVien.nhapTen();
        int tuoi = nhanVien.nhapTuoi();
        String gioitinh = nhanVien.nhapGioiTinh();
        int luong = nhanVien.nhapLuong();
        long diemtrungbinh = nhanVien.nhapDiemTrungBinh();
        nhanVien.inThongTin(ten,tuoi,gioitinh,luong,diemtrungbinh);
    }

    public class nhanVien {
        static Scanner sc = new Scanner(System.in);

        public static   String nhapTen() {
            System.out.println("nhap ten nhan vien");
            return sc.nextLine();
        }
        public static int nhapTuoi(){
            System.out.println("nhap vao tuoi cua nhan vien");
            return sc.nextInt();
        }
        public static String nhapGioiTinh(){
            System.out.println("nhap vao gioi tinh");
            return sc.nextLine();
        }
        public static int nhapLuong(){
            System.out.println("nhap vao luong co ban");
            return sc.nextInt();
        }
        public static long nhapDiemTrungBinh(){
            System.out.println("nhap vao diem lan luot 3 mon");
            int diemToan = sc.nextInt();
            int diemLy=sc.nextInt();
            int diemHoa=sc.nextInt();
            return ((diemToan+diemLy+diemHoa)/3);
        }
        public static void inThongTin(String ten, int tuoi,String gioitinh,int luong,long diemtrungbinh){
            System.out.println("ten nhan vien" + ten);
            System.out.println("tuoi nhan vien" + tuoi);
            System.out.println("gioi tinh" + gioitinh);
            System.out.println("luong " + luong);
            System.out.println("diem trung binh" + diemtrungbinh);
        }

    }
}
