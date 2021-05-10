package Oxy;

public class DiemOxy {
	private int ox, oy;
    public DiemOxy(){
        ox=oy=0;
    }
    public DiemOxy(int ox,int oy){
        this.ox=ox;
        this.oy=oy;
    }

    public int getOx() {
        return ox;
    }

    public int getOy() {
        return oy;
    }

    public void setOx(int ox) {
        this.ox = ox;
    }

    public void setOy(int oy) {
        this.oy = oy;
    }
    

    public String toString(){
        return "("+ox+","+oy+")";
    }
    public double modul(){
        return Math.sqrt(ox*ox+oy*oy);
    }
    public double khoangCach(DiemOxy b){
        return Math.sqrt(Math.pow(ox-b.ox,2)+Math.pow(oy-b.oy,2));
    }

}
