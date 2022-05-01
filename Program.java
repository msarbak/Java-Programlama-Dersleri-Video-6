package yt.video6;

public class Program {
    public static void main(String[] args) {
    Kisi Mehmet = new Kisi("Mehmet",25,80,195);
    System.out.println(Mehmet);

    Mehmet.yemekYe(2000);

    try {
		Mehmet.finalize();
		}
		catch (Throwable e) {
			System.out.println("hata var");
		}
    Mehmet.yasIlerle(10);

    System.out.println(Mehmet);
    }
}
