import java.util.Scanner;
public class manav {

	public static void main(String[] args) {
		double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5.00,toplam;
		double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat;
		int armut,elma,domates,muz,patlican;
		Scanner klavye=new Scanner(System.in);
		System.out.println("armut ka� kilo?:");
		armut=klavye.nextInt();
		System.out.println("elma ka� kilo?:");
		elma=klavye.nextInt();
		System.out.println("domates ka� kilo?:");
		domates=klavye.nextInt();
		System.out.println("muz ka� kilo?:");
		muz=klavye.nextInt();
		System.out.println("patl�can ka� kilo?:");
		patlican=klavye.nextInt();
		
		armutFiyat=armut*armutkg;
		elmaFiyat=elma*elmakg;
		domatesFiyat=domates*domateskg;
		muzFiyat=muz*muzkg;
		patlicanFiyat=patlican*patlicankg;
		toplam=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
		System.out.println("Toplam �cret:"+toplam);
		
		
		
		
	}

}
