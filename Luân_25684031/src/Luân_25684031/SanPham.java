package Luân_25684031;

import java.util.Objects;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private int soLuongTon;
	private String loai;

	public SanPham() {
		this("", "", 0.0, 0, "");
	}

	public SanPham(String maSanPham, String tenSanPham, double donGia, int soLuongTon, String loai) {
		setMaSanPham(maSanPham);
		setTenSanPham(tenSanPham);
		setDonGia(donGia);
		setSoLuongTon(soLuongMoi(soLuongTon));
		setLoai(loai);
	}

	private int soLuongMoi(int n) {
		return n < 0 ? 0 : n;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = (maSanPham == null) ? "" : maSanPham.trim();
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = (tenSanPham == null) ? "" : tenSanPham.trim();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia < 0 ? 0 : donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon < 0 ? 0 : soLuongTon;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = (loai == null) ? "" : loai.trim();
	}

	public double giaBan() {
		return donGia * 1.1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(maSanPham.toLowerCase(), other.maSanPham.toLowerCase());
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSanPham.toLowerCase());
	}

	@Override
	public String toString() {
		return String.format("SanPham [maSP=%s, tenSP=%s, donGia=%.2f, soLuongTon=%d, loai=%s, giaBan=%.2f]",
				maSanPham, tenSanPham, donGia, soLuongTon, loai, giaBan());
	}
}