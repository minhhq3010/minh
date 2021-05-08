package phan6;

public class SinhVien {
	private String maSV, hoTen, queQuan;
	private NgayThang ngaySinh;
	private boolean gioiTinh;
	private double diemTB;
	
	public SinhVien(){
		maSV = hoTen = queQuan = null;
		ngaySinh = null;
		gioiTinh = true;
		diemTB = 0;
	}
	public SinhVien(String maSV, String hoTen, String queQuan, NgayThang ngaySinh,boolean gioiTinh,double diemTB){
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemTB = diemTB;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public NgayThang getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgayThang ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public String toString(){
		return maSV+" "+hoTen+" "+queQuan+" "+ngaySinh+" "+ ((gioiTinh == true)?" Nam ": " Nu ")+
				diemTB+" "+xepLoai();
	}
	public String xepLoai(){
		if(diemTB<3.5) return " Kem ";
		if(diemTB<5)return " Yeu ";
		if(diemTB<6.5) return " Trung Binh";
		if(diemTB<8) return " Kha ";
		if(diemTB<9) return " Gioi ";
		return " Xuat sac ";
	}
	
}
