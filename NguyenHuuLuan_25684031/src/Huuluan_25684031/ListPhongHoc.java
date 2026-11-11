package Huuluan_25684031;
import java.util.ArrayList;
import java.util.Comparator;

public class ListPhongHoc {
private ArrayList<PhongHoc> ds;

    public ListPhongHoc() {
        ds = new ArrayList<>();
    }

    // Them phong neu khong trung ma phong
    public boolean themPhong(PhongHoc p) {
        if (timPhong(p.getMaPhong()) != null) {
            return false;
        }
        ds.add(p);
        return true;
    }

    // Tim phong theo ma
    public PhongHoc timPhong(String maPhong) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                return p;
            }
        }
        return null;
    }

    // Xuat toan bo danh sach
    public void xuatDanhSach() {
        for (PhongHoc p : ds) {
            System.out.println(p);
        }
    }

    // Lay danh sach phong dat chuan
    public void xuatPhongDatChuan() {
        for (PhongHoc p : ds) {
            if (p.kiemTraDatChuan()) {
                System.out.println(p);
            }
        }
    }

    // Sap xep tang dan theo day phong
    public void sapXepTheoDayPhong() {
        ds.sort(Comparator.comparing(PhongHoc::getDayPhong));
    }

    // Sap xep giam dan theo dien tich
    public void sapXepTheoDienTich() {
        ds.sort(Comparator.comparingDouble(PhongHoc::getDienTich)
                .reversed());
    }

    // Sap xep tang dan theo so bong den
    public void sapXepTheoSoBongDen() {
        ds.sort(Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    // Cap nhat so may tinh theo ma phong
    public boolean capNhatMayTinh(String maPhong, int soMay) {
        PhongHoc p = timPhong(maPhong);

        if (p instanceof PhongMayTinh && soMay >= 0) {
            ((PhongMayTinh) p).setMayTinh(soMay);
            return true;
        }
        return false;
    }

    // Xoa phong: chi xoa khi nguoi dung xac nhan
    public boolean xoaPhong(String maPhong, boolean xacNhan) {
        if (!xacNhan) {
            return false;
        }

        PhongHoc p = timPhong(maPhong);
        if (p == null) {
            return false;
        }

        return ds.remove(p);
    }

    // Tinh tong so phong hoc
    public int tongSoPhong() {
        return ds.size();
    }

    // Lay danh sach phong may tinh co 60 may
    public void xuatPhongMayTinh60May() {
        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pm = (PhongMayTinh) p;

                if (pm.getMayTinh() == 60) {
                    System.out.println(pm);
                }
            }
        }
    }
}

