import java.util.Scanner;
public class manav {

	public static void main(String[] args) {
		double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5.00,toplam;
		double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat;
		int armut,elma,domates,muz,patlican;
		Scanner klavye=new Scanner(System.in);
		System.out.println("armut kaç kilo?:");
		armut=klavye.nextInt();
		System.out.println("elma kaç kilo?:");
		elma=klavye.nextInt();
		System.out.println("domates kaç kilo?:");
		domates=klavye.nextInt();
		System.out.println("muz kaç kilo?:");
		muz=klavye.nextInt();
		System.out.println("patlýcan kaç kilo?:");
		patlican=klavye.nextInt();
		
		armutFiyat=armut*armutkg;
		elmaFiyat=elma*elmakg;
		domatesFiyat=domates*domateskg;
		muzFiyat=muz*muzkg;
		patlicanFiyat=patlican*patlicankg;
		toplam=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
		System.out.println("Toplam Ücret:"+toplam);
		
		
		
		
	}

}
