package Huuluan_25684031;

public class PhongLyThuyet extends PhongHoc {
    private boolean MayChieu;

    public PhongLyThuyet(String maPhong, String dayPhong,
                         double dienTich, int soBongDen,
                         boolean mayChieu) {
        super(maPhong, dayPhong, dienTich, soBongDen);
        MayChieu = mayChieu;
    }

    public PhongLyThuyet() {
        super();
    }

    public boolean isMayChieu() {
        return MayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        MayChieu = mayChieu;
    }

    @Override
    public boolean kiemTraDatChuan() {
        return duAnhSang() && MayChieu;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet [" + super.toString()
                + ", MayChieu=" + MayChieu + "]";
    }
}


