package buoi7;

import Util.ArrayUtil;

public class bai3 {
    public static void main(String[] args) {
        // Giả sử ta nhập sẵn dữ liệu cho 5 nhân viên
        // Các vị trí index 0, 1, 2... tương ứng với từng người
        String[] ids      = {"NV1", "NV2", "NV3", "NV4", "NV5"};
        String[] names    = {"An",  "Binh", "Cuong","Dung", "Em"};
        int[] ages        = {30,    25,     40,     22,     28}; // Mảng cần so sánh
        int[] workDays    = {22,    24,     20,     26,     23};
        double[] salaries = {1000,  1200,   2000,   900,    1500};

        int n = 5;
        System.out.println("--- TRUOC KHI SAP XEP ---");
        // In thử mảng Tên và Tuổi để xem
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - Tuoi: " + ages[i]);
        }

        
        

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                // Chỉ so sánh mảng TUỔI
                if (ages[i] > ages[j]) {

                    ArrayUtil.swap(ids, i, j);
                    ArrayUtil.swap(names, i, j);
                    ArrayUtil.swap(ages, i, j);
                    ArrayUtil.swap(workDays, i, j);
                    ArrayUtil.swap(salaries, i, j);
                }
            }
        }

        System.out.println("\n--- SAU KHI SAP XEP (Tuoi tang dan) ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - Tuoi: " + ages[i]);
        }
    }
}