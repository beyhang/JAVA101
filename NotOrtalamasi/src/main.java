import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int matematik,fizik,kimya,turkce,tarih,muz�k,ortalama;
		String sonuc;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz:");
		matematik=klavye.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik=klavye.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya=klavye.nextInt();
		System.out.println("T�rk�e notunuzu giriniz:");
		turkce=klavye.nextInt();
		System.out.println("Tarih notunuzu giriniz:");
		tarih=klavye.nextInt();
		System.out.println("M�zik notunuzu giriniz:");
		muz�k=klavye.nextInt();
		ortalama=(matematik+fizik+kimya+turkce+tarih+muz�k)/6;
		System.out.println("T�m derslerin ortalamas�:"+ortalama);
		sonuc=ortalama>60? "s�n�f� ge�ti": "s�n�fta kald�";
		System.out.print(sonuc);

	}

}
