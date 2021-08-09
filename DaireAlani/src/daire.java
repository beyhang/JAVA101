import java.util.Scanner;
public class daire {
	public static void main(String[] args) {
		double alan,cevre, π=3.14,dilim;
		int r,a;
		Scanner klavye=new Scanner(System.in);
		System.out.println("dairenin yarıçapı:");
		r=klavye.nextInt();
		System.out.println("dairenin merkez açı ölçüsü:");
		a=klavye.nextInt();
		alan=π * r * r;
		cevre= 2 * π * r;
		dilim=(π * (r*r) * a) / 360;
		System.out.println("Dairenin Alanı : "+ alan);
		System.out.println("Dairen Dilim Alanı : "+ dilim);
		System.out.println("Dairenin Çevresi : " + cevre);
		
	}

}
