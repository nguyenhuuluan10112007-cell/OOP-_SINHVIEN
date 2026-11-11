package Huuluan_25684031;

public class PhongThiNghiem extends PhongHoc {

    private String ChuyenNganh;
    private int SucChua;
    private boolean BonRua;

    public PhongThiNghiem(String maPhong, String dayPhong,
                          double dienTich, int soBongDen,
                          String chuyenNganh, int sucChua,
                          boolean bonRua) {
        super(maPhong, dayPhong, dienTich, soBongDen);
        ChuyenNganh = chuyenNganh;
        SucChua = sucChua;
        BonRua = bonRua;
    }

    public PhongThiNghiem() {
        super();
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return SucChua;
    }

    public void setSucChua(int sucChua) {
        SucChua = sucChua;
    }

    public boolean isBonRua() {
        return BonRua;
    }

    public void setBonRua(boolean bonRua) {
        BonRua = bonRua;
    }

    @Override
    public boolean kiemTraDatChuan() {
        return duAnhSang() && BonRua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem [" + super.toString()
                + ", ChuyenNganh=" + ChuyenNganh
                + ", SucChua=" + SucChua
                + ", BonRua=" + BonRua + "]";
    }
}
