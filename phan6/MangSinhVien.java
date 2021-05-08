package phan6;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSinhVien {
	private ArrayList<SinhVien> a = new ArrayList<SinhVien>();
	public SinhVien nhapSinhVien(String text){
		System.out.println(text);
		String ma, ht, qq;
		int ngay, thang, nam;
		boolean gt;
		double diem;
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap ma SV:");
		ma = kb.nextLine();
		System.out.print("Nhap ho ten:");
		ht = kb.nextLine();
		System.out.print("Nhap que quan:");
		qq = kb.nextLine();
		System.out.print("Nhap ngay sinh (ngay, thang, nam) :");
		ngay = kb.nextInt();
		thang = kb.nextInt();
		nam = kb.nextInt();
		System.out.print("Nhap gioi tinh:");
		gt = kb.nextBoolean();
		System.out.print("Nhap diem:");
		diem = kb.nextDouble();
		SinhVien x = new SinhVien(ma,ht,qq,new NgayThang(ngay,thang,nam),gt,diem);
		return x;
	}

	public void input(){
//		int n;
//		Scanner kb = new Scanner(System.in);
//		do{
//			System.out.print("Nhap so SV >0:");
//			n = kb.nextInt();
//		}while(n<=0);
//		for(int i = 1; i<=n;i++){
//			SinhVien x = nhapSinhVien("Nhap sinh vien thu "+ i);
//			a.add(x);
//		}
		a.add(new SinhVien("001","Ho Quang Minh","Quang Ngai",new NgayThang(30,10,1999),true, 2));
		a.add(new SinhVien("002","Nguyen Thi Diem My","Nghe An",new NgayThang(22,06,2001),false, 8));
		a.add(new SinhVien("003","Tran Thanh Phuoc Manh","Da Nang",new NgayThang(8,7,2001),true, 7));
		a.add(new SinhVien("004","Nguyen Hong Thu","Quang Ngai",new NgayThang(9,10,2001),false, 10));
		a.add(new SinhVien("005","Nguyen Van B","Ha Noi",new NgayThang(9,4,2000),true, 9));
		a.add(new SinhVien("006","Nguyen Thi C","Ha Tinh",new NgayThang(9,1,2000),false, 5));
		a.add(new SinhVien("007","Tran Van D","Nghe An",new NgayThang(9,5,2001),true, 7));
		a.add(new SinhVien("008","Nguyen E","Ha Noi",new NgayThang(9,8,2001),false, 5));
		a.add(new SinhVien("009","Nguyen Thi F","Ha Tinh",new NgayThang(9,7,2001),false, 5));
		a.add(new SinhVien("010","Tran Vu G","Nghe An",new NgayThang(9,2,2001),true, 5));
		a.add(new SinhVien("011","Tran Vu G","Nghe An",new NgayThang(9,2,2001),true, 5));
	}
	public void xuatDS(String noiDung){
        System.out.println(noiDung);
        for(SinhVien x :a){
            System.out.println(x);
        }
    }
    public double diemTrungBinhChung(){
        double s =0;
        for(SinhVien x :a){
            s+=x.getDiemTB();
        }
        return s/a.size();
    }
    
    public void congDiemQueNgheAn(){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getQueQuan().equalsIgnoreCase("Nghe An"))
                a.get(i).setDiemTB(a.get(i).getDiemTB()+0.5);
        }
    }
    public void congDiemSinh2000(){
        double x;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so diem muon cong: ");
        x = kb.nextDouble();
        for(int i=0;i<a.size();i++){
            if(a.get(i).getNgaySinh().getNam()==2000){
                a.get(i).setDiemTB(a.get(i).getDiemTB()+x);
            }
        }
    }
    public void diemChungTheoGioiTinh(){
        double countt=0,countf=0;
        double sumt=0,sumn=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).isGioiTinh()==true){
                sumt+=a.get(i).getDiemTB();
                countt++;
            }
            else{
                sumn+=a.get(i).getDiemTB();
                countf++;
            }
        }
        System.out.println("Diem trung binh chung theo gioi tinh nam : "+(sumt/countt));
        System.out.println("Diem trung binh chung theo gioi tinh nu : "+(sumn/countf));
    }
    public void LoaiSVcoDiemTBnho(){
    	double x = diemTrungBinhChung();
        for(int i=0;i<a.size();i++){
        	for(int j=0;j<a.size();j++)
            if(a.get(j).getDiemTB()<x){
            	System.out.println(j);
            	System.out.println(a.get(j));
            	System.out.println("len:"+a.size());
                a.remove(j);
            }
        }
    }
    public void SapXep(){
        for(int i=0;i<a.size()-1;i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i).getDiemTB()<a.get(j).getDiemTB()){
                    SinhVien t = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, t);
                }
            }
        }
    }
    public void output(){
        xuatDS("Danh Sach Sinh Vien Vua Nhap");
        System.out.println("---------------------------");
        System.out.println("Diem trung binh chung: "+diemTrungBinhChung());
        System.out.println("---------------------------");
        diemChungTheoGioiTinh();
        System.out.println("---------------------------");
        congDiemQueNgheAn();
        xuatDS("Danh Sach Sau Khi Cong ");
        System.out.println("---------------------------");
        congDiemSinh2000();
        xuatDS("Danh Sach Sau Khi Cong ");
        System.out.println("---------------------------");
        LoaiSVcoDiemTBnho();
        xuatDS("Danh Sach Sau Khi Loai ");
        System.out.println("---------------------------");
        SapXep();
        xuatDS("Danh Sach Sau Khi Sap Xep ");
    }
	public static void main(String[] args) {
		MangSinhVien a = new MangSinhVien();
		a.input();
		a.output();

	}

}
