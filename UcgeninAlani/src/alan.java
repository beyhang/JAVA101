import java.util.Scanner;
public class alan {

	public static void main(String[] args) {
	int a,b,c;
	
	Scanner klavye=new Scanner(System.in);
	System.out.println("1.kenar� giriniz:");
	a=klavye.nextInt();
	System.out.println("2.kenar� giriniz:");
	b=klavye.nextInt();
	System.out.println("3.kenar� giriniz:");
	c=klavye.nextInt();
   int u=((a+b+c)/2);
	int cevre=2*u;
	int alanKare=u*(u-a)*(u-b)*(u-c);
	int alan=(int) Math.sqrt(alanKare);
	System.out.println("��genin alan�:"+alan);
	}

}
