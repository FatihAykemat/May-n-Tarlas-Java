import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Mayin tarlasina hosgeldiniz");
		System.out.println("l�tfen oynamak istedi�iniz boyutlar� giriniz");
		System.out.println("Satir sayisi");
		row = scan.nextInt();
		System.out.println("S�tun sayisi");
		column	 = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
			
		mayin.run();

	}

}
