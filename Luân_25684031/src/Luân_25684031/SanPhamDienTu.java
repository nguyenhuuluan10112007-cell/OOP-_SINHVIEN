package Luân_25684031;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham {
	private LocalDate hanBaoHanh;

	public LocalDate getHanBaoHanh() {
		return hanBaoHanh;
	}

	public void setHanBaoHanh(LocalDate hanBaoHanh) {
		LocalDate dateNow = LocalDate.now();
		if (hanBaoHanh == null || hanBaoHanh.isBefore(dateNow)) {
			throw new IllegalArgumentException("Han bao hanh khong hop le");
		}
		this.hanBaoHanh = hanBaoHanh;
	}

	public SanPhamDienTu(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, int soLuongTon, double giaNhap,
			LocalDate hanBaoHanh) {
		super();
		setHanBaoHanh(hanBaoHanh);
	}

	@Override
	public double giaBan() {
		return getGiaNhap() + (getGiaNhap() * 0.1);
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
				hanBaoHanh != null ? hanBaoHanh.toString() : ""
			);	
	}
}