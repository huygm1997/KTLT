package nhat107379;

import java.util.Scanner;  

public class baitap2buoi3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien cua ban: ");
        String maSV = scanner.nextLine();  
        System.out.print("Nhap ho va ten cua ban : ");
        String hoVaTen = scanner.nextLine(); 
        System.out.print("Nhap ngay sinh cua ban: ");
        String ngaySinh = scanner.nextLine(); 
        System.out.print("Nhap lop cua ban: ");
        String lop = scanner.nextLine(); 
        System.out.print("Nhap khoa cua ban: ");
        String khoa = scanner.nextLine(); 
        System.out.print("Nhap dia chi cua ban: ");
        String diaChi = scanner.nextLine(); 
        System.out.print("Nhap gioi tinh cua ban: ");
        String gt = scanner.nextLine();  
        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = scanner.nextInt(); 
     

       
        System.out.println("Ma sinh vien :" + maSV);
        System.out.println("Ho va ten: " + hoVaTen );
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gt);
        System.out.println("Lop: " + lop);
        System.out.println("Khoa: " + khoa);
        System.out.println("Dia chi: " + diaChi);
        
        scanner.close();
    }
}