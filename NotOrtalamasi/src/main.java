import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int matematik,fizik,kimya,turkce,tarih,muzýk,ortalama;
		String sonuc;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz:");
		matematik=klavye.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik=klavye.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya=klavye.nextInt();
		System.out.println("Türkçe notunuzu giriniz:");
		turkce=klavye.nextInt();
		System.out.println("Tarih notunuzu giriniz:");
		tarih=klavye.nextInt();
		System.out.println("Müzik notunuzu giriniz:");
		muzýk=klavye.nextInt();
		ortalama=(matematik+fizik+kimya+turkce+tarih+muzýk)/6;
		System.out.println("Tüm derslerin ortalamasý:"+ortalama);
		sonuc=ortalama>60? "sýnýfý geçti": "sýnýfta kaldý";
		System.out.print(sonuc);

	}

}
