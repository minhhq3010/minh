package Oxy;

import java.util.ArrayList;
import java.util.Scanner;

public class MangDiem {
	private ArrayList<DiemOxy> a = new ArrayList<DiemOxy>();
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
            a.add(new DiemOxy(x,y));
        }
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        a.forEach(x -> {
            System.out.println(x + " ");}
        );
    }
    public DiemOxy ganTamNhat(){
        DiemOxy x = a.get(0);
        for(int i=1; i<a.size(); i++)
            if(a.get(i).modul()<x.modul())
                x = a.get(i);
        return x;
    }
    public void maxKhoangCach(){
        DiemOxy x = a.get(0), y = a.get(1);
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i).khoangCach(a.get(j))>x.khoangCach(y)){
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
                    DiemOxy t = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,t);
                }
    }
    public void maxTamGiac(){
        TamGiac c = new TamGiac(a.get(0), a.get(1), a.get(2));
        for(int i=0; i<a.size()-2; i++)
            for(int j=i+1; j<a.size()-1; j++)
                for(int k=j+1; k<a.size(); k++){
                    TamGiac b = new TamGiac(a.get(i), a.get(j), a.get(k));
                    if(b.isTamGiac()==true && b.dienTich()>c.dienTich())
                        c = b;
                }
        System.out.println("Tam giac co max Dien Tich: " + c.dienTich());
    }
    public void output(){
        xuat("Mang vua nhap: ");
        sapXepTangModul();
        xuat("Sap xep tang modul: ");
    }
    public static void main(String[] args) {
        MangDiem a = new MangDiem();
        a.input();
        a.output();
    }
}
