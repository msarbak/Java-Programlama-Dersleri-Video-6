package yt.video6;

public class Kisi {
    
    private String isim;
    private int yas;
    private double kilo;
    private double boy;

    public Kisi(String isim, int yas, double kilo, double boy){
        this.isim = isim;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }

    public void yasIlerle(int yil){
        yas += yil;
        if(yas > 25) boy+=10;
    }
    
    public void yemekYe(double kalori){
        kilo += kalori/1000;
    }

    protected void finalize() throws Throwable {
		System.out.println("hata yok");
	}

    @Override
    public String toString() {
        return isim + " " + yas + " " + kilo + " " + boy + " ";
    }
}
