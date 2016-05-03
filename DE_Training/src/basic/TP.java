import java.util.Scanner;

public class TP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double valeur = 0; // Valeur à convertir
		String sens = " "; // lecture sens
		int valide = 0;
		double resultat = 0;
		char reponse = 'O';

		// Choix du mode
		do{
			valide = 0;
			System.out.println("Quel sens voulez-vous ? CF ou FC ?");
			sens = sc.nextLine();

			switch(sens)
			{
			case "CF":
				System.out.println("sens CF !");
				break;
			case "FC":
				System.out.println("sens FC !");
				break;
			default : 
				System.out.println("sens non valide !");
				valide = 1;
			}
		}while(valide == 1);

		// Le calcul



		do
		{
			resultat = 0;
			System.out.println("Rentrez une valeur");
			valeur = sc.nextDouble();
			sc.nextLine();

			switch(sens)
			{
			case "CF":
				resultat = valeur * 10; // CF
				break;
			case "FC":
				resultat = valeur + 10; // FC
				break;
			default : 
				System.out.println("non valide !");
				valide = 1;
			}

			System.out.println("\nVoici votre résultat : "+resultat);
			
			System.out.println("\nVoulez-vous recommencer ?");
			
			reponse = sc.nextLine().charAt(0);

		}while(reponse == 'O');
		
		System.out.println("\nBye bye");
	}

}
