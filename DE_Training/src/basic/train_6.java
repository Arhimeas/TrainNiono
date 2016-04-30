package basic;
import java.util.Scanner;

public class train_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un entier : ");
		int i = 0;
		i = sc.nextInt();

				if (i < 0)
				  System.out.println("Ce nombre est négatif !");      
				  
				else if(i > 0)
				  System.out.println("Ce nombre est positif !");           
				 
				else  
				  System.out.println("Ce nombre est nul !");

//				if(i < 100 && i > 50) 
//				  System.out.println("Le nombre est bien dans l'intervalle.");
//				else
//				  System.out.println("Le nombre n'est pas dans l'intervalle.");
	}
}

		
		
		//		String chaine = "Bonjour";
		//
		//		switch(chaine) {
		//		case "Bonjour":
		//			System.out.println("Bonjour monsieur !");
		//			break;
		//		case "Bonsoir":
		//			System.out.println("Bonsoir monsieur !");
		//			break;
		//		default:
		//			System.out.println("Bonjoir ! :p");
		//		}
//		
//		int x = 10, y = 20;
//
//		int max = (x < y) ? y : x ;
//		System.out.println("max = "+max);
//
//	}
//}