public static void demo3(int n) {
        System.out.printf("\nDanh sách các phần tử n = %d là:\n", n); 
        for (int i = 1; i <= n; i++) { 
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn!");
            } else {
                System.out.println(i + " là số lẻ");
            }
            System.out.println("\t" + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num3;
        System.out.println("\nNhập giá trị : ");
        num3 = sc.nextInt();
        demo3(num3);
        sc.close();
    }
}
