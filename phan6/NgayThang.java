package phan6;

public class NgayThang {
	private int ngay, thang, nam;
	public NgayThang(){
		ngay = thang = 1;
		nam = 2000;
	}
	public NgayThang(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public String toString(){
		return ngay+"/"+thang+"/"+nam;
	}
}
