import java.util.ArrayList;
import java.util.Scanner;


public class mangDiemOxy {
    private ArrayList<diemOxy> a = new ArrayList<diemOxy>();
    public void input(){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap n>0: ");
            n = sc.nextInt();
        }while(n<=0);
        for(int i=1; i<=n; i++){
            System.out.print("Nhap diem thu "+ i + ": ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            a.add(new diemOxy(x,y));
              
       }
    }
    public void xuat(String noiDung){
        System.out.print(noiDung);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i));
        System.out.println();
    }
    public diemOxy ganTamNhat(){
        diemOxy x = a.get(0);
        for(int i=1; i<a.size(); i++)
            if(a.get(i).modul()<x.modul())
                x = a.get(i);
        return x;
    }
    public diemOxy xaTamNhat(){
        diemOxy x = a.get(0);
        for(diemOxy y:a)
            if(x.modul()<y.modul())
                x = y;
        return x;
    }
    public void maxKhoangCach(){
        diemOxy x = a.get(0), y = a.get(1);
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(x.khoangCach(y)<a.get(i).khoangCach((a.get(j)))){
                    x = a.get(i);
                    y = a.get(j);
                }
        System.out.println("Max khoang cach: " + x + ", " + y + " = " + x.khoangCach(y));
    }
    public void xoaGocPhanTuIII(){
        int i=0;
        while(i<a.size())
            if(a.get(i).getOx()<0 && a.get(i).getOy()<0)
                a.remove(i);
            else i++;
    }
    public void sapXepTangModul(){
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i).modul()>a.get(j).modul()){
                    diemOxy x = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,x);
                }
    }
    public void giamOx(){
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i).getOx()<a.get(j).getOx()){
                    diemOxy x = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,x);
                }
    }
    public void maxTamGiac(){
        tamGiac c = new tamGiac(a.get(0), a.get(1), a.get(2));
        for(int i=0; i<a.size()-2; i++)
            for(int j=i+1; j<a.size()-1; j++)
                for(int k=j+1; k<a.size(); k++){
                    tamGiac b = new tamGiac(a.get(i), a.get(j), a.get(k));
                    if(b.istamGiac()==true){
                        if(b.dienTich()>c.dienTich())
                            c = b;
                }
                }     
        System.out.println("Tam giac co max Dien Tich: " + c.getA()+c.getB()+c.getC()+":"+c.dienTich());
    }
    public void output(){
        xuat("Mang vua nhap: ");
        System.out.println("Min:"+ganTamNhat()+":"+ganTamNhat().modul());
        System.out.println("Max:"+xaTamNhat()+":"+xaTamNhat().modul());
        maxKhoangCach();
        sapXepTangModul();
        xuat("Sap xep tang modul: ");
        giamOx();
        xuat("Sap xep giam ox: ");
        maxTamGiac();
        xoaGocPhanTuIII();
        xuat("\n Sau khi xoa cac diem goc phan tu III:");
     }
    public static void main(String[] args) {
        mangDiemOxy a = new mangDiemOxy();
        a.input();
        a.output();
    }
}
