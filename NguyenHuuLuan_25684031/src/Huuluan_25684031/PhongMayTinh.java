package Huuluan_25684031;

public class PhongMayTinh extends PhongHoc {
	  private int MayTinh;

	    public PhongMayTinh(String maPhong, String dayPhong,
	                        double dienTich, int soBongDen,
	                        int mayTinh) {
	        super(maPhong, dayPhong, dienTich, soBongDen);
	        MayTinh = mayTinh;
	    }

	    public PhongMayTinh() {
	        super();
	    }

	    public int getMayTinh() {
	        return MayTinh;
	    }

	    public void setMayTinh(int mayTinh) {
	        MayTinh = mayTinh;
	    }

	    @Override
	    public boolean kiemTraDatChuan() {
	        return duAnhSang()
	                && MayTinh > 0
	                && DienTich >= MayTinh * 1.5;
	    }

	    @Override
	    public String toString() {
	        return "PhongMayTinh [" + super.toString()
	                + ", MayTinh=" + MayTinh + "]";
	    }
	}

