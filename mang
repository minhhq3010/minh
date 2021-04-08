package phan3;

import java.util.ArrayList;
import java.util.Scanner;

public class mang {
	int n;
	ArrayList<Integer> A = new ArrayList<Integer>();
	Scanner kb = new Scanner(System.in);
	void input() {
		System.out.print("Nhap n: ");
		n=kb.nextInt();
		System.out.println("Nhap phan tu mang: ");
		for(int i=0; i<n;i++) {
			int x = (int) (Math.random()*50);
			//int x= kb.nextInt();
			A.add(i,x);
			}
	}
	//Câu a
	void xuatMang() {
		System.out.println("Mang A: ");
		for(int i=0; i< A.size();i++)
			System.out.print(A.get(i)+" ");
		System.out.println("");
	}
	//Câu b
	int tongchia3() {
		int s=0;
		for(int i =0; i<A.size();i++)
			if(A.get(i)%3==0) s+=A.get(i);
		return s;
	}
	//Câu c
	boolean nguyenTo(int x) {
		int dem = 0;
		for(int i=1;i<=x;i++)
			if(x%i==0) dem++;
		return dem==2;
	}
	double TBCngTo() {
		int s=0,d=0;
		for(Integer x:A)
			if(nguyenTo(x)==true) {
				s+=x;
				d++;
			}
		if(s==0) return 0;
		else return (double) s/d;
		
	}
	//Câu d
	int timMax() {
		int max= A.get(0);
		for(int i=1;i<A.size();i++)
			if(max<A.get(i)) max = A.get(i);
		return max;
	}
	//Câu e
	int timMin() {
		int min= A.get(0);
		for(int i=1;i<A.size();i++)
			if(min>A.get(i)) min = A.get(i);
		return min;
	}
	int hieuMaxMin() {
		return timMax()-timMin();
	}
	//Câu f
	boolean ktraMangTang() {
		int d=0;
		for(int i=0; i<A.size()-1;i++)
			for(int j=i+1; j< A.size();j++)
				if(A.get(i)>A.get(j)) d++ ;
			if(d>=1) return false;
			else return true;
		
	}
	//Câu g
	int timMaxLT() {
		int max= A.get(0)+A.get(1);
		for(int i=1;i<A.size()-1;i++)
			for(int j=i+1;j<A.size();j++)
				if(max<A.get(i)+A.get(j)) max = A.get(i)+A.get(j);
			return max;
	}
	//Cau i
	int timMax2So() {
		int max= A.get(0)+A.get(1);
		for(int i=1;i<A.size();i++)
			if(max<A.get(i)+A.get(i+1)) max = A.get(i)+A.get(i+1);
		return max;
	}
	//Cau j
	boolean isTamGiac(int a, int b,int c) {
		return (a+b>c && b+c>a && a+c>b);
	}
	double dienTich(int a, int b,int c) {
		double p=(a+b+c)/2;
		if(p-a<0 || p-b<0||p-c<0) return 0;
		else return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	void timMaxTamGiac() {
		int x=A.get(0),y=A.get(1),z=A.get(2);
		for(int i =0;i<A.size()-2;i++)
			for(int j=i+1;j<A.size()-1;j++)
				for(int k=j+1;k<A.size();k++)
					if(isTamGiac(A.get(i),A.get(j),A.get(k))==true)
						if(dienTich(x,y,z)<dienTich(A.get(i),A.get(j),A.get(k))) {
							x=A.get(i); y =A.get(j);z=A.get(k);
						}
		System.out.println("Max Tam Giac "+x+" "+y+" "+z+ " la =" + dienTich(x,y,z));
	}
	//Cau n
	void xoaX(int x) {
		int i =0;
		while(i<A.size())
			if(A.get(i)==x) A.remove(i);
			else i++;
	}
	//Cau k
	void XapsepMang() {
		for(int i=0; i<A.size()-1;i++)
			for(int j=i+1; j< A.size();j++)
				if(A.get(i)>A.get(j)) {
					int Temp = A.get(i);
					A.set(i, A.get(j));
					A.set(j, Temp);
				}
			
	}
	//Cau m
	void ChenX(int x) {
		for(int i=0;i< A.size();i++)
			if(x<A.get(i)) { A.add(i,x);break;}
	}
	//Cau h
	boolean Doixung(int x) {
		int y=x;
		int s=0, du;
		while(x!=0) {
			du=x%10;
			s=s*10+du;
			x=x/10;
		}
		return(s==y && y>10);
	}
	int tongDX() {
		int s=0;
		for(Integer x:A)
			if(Doixung(x)==true) s+=x;
		return s;
	}
	void output() {
		
		xuatMang();
		if(ktraMangTang()==true) System.out.println("mang tang dan");
		else System.out.println("mang khong tang");
		
		System.out.println("Tong cac so chia het cho 3 la: "+tongchia3());
		
		System.out.println("TBC cua cac so nguyen to la: "+TBCngTo());
		
		System.out.println("Max \t Min");
		
		System.out.println(timMax() + "\t" + timMin());
		
		System.out.println("Hieu so lon nhat va so nho nhat la: "+hieuMaxMin());
		
		System.out.println("Tong cac so doi xung la: "+tongDX());
		
		timMaxTamGiac();
		
		XapsepMang();
		xuatMang();
		
		if(ktraMangTang()==true) System.out.println("mang tang dan");
		else System.out.println("mang khong tang");
		
		System.out.println("Nhap x: ");
		int x = kb.nextInt();
		xoaX(x);
		xuatMang();
		System.out.println("Nhap y: ");
		int y = kb.nextInt();
		ChenX(y);
		xuatMang();
	}

	public static void main(String[] args) {
		mang a = new mang();
		a.input();
		a.output();
	}

}
