package demo;
public class Baitapbuoi6 {
    public static void main(String[] args) {
        // Trường hợp 1
        String hoTen1 = "Nguyễn Văn An";
        String ngaySinh1 = "20/10/2006";
        String diemTongKet1 = "5.5";
        String tuoi1 = "18";

        System.out.println("-----THÔNG TIN SINH VIÊN (Trường hợp 1)-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet1) + " (Float)");
        System.out.println("Tuổi: " + Integer.parseInt(tuoi1) + " (Int)");
        System.out.println("-----HẾT-----");

        // Trường hợp 2
        String hoTen2 = "Nguyễn Văn An";
        String ngaySinh2 = "20/10/2006";
        Float diemTongKet2 = 5.5f;
        int tuoi2 = 18;

        System.out.println("\n-----THÔNG TIN SINH VIÊN (Trường hợp 2)-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2.toString() + " (String)");
        System.out.println("Tuổi: " + Integer.toString(tuoi2) + " (String)");
        System.out.println("-----HẾT-----");
    }
}
