package baitapbuoi4;

import java.util.Scanner;

public class Baitapbuoi4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập giá trị : ");
        int n = sc.nextInt();

        System.out.println("bài2======");
        bai2(n);
        System.out.println("bài3======");
        bai3(n);
        System.out.println("bài4======");
        bai4(n);
        System.out.println("bài5======");
        bai5(n);
        System.out.println("bài6======");
        bai6(n);
        

        sc.close();
    }

    public static void bai2(int n) {
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void bai3(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }
    }

    public static void bai4(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { 
                System.out.println(i);
            }
        }
    }

    public static void bai5(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) { 
                System.out.println(i);
            }
        }
    }

    public static void bai6(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) { 
                System.out.println(i);
            }
        }
    }

}
