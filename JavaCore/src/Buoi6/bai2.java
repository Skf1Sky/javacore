package Buoi6;

import java.util.Scanner;

public class bai2 {
    // Khai báo Scanner và các mảng dạng static (Toàn cục)
    // Để các phương thức nhap/xuat ở dưới có thể truy cập trực tiếp
    static Scanner sc = new Scanner(System.in);
    static int n; // Số lượng nhân viên thực tế

    // Các mảng song song lưu trữ thông tin
    static String[] hoTen;
    static int[] tuoi;
    static String[] gioiTinh;
    static double[] luongCoBan;
    static double[] diemTB;

    public static void main(String[] args) {
        // --- BƯỚC 1: KHỞI TẠO & CẤP PHÁT MẢNG ---
        System.out.println("--- KHOI TAO CHUONG TRINH ---");
        do {
            System.out.print("Nhap so luong nhan viên (n <= 5): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 5);
        sc.nextLine(); // Xử lý trôi lệnh sau khi nhập số

        // Cấp phát bộ nhớ cho các mảng dựa trên n
        hoTen = new String[n];
        tuoi = new int[n];
        gioiTinh = new String[n];
        luongCoBan = new double[n];
        diemTB = new double[n];

        // --- BƯỚC 3 (PHẦN NHẬP): SỬ DỤNG VÒNG LẶP ĐỂ GỌI HÀM NHẬP ---
        System.out.println("\n--- NHAP THONG TIN ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap du lieu cho nhan vien thu " + (i + 1) + ":");
            // Gọi hàm nhập cho vị trí i
            nhapThongTinTai(i);
        }

        // --- BƯỚC 3 (PHẦN XUẤT): SỬ DỤNG VÒNG LẶP ĐỂ GỌI HÀM XUẤT ---
        System.out.println("\n--- DANH SACH NHAN VIEN DA NHAP ---");
        // In tiêu đề cột (tùy chọn)
        System.out.printf("%-20s %-10s %-10s %-15s %-10s\n", "HO TEN", "TUOI", "GIOI TINH", "LUONG", "DIEM TB");

        for (int i = 0; i < n; i++) {
            // Gọi hàm xuất cho vị trí i
            xuatThongTinTai(i);
        }
    }

    // --- BƯỚC 2: PHƯƠNG THỨC NHẬP TẠI VỊ TRÍ INDEX ---
    // Hàm này chỉ nhiệm vụ điền thông tin vào các mảng tại đúng chỉ số index
    public static void nhapThongTinTai(int index) {
        System.out.print(" - Ho ten: ");
        hoTen[index] = sc.nextLine();

        System.out.print(" - Gioi tinh: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print(" - Tuoi: ");
        tuoi[index] = sc.nextInt();

        System.out.print(" - Luong co ban: ");
        luongCoBan[index] = sc.nextDouble();

        System.out.print(" - Diem TB: ");
        diemTB[index] = sc.nextDouble();

        // Quan trọng: Xử lý trôi lệnh sau khi nhập số cuối cùng
        // Để chuẩn bị cho lần nhập chuỗi (Họ tên) của người tiếp theo
        sc.nextLine();
    }

    // --- BƯỚC 2: PHƯƠNG THỨC XUẤT TẠI VỊ TRÍ INDEX ---
    // Hàm này chỉ nhiệm vụ lấy thông tin từ các mảng tại index ra in
    public static void xuatThongTinTai(int index) {
        // Sử dụng printf để canh lề cho đẹp
        System.out.printf("%-20s %-10d %-10s %-15.0f %-10.1f\n",
                hoTen[index],
                tuoi[index],
                gioiTinh[index],
                luongCoBan[index],
                diemTB[index]);
    }
}