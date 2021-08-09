import java.util.Scanner;
public class endeks {

	public static void main(String[] args) {
	double kilo,boy;
	Scanner klavye=new Scanner(System.in);
	System.out.println("boyunuzu giriniz:(m cinsinden)");
	boy=klavye.nextDouble();
	System.out.println("kilonuzu giriniz:");
	kilo=klavye.nextDouble();
	double endeks=kilo/(boy*boy);
	System.out.println("vücut kitle endeksiniz:"+endeks);
	
	
		
		

}
	
	
}
