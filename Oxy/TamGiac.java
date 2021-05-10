package Oxy;

public class TamGiac {
	  private DiemOxy a,b,c;
	    public TamGiac(){
	        a=b=c=null;
	    }
	    public TamGiac(DiemOxy a, DiemOxy b, DiemOxy c){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }
	    public TamGiac(int xa, int ya, int xb, int yb, int xc, int yc){
	        a = new DiemOxy(xa,ya);
	        b = new DiemOxy(xb,yb);
	        c = new DiemOxy(xc,yc);
	    }
	    public boolean isTamGiac(){
	        double AB, AC, BC;
	        AB = a.khoangCach(b);
	        AC = a.khoangCach(c);
	        BC = b.khoangCach(c);
	        return AB + AC > BC && AC + BC > AB && AB + BC > AC;
	    }
	    public double chuVi(){
	        double AB, AC, BC;
	        AB = a.khoangCach(b);
	        AC = a.khoangCach(c);
	        BC = b.khoangCach(c);
	        return AB + AC + BC;
	    }
	    public double dienTich(){
	        double AB, AC, BC;
	        AB = a.khoangCach(b);
	        AC = a.khoangCach(c);
	        BC = b.khoangCach(c);
	        double p = AB + AC + BC;
	        return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
	    }
	    public static void main(String[] args) {
	        TamGiac a = new TamGiac(new DiemOxy(2,3), new DiemOxy(2,1), new DiemOxy(0,4));
	        System.out.println(a.chuVi());
	        System.out.println(a.dienTich());
	    }
}
