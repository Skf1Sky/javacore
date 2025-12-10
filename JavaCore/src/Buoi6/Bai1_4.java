package Buoi6;

import java.util.Scanner;

public class Bai1_4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = Bai1_1.nhapMang(sc);

        int vitri = vitriCuoiCungCuaX(a);
        System.out.println("vitricuoicungcuax" + vitri);



    }

    public static int vitriCuoiCungCuaX(int [] arr){
        System.out.println("nhap vao phan tu ");
        int x = sc.nextInt();
        int vitri=0;
        for (int i=0;i<arr.length-1;i++){
            if (x==arr[i]){
                vitri++;
            }
        }
        return vitri;
        }

    }
}
