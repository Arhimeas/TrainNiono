package basic;
import java.util.Scanner;

public class train_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



//		//Une variable vide
//		String prenom;
//		//On initialise celle-ci � O pour oui
//		char reponse = 'O';
//		//Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
//		Scanner sc = new Scanner(System.in);
//		//Tant que la r�ponse donn�e est �gale � oui�
//		while (reponse == 'O')
//		{
//			//On affiche une instruction
//			System.out.println("Donnez un pr�nom : ");
//			//On r�cup�re le pr�nom saisi
//			prenom = sc.nextLine();
//			//On affiche notre phrase avec le pr�nom
//			System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
//			//On demande si la personne veut faire un autre essai
//			System.out.println("Voulez-vous r�essayer ? (O/N)");
//			//On r�cup�re la r�ponse de l'utilisateur
//			reponse = sc.nextLine().charAt(0);
//		}
//
//		System.out.println("Au revoir�");
//		//Fin de la boucle


//		//Boucle infinie
//		int a = 1, b = 15;
//		while (a < b)
//		{
//			System.out.println("coucou " +a+ " fois !!");
//		}

//		//Boucle finie
//		int a = 1, b = 15;
//		while (a < b)
//		{
//			System.out.println("coucou " +a+ " fois !!");
//			a++;
//		}
		
		
//		String prenom = new String();
//		//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
//		char reponse = ' ';
//		 
//		Scanner sc = new Scanner(System.in);
//		 
//		do{
//		  System.out.println("Donnez un pr�nom : ");
//		  prenom = sc.nextLine();
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
//		       
//		  do{
//		    System.out.println("Voulez-vous r�essayer ? (O/N)");
//		    reponse = sc.nextLine().charAt(0);
//		  }while(reponse != 'O' && reponse != 'N');
//		        
//		}while (reponse == 'O');
//		 
//		System.out.println("Au revoir�");
		
		
		
		
		
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("Voici la ligne "+i);
//		}



		for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){

			System.out.println("i = " + i + ", j = " + j);

		}
	}

}
