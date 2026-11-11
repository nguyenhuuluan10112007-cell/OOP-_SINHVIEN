package Huuluan_25684031;

public abstract class PhongHoc {
	 protected String MaPhong;
	    protected String DayPhong;
	    protected double DienTich;
	    protected int SoBongDen;

	    public PhongHoc(String maPhong, String dayPhong,
	                    double dienTich, int soBongDen) {
	        MaPhong = maPhong;
	        DayPhong = dayPhong;
	        DienTich = dienTich;
	        SoBongDen = soBongDen;
	    }

	    public PhongHoc() {
	    }

	    public String getMaPhong() {
	        return MaPhong;
	    }

	    public void setMaPhong(String maPhong) {
	        MaPhong = maPhong;
	    }

	    public String getDayPhong() {
	        return DayPhong;
	    }

	    public void setDayPhong(String dayPhong) {
	        DayPhong = dayPhong;
	    }

	    public double getDienTich() {
	        return DienTich;
	    }

	    public void setDienTich(double dienTich) {
	        DienTich = dienTich;
	    }

	    public int getSoBongDen() {
	        return SoBongDen;
	    }

	    public void setSoBongDen(int soBongDen) {
	        SoBongDen = soBongDen;
	    }

	    // Trung binh 10m2 can 1 bong den
	    public boolean duAnhSang() {
	        return SoBongDen >= Math.ceil(DienTich / 10.0);
	    }

	    // Moi loai phong tu kiem tra dieu kien dat chuan
	    public abstract boolean kiemTraDatChuan();

	    @Override
	    public String toString() {
	        return "PhongHoc [MaPhong=" + MaPhong
	                + ", DayPhong=" + DayPhong
	                + ", DienTich=" + DienTich
	                + ", SoBongDen=" + SoBongDen + "]";
	    }
	}