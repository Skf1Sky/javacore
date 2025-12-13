package Util;

public class ArrayUtil {

    // ============================================================
    // PHẦN 1: CÁC HÀM CƠ BẢN & HỖ TRỢ ĐA KIỂU DỮ LIỆU (HELPER)
    // ============================================================

    // Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Hàm in mảng số nguyên
    public static void printArray(int[] a) {
        if (a == null) return;
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // --- KỸ THUẬT OVERLOADING (NẠP CHỒNG) CHO HÀM SWAP ---
    // Giúp đổi chỗ được cả Số, Chữ, Số thực (Dùng cho bài Nhân Viên)

    // 1. Swap cho mảng số nguyên (Tuổi, Ngày công)
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 2. Swap cho mảng Chuỗi (Tên, Mã NV) - MỚI THÊM
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 3. Swap cho mảng Số thực (Lương) - MỚI THÊM
    public static void swap(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // ============================================================
    // PHẦN 2: CÁC HÀM XỬ LÝ LOGIC MẢNG (Sắp xếp, Tách, Gộp...)
    // ============================================================

    // a. Tách các số nguyên tố từ mảng a sang mảng b
    public static int[] extractPrimes(int[] a) {
        int count = 0;
        for (int x : a) {
            if (isPrime(x)) count++;
        }

        int[] b = new int[count];
        int index = 0;
        for (int x : a) {
            if (isPrime(x)) b[index++] = x;
        }
        return b;
    }

    // b. Tách mảng a thành 2 mảng: b (dương) và c (còn lại)
    public static int[][] splitArray(int[] a) {
        int countPos = 0;
        for (int x : a) {
            if (x > 0) countPos++;
        }
        int countOthers = a.length - countPos;

        int[] b = new int[countPos];
        int[] c = new int[countOthers];
        int iB = 0, iC = 0;

        for (int x : a) {
            if (x > 0) b[iB++] = x;
            else c[iC++] = x;
        }

        return new int[][]{b, c};
    }

    // c. Sắp xếp mảng giảm dần
    public static void sortDescending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    // Hàm phụ: Sắp xếp tăng dần
    public static void sortAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    // d. Sắp xếp đặc biệt: Dương giảm -> Âm tăng -> Số 0
    public static void specialSort(int[] a) {
        int nPos = 0, nNeg = 0, nZero = 0;
        for (int x : a) {
            if (x > 0) nPos++;
            else if (x < 0) nNeg++;
            else nZero++;
        }

        int[] pos = new int[nPos];
        int[] neg = new int[nNeg];
        int[] zero = new int[nZero];

        int iP = 0, iN = 0, iZ = 0;
        for (int x : a) {
            if (x > 0) pos[iP++] = x;
            else if (x < 0) neg[iN++] = x;
            else zero[iZ++] = x;
        }

        sortDescending(pos);
        sortAscending(neg);

        int index = 0;
        for (int x : pos) a[index++] = x;
        for (int x : neg) a[index++] = x;
        for (int x : zero) a[index++] = x;
    }

    // e. Đảo thứ tự mảng
    public static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            swap(a, i, n - 1 - i);
        }
    }

    // f. Kiểm tra đối xứng
    public static boolean isSymmetric(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) return false;
        }
        return true;
    }

    // g. Đếm cặp đối xứng
    public static int countSymmetricPairs(int[] a) {
        int count = 0;
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] == a[n - 1 - i]) count++;
        }
        return count;
    }

    // ============================================================
    // PHẦN 3: CÁC HÀM THÊM / XÓA / SỬA (MODIFY)
    // ============================================================

    // a. Sửa các số nguyên tố thành số 0 (Sửa trực tiếp)
    public static void replacePrimesWithZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                a[i] = 0;
            }
        }
    }

    // b. Chèn số 0 sau SNT (Trả về mảng mới)
    public static int[] insertZeroAfterPrimes(int[] a) {
        int primeCount = 0;
        for (int x : a) {
            if (isPrime(x)) primeCount++;
        }

        int[] newArr = new int[a.length + primeCount];
        int idx = 0;

        for (int x : a) {
            newArr[idx++] = x;
            if (isPrime(x)) {
                newArr[idx++] = 0;
            }
        }
        return newArr;
    }

    // c. Xóa các phần tử có giá trị k
    public static int[] removeAllValues(int[] a, int k) {
        int newSize = 0;
        for (int x : a) {
            if (x != k) newSize++;
        }

        int[] newArr = new int[newSize];
        int idx = 0;
        for (int x : a) {
            if (x != k) {
                newArr[idx++] = x;
            }
        }
        return newArr;
    }

    // d. Xóa tất cả số nguyên tố
    public static int[] removeAllPrimes(int[] a) {
        int newSize = 0;
        for (int x : a) {
            if (!isPrime(x)) newSize++;
        }

        int[] newArr = new int[newSize];
        int idx = 0;
        for (int x : a) {
            if (!isPrime(x)) {
                newArr[idx++] = x;
            }
        }
        return newArr;
    }

    // e. Chèn phần tử vào vị trí k (Giữ nguyên size, mất phần tử cuối)
    public static void insertAtPositionFixed(int[] a, int value, int k) {
        if (k < 0 || k >= a.length) {
            System.out.println("Vi tri k khong hop le!");
            return;
        }
        for (int i = a.length - 1; i > k; i--) {
            a[i] = a[i - 1];
        }
        a[k] = value;
    }
}