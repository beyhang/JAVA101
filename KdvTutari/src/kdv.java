 import java.util.Scanner;
 
public class kdv {

	public static void main(String[] args) {
		double tutar,r,kdvTutari,kdvliTutar,kdvOran;
		Scanner klavye=new Scanner(System.in);
		System.out.println("�r�n�n Tutar�n� Giriniz:");
		tutar=klavye.nextDouble();
		kdvOran=(tutar>1000) ? 0.8:0.18;
		kdvTutari=tutar*kdvOran;
		kdvliTutar=tutar+kdvTutari;
		System.out.println("�r�n�n tutar�:"+tutar);
		System.out.println("�r�n�n kdv oran�:"+kdvOran);
		System.out.println("Kdv tutar�:"+kdvTutari);
		System.out.println("Kdvli tutar�:"+kdvliTutar);
		
	}

}
