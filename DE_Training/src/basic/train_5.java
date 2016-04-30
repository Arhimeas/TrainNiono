package basic;
import java.util.Scanner;

public class train_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir un nombre :");
//		int str = sc.nextInt();
//		System.out.println("Vous avez saisi le nombre : " + str);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Saisissez un entier : ");
//		int i = sc.nextInt();
//		System.out.println("Vous avez saisi le nombre : " + i);
//		System.out.println("Saisissez une chaîne : ");
//		sc.nextLine();
//		String str = sc.nextLine();      
//		System.out.println("FIN ! ");
		   
		Scanner sc = new Scanner(System.in);
		
		int resultat = 0,a = 0, b = 0;
		System.out.println("Saisissez un entier : ");
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		resultat = a * b;
		System.out.println("Vous avez saisi le nombre : " + resultat);
		
		
		
	}

}
