 import java.util.Scanner;
 
public class kdv {

	public static void main(String[] args) {
		double tutar,r,kdvTutari,kdvliTutar,kdvOran;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Ürünün Tutarýný Giriniz:");
		tutar=klavye.nextDouble();
		kdvOran=(tutar>1000) ? 0.8:0.18;
		kdvTutari=tutar*kdvOran;
		kdvliTutar=tutar+kdvTutari;
		System.out.println("Ürünün tutarý:"+tutar);
		System.out.println("Ürünün kdv oraný:"+kdvOran);
		System.out.println("Kdv tutarý:"+kdvTutari);
		System.out.println("Kdvli tutarý:"+kdvliTutar);
		
	}

}
