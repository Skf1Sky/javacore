package Buoi6;

import java.util.Scanner;

public class Bai3 {
    // 1. KHAI BÁO DỮ LIỆU TOÀN CỤC (GLOBAL VARIABLES)
    static Scanner sc = new Scanner(System.in);
    static int n; // Số lượng nhân viên

    // Các mảng song song
    static String[] hoTen;
    static String[] gioiTinh;
    static int[] tuoi;
    static double[] luongCoBan;
    static double[] diemTB;

    public static void main(String[] args) {
        // --- BƯỚC 1: NHẬP LIỆU (Giữ nguyên logic bài trước) ---
        nhapDanhSachNhanVien();

        // --- BƯỚC 2: THỰC HIỆN CÁC YÊU CẦU ĐỀ BÀI ---

        // a. Tìm nhân viên điểm cao nhất
        timNhanVienDiemCaoNhat();

        // b. Tìm chính xác theo tên
        timKiemChinhXac();

        // c. Tìm gần đúng (Mềm)
        timKiemGanDung();
    }

    // ============================================================
    // A. TÌM ĐIỂM TRUNG BÌNH CAO NHẤT
    // ============================================================
    public static void timNhanVienDiemCaoNhat() {
        System.out.println("\n--- A. NHAN VIEN CO DIEM CAO NHAT ---");

        // Bước 1: Tìm con số lớn nhất (Max Value)
        double maxDiem = diemTB[0];
        for (int i = 1; i < n; i++) {
            if (diemTB[i] > maxDiem) {
                maxDiem = diemTB[i];
            }
        }

        // Bước 2: In tất cả những ai có điểm bằng Max (Đề phòng có nhiều người bằng điểm nhau)
        System.out.println("Diem cao nhat la: " + maxDiem);
        System.out.printf("%-20s %-10s %-10s %-15s %-10s\n", "HO TEN", "TUOI", "GIOI TINH", "LUONG", "DIEM TB");

        for (int i = 0; i < n; i++) {
            if (diemTB[i] == maxDiem) {
                xuatThongTinTai(i);
            }
        }
    }

    // ============================================================
    // B. TÌM KIẾM CHÍNH XÁC (Exact Match)
    // ============================================================
    public static void timKiemChinhXac() {
        System.out.println("\n--- B. TIM KIEM CHINH XAC ---");
        System.out.print("Nhap ho ten day du can tim: ");
        String tenCanTim = sc.nextLine();
        boolean timThay = false;

        System.out.println("Ket qua tim kiem:");
        for (int i = 0; i < n; i++) {
            // equalsIgnoreCase: So sánh bằng nhưng không phân biệt hoa thường
            // Ví dụ: "nguyen van a" vẫn tìm ra "Nguyen Van A"
            if (hoTen[i].equalsIgnoreCase(tenCanTim)) {
                xuatThongTinTai(i);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("-> Khong tim thay nhan vien nao ten la: " + tenCanTim);
        }
    }

    // ============================================================
    // C. TÌM KIẾM GẦN ĐÚNG (Contains / Soft Search)
    // ============================================================
    public static void timKiemGanDung() {
        System.out.println("\n--- C. TIM KIEM GAN DUNG (MEM) ---");
        System.out.print("Nhap tu khoa ten (vd: Hoang): ");
        String tuKhoa = sc.nextLine();
        boolean timThay = false;

        System.out.println("Ket qua tim kiem:");
        for (int i = 0; i < n; i++) {
            // Mẹo: Chuyển cả tên trong mảng và từ khóa về chữ thường (toLowerCase)
            // Sau đó dùng contains để kiểm tra chứa
            String tenTrongMang = hoTen[i].toLowerCase();
            String tuKhoaThuong = tuKhoa.toLowerCase();

            if (tenTrongMang.contains(tuKhoaThuong)) {
                xuatThongTinTai(i);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("-> Khong tim thay ket qua nao chua tu: " + tuKhoa);
        }
    }

    // ============================================================
    // CÁC HÀM PHỤ TRỢ (HELPER FUNCTIONS) - Tái sử dụng code
    // ============================================================

    public static void nhapDanhSachNhanVien() {
        do {
            System.out.print("Nhap so luong nhan vien (n > 0): ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // Xử lý trôi lệnh

        // Cấp phát mảng
        hoTen = new String[n];
        gioiTinh = new String[n];
        tuoi = new int[n];
        luongCoBan = new double[n];
        diemTB = new double[n];

        System.out.println("--- NHAP THONG TIN ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien thu " + (i + 1) + ":");
            System.out.print(" - Ho ten: "); hoTen[i] = sc.nextLine();
            System.out.print(" - Gioi tinh: "); gioiTinh[i] = sc.nextLine();
            System.out.print(" - Tuoi: "); tuoi[i] = sc.nextInt();
            System.out.print(" - Luong CB: "); luongCoBan[i] = sc.nextDouble();
            System.out.print(" - Diem TB: "); diemTB[i] = sc.nextDouble();
            sc.nextLine(); // Chống trôi lệnh
        }
    }

    public static void xuatThongTinTai(int i) {
        System.out.printf("%-20s %-10d %-10s %-15.0f %-10.1f\n",
                hoTen[i], tuoi[i], gioiTinh[i], luongCoBan[i], diemTB[i]);
    }
}