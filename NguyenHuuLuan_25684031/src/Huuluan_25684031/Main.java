package Huuluan_25684031;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ListPhongHoc ds = new ListPhongHoc();

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n========== QUAN LY PHONG HOC ==========");
            System.out.println("1. Them phong ly thuyet");
            System.out.println("2. Them phong may tinh");
            System.out.println("3. Them phong thi nghiem");
            System.out.println("4. Xuat danh sach phong hoc");
            System.out.println("5. Tim phong theo ma");
            System.out.println("6. Xuat cac phong dat chuan");
            System.out.println("7. Sap xep tang dan theo day phong");
            System.out.println("8. Sap xep giam dan theo dien tich");
            System.out.println("9. Sap xep tang dan theo so bong den");
            System.out.println("10. Cap nhat so may tinh theo ma phong");
            System.out.println("11. Xoa phong theo ma");
            System.out.println("12. Tinh tong so phong");
            System.out.println("13. Tim phong may tinh co 60 may");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = nhapInt();

            switch (chon) {
                case 1:
                    themPhongLyThuyet();
                    break;
                case 2:
                    themPhongMayTinh();
                    break;
                case 3:
                    themPhongThiNghiem();
                    break;
                case 4:
                    ds.xuatDanhSach();
                    break;
                case 5:
                    timPhong();
                    break;
                case 6:
                    ds.xuatPhongDatChuan();
                    break;
                case 7:
                    ds.sapXepTheoDayPhong();
                    System.out.println("Da sap xep tang dan theo day phong.");
                    ds.xuatDanhSach();
                    break;
                case 8:
                    ds.sapXepTheoDienTich();
                    System.out.println("Da sap xep giam dan theo dien tich.");
                    ds.xuatDanhSach();
                    break;
                case 9:
                    ds.sapXepTheoSoBongDen();
                    System.out.println("Da sap xep tang dan theo so bong den.");
                    ds.xuatDanhSach();
                    break;
                case 10:
                    capNhatMayTinh();
                    break;
                case 11:
                    xoaPhong();
                    break;
                case 12:
                    System.out.println("Tong so phong: " + ds.tongSoPhong());
                    break;
                case 13:
                    ds.xuatPhongMayTinh60May();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }

    // Nhap so nguyen
    public static int nhapInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Vui long nhap so nguyen: ");
            sc.nextLine();
        }

        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    // Nhap so thuc
    public static double nhapDouble() {
        while (!sc.hasNextDouble()) {
            System.out.print("Vui long nhap so: ");
            sc.nextLine();
        }

        double n = sc.nextDouble();
        sc.nextLine();
        return n;
    }

    // Nhap thong tin chung
    public static String nhapMaPhong() {
        System.out.print("Nhap ma phong: ");
        return sc.nextLine();
    }

    public static String nhapDayPhong() {
        System.out.print("Nhap day phong: ");
        return sc.nextLine();
    }

    public static double nhapDienTich() {
        double dienTich;
        do {
            System.out.print("Nhap dien tich: ");
            dienTich = nhapDouble();

            if (dienTich <= 0) {
                System.out.println("Dien tich phai lon hon 0!");
            }
        } while (dienTich <= 0);

        return dienTich;
    }

    public static int nhapSoBongDen() {
        int soBong;
        do {
            System.out.print("Nhap so bong den: ");
            soBong = nhapInt();

            if (soBong < 0) {
                System.out.println("So bong den khong duoc am!");
            }
        } while (soBong < 0);

        return soBong;
    }

    public static boolean nhapCoKhong(String cauHoi) {
        while (true) {
            System.out.print(cauHoi + " (1: Co, 0: Khong): ");
            int n = nhapInt();

            if (n == 1) return true;
            if (n == 0) return false;

            System.out.println("Chi duoc nhap 1 hoac 0!");
        }
    }

    // Them phong ly thuyet
    public static void themPhongLyThuyet() {
        System.out.println("\n--- THEM PHONG LY THUYET ---");

        String ma = nhapMaPhong();

        if (ds.timPhong(ma) != null) {
            System.out.println("Ma phong da ton tai!");
            return;
        }

        String day = nhapDayPhong();
        double dienTich = nhapDienTich();
        int bongDen = nhapSoBongDen();
        boolean mayChieu = nhapCoKhong("Phong co may chieu khong");

        PhongLyThuyet p = new PhongLyThuyet(
                ma, day, dienTich, bongDen, mayChieu);

        if (ds.themPhong(p)) {
            System.out.println("Them phong thanh cong!");
        }
    }

    // Them phong may tinh
    public static void themPhongMayTinh() {
        System.out.println("\n--- THEM PHONG MAY TINH ---");

        String ma = nhapMaPhong();

        if (ds.timPhong(ma) != null) {
            System.out.println("Ma phong da ton tai!");
            return;
        }

        String day = nhapDayPhong();
        double dienTich = nhapDienTich();
        int bongDen = nhapSoBongDen();

        int mayTinh;
        do {
            System.out.print("Nhap so may tinh: ");
            mayTinh = nhapInt();

            if (mayTinh < 0) {
                System.out.println("So may tinh khong duoc am!");
            }
        } while (mayTinh < 0);

        PhongMayTinh p = new PhongMayTinh(
                ma, day, dienTich, bongDen, mayTinh);

        if (ds.themPhong(p)) {
            System.out.println("Them phong thanh cong!");
        }
    }

    // Them phong thi nghiem
    public static void themPhongThiNghiem() {
        System.out.println("\n--- THEM PHONG THI NGHIEM ---");

        String ma = nhapMaPhong();

        if (ds.timPhong(ma) != null) {
            System.out.println("Ma phong da ton tai!");
            return;
        }

        String day = nhapDayPhong();
        double dienTich = nhapDienTich();
        int bongDen = nhapSoBongDen();

        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = sc.nextLine();

        int sucChua;
        do {
            System.out.print("Nhap suc chua: ");
            sucChua = nhapInt();

            if (sucChua < 0) {
                System.out.println("Suc chua khong duoc am!");
            }
        } while (sucChua < 0);

        boolean bonRua = nhapCoKhong("Phong co bon rua khong");

        PhongThiNghiem p = new PhongThiNghiem(
                ma, day, dienTich, bongDen,
                chuyenNganh, sucChua, bonRua);

        if (ds.themPhong(p)) {
            System.out.println("Them phong thanh cong!");
        }
    }

    // Tim phong
    public static void timPhong() {
        System.out.print("Nhap ma phong can tim: ");
        String ma = sc.nextLine();

        PhongHoc p = ds.timPhong(ma);

        if (p == null) {
            System.out.println("Khong tim thay phong!");
        } else {
            System.out.println(p);
            System.out.println("Dat chuan: "
                    + (p.kiemTraDatChuan() ? "Co" : "Khong"));
        }
    }

    // Cap nhat so may tinh
    public static void capNhatMayTinh() {
        System.out.print("Nhap ma phong can cap nhat: ");
        String ma = sc.nextLine();

        PhongHoc p = ds.timPhong(ma);

        if (p == null) {
            System.out.println("Khong tim thay phong!");
            return;
        }

        if (!(p instanceof PhongMayTinh)) {
            System.out.println("Phong nay khong phai phong may tinh!");
            return;
        }

        System.out.print("Nhap so may tinh moi: ");
        int soMay = nhapInt();

        if (soMay < 0) {
            System.out.println("So may tinh khong duoc am!");
            return;
        }

        ds.capNhatMayTinh(ma, soMay);
        System.out.println("Cap nhat thanh cong!");
    }

    // Xoa phong co xac nhan
    public static void xoaPhong() {
        System.out.print("Nhap ma phong can xoa: ");
        String ma = sc.nextLine();

        PhongHoc p = ds.timPhong(ma);

        if (p == null) {
            System.out.println("Khong tim thay phong!");
            return;
        }

        System.out.println("Thong tin phong: " + p);
        boolean xacNhan = nhapCoKhong("Ban co chac chan muon xoa");

        if (ds.xoaPhong(ma, xacNhan)) {
            System.out.println("Da xoa phong!");
        } else {
            System.out.println("Da huy xoa phong.");
        }
    }
}


