import java.util.Scanner;
public class taksi {

	public static void main(String[] args) {
		double km=2.20;
		double min=20;
		double acilis=10;
		double mesafe;
		Scanner klavye=new Scanner(System.in);
		System.out.println("gidilen mesafeyi giriniz(km):");
		mesafe=klavye.nextDouble();
		double tutar=km*mesafe+acilis;
		tutar=tutar>20 ? tutar:20;
		System.out.println("taksimetre tutarı:"+tutar+" tl");  
		
	} 
	
}
		 
		
	
	
	

