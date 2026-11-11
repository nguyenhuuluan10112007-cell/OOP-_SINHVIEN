package Luân_25684031;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham {
    private LocalDate hetHan;
	
	public LocalDate getHetHan() {
		return hetHan;
	}
	
	public void setHetHan(LocalDate hetHan) {
		LocalDate dateNow = LocalDate.now();
		if (hetHan == null || hetHan.isBefore(dateNow)) {
			throw new IllegalArgumentException("Han su dung khong hop le");
		}
		this.hetHan = hetHan;
	}

	public SanPhamThucPham(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, int soLuongTon, double giaNhap,
			LocalDate hetHan) {
		super();
		setHetHan(hetHan);
	}

	@Override
	public double giaBan() {
		LocalDate dateNow = LocalDate.now();
		if (hetHan != null && hetHan.isBefore(dateNow)) return 0;
		return getGiaNhap() + (getGiaNhap() * 0.05);
	}
	
	private int getGiaNhap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() +
			"|" +
			String.format(
				"%12.2f|%12s",
				giaBan(),
				hetHan != null ? hetHan.toString() : ""
			);	
	}
}