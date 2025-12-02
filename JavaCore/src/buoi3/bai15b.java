package buoi3;

public class bai15b {
    public static void main(String[] args) {
        {
            int row = 7;
            int column = 6;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= column; j++) {
                    if (i == 1 || j == 1 || j == column) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

