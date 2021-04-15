package chuoi1;
import java.util.Scanner;

public class chuoi1 {

    Scanner kb = new Scanner(System.in);
    String n;
    void input(){
        System.out.println("nhap chuoi");
         n = kb.nextLine();
    }
    
    String remove(String s, int i){
        String s1 = s.substring(0,i)+ s.substring(i+1,s.length());
        return s1;
    }
    //cau 5
    String allTrim(String s ){
        int i = 1;
        while(i<s.length()){
            if(s.charAt(i)==' ' && s.charAt(i-1)==' ')
                s = remove(s,i);
            else i++;
        s=s.trim();
        }
        return s;
    }
    //cau 2
    void demkytualphabet(String s){
        int dem[] = new int [26];
        s = s.toUpperCase();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                int x=(int) (s.charAt(i))-65;
                dem[x]++;
        }
        for(int i=0;i<26;i++)
            if(dem[i]>0) System.out.println((char)(i+65)+ " : "+ dem[i]);
    }
    //cau 1
     void demkytuso(String s){
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                dem++;
        }
        System.out.println("so ky tu so : " + dem);
    }
    //cau 3
     void demkytutrang(String s){
         int dem=0; //sets 1st counter 1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==' ') dem++;
        }
        System.out.println("so ky tu trang : " + dem);
    }
    //cau 4
    void demkytudacbiet(String s){
        s=s.toUpperCase();
        int dem=0; //sets 1st counter 1
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) ==' '|| (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i) >= 48 && s.charAt(i) <= 57))) {
            dem++;
            }
        }
        System.out.println("so ky tu dac biet : " + dem++);
    }
    //cau 6
    String upCase(String s, int i){
        String s1 = s.substring(0,i)+s.substring(i,i+1).toUpperCase()+ s.substring(i+1,s.length());
        return s1;
    }
    String tieuDe(String s){
        String s1=s;
        if(s.charAt(0)!=' ')s1=upCase(s1,0);
        for(int i =1; i<s.length();i++)
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
                s1= upCase(s1,i);
        return s1;
    }
    //cau 7
    void kytuxhnn(String s){
        int dem[] = new int [26];
        s = s.toUpperCase();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                int x=(int) (s.charAt(i))-65;
                dem[x]++;
        }
        int max=dem[0];
        int x=0;
        for(int i=0;i<26;i++)
            if(dem[i]>max) {max = dem[i];x=i;}
        System.out.println("kí tự "+(char)(x+65)+ " xuat hien nhieu nhat : "+ dem[x]);
    }
    
    void output(){
        System.out.println(allTrim(n));
        //n=allTrim(n);
        demkytualphabet(n);
        demkytuso(n);
        demkytutrang(n);
        demkytudacbiet(n);
        System.out.println(tieuDe(n));
        kytuxhnn(n);
    }
    public static void main(String[] args) {
    chuoi1 a = new chuoi1();
    a.input();
    a.output();
    }
    
}