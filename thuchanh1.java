public class mang {
	int n;
	ArrayList<Integer> A = new ArrayList<Integer>();
	Scanner kb = new Scanner(System.in);
	void input() {
		System.out.print("Nhap n: ");
		n=kb.nextInt();
		System.out.println("Nhap phan tu mang: ");
		for(int i=0; i<n;i++) {
			int x = (int) (Math.random()*100);
			//int x= kb.nextInt();
			A.add(i,x);
			}
	}
	
	void xuatMang(String text) {
		System.out.println(text);
		for(int i=0; i< A.size();i++)
			System.out.print(A.get(i)+" ");
		System.out.println("");
	}

	//Câu 4
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
	//cau 3
	int tongSoChan() {
		int s=0;
		for(Integer x:A)
			if(x%2==0) {
				s+=x;
			}
		return s;
		
	}
	//cau 1
	int timMax() {
		int max= A.get(0);
		for(int i=1;i<A.size();i++)
			if(max<A.get(i)) max = A.get(i);
		return max;
	}
	int timMin() {
		int min= A.get(0);
		for(int i=1;i<A.size();i++)
			if(min>A.get(i)) min = A.get(i);
		return min;
	}
	int hieuMaxMin() {
		return timMax()-timMin();
	}
	
	//Cau 2
	void timMax2Lt() {
		int k=0;
		int max= A.get(0)+A.get(1);
		for(int i=1;i<A.size()-1;i++){
			if(max<A.get(i)+A.get(i+1)){
				max = A.get(i)+A.get(i+1);
				k=i;
			}
		}
		System.out.println("2 so lien tiep có tổng max: "+ A.get(k)+" + "+A.get(k+1)+" = "+ max);
	}
//cau 7
	void ChenX(int x,int y) {
			A.add(y,x);
	}
	//Cau 5
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
	void cacSoDX() {
		for(Integer x:A)
			if(Doixung(x)==true) System.out.print(x + " ");
		System.out.println("");
	}
	
	void xoaSoChan() {
		int i =0;
		while(i<A.size())
			if(A.get(i)%2==0) A.remove(i);
			else i++;
	}
//	cau 9
	void XapsepMang() {
		for(int i=0; i<A.size()-1;i++)
			for(int j=i+1; j< A.size();j++)
				if(A.get(i)<A.get(j)) {
					int Temp = A.get(i);
					A.set(i, A.get(j));
					A.set(j, Temp);
				}
			
	}
	void output() {
		
		xuatMang("Vua nhap:");
		System.out.println("-----------");
		System.out.println("TBC cua cac so nguyen to la: "+TBCngTo());
		System.out.println("-----------");
		System.out.println("-----------");
		System.out.println("Tong so chan la: "+tongSoChan());
		System.out.println("Max \t Min");
		System.out.println("-----------");
		System.out.println(timMax() + "\t" + timMin());
		System.out.println("-----------");
		System.out.println("Hieu so lon nhat va so nho nhat la: "+hieuMaxMin());
		System.out.println("-----------");
		System.out.println("Cac so doi xung la: ");cacSoDX();
		System.out.println("-----------");
		
		timMax2Lt();

		System.out.println("-----------");
		System.out.print("Nhap so can chen va vi tri: ");
		int x = kb.nextInt();
		int y = kb.nextInt();
		ChenX(x,y);
		xuatMang("Sau khi chèn " +x+" vao vi tri "+y+" : ");
		XapsepMang();
		xuatMang("Sau khi xap sep: ");
		xoaSoChan();
		xuatMang("Sau khi xoa so chan: ");
	}

	public static void main(String[] args) {
		mang a = new mang();
		a.input();
		a.output();
	}

}
