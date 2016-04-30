package POO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville ville =  new Ville();
		System.out.println(ville.nomVille);
		ville.nomVille = "la tête à toto ! ! ! !";
		System.out.println(ville.nomVille);

		Ville ville2 = new Ville("Marseille", 123456789, "France");
		ville2.nomPays = "La tête à tutu ! ! ! ! ";
		System.out.println(ville2.nomPays);
	}

}


//public class main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Ville v = new Ville();
//		Ville v1 = new Ville("Marseille", 123456, "France");       
//		Ville v2 = new Ville("Rio", 321654, "Brésil");
//
//		System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
//		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
//		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
//
//		/*
//		  Nous allons interchanger les Villes v1 et v2
//		  tout ça par l'intermédiaire d'un autre objet Ville.        
//		 */       
//		Ville temp = new Ville();
//		temp = v1;
//		v1 = v2;
//		v2 = temp;
//
//		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
//		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
//
//		/*       
//		  Nous allons maintenant interchanger leurs noms
//		  cette fois par le biais de leurs mutateurs.
//		 */   
//		v1.setNom("Hong Kong");
//		v2.setNom("Djibouti");
//
//		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
//		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
//
//
//
//		Ville v = new Ville();
//		Ville v1 = new Ville("Marseille", 1236, "France");       
//		Ville v2 = new Ville("Rio", 321654, "Brésil");
//
//		System.out.println("\n\n"+v1.decrisToi());
//		System.out.println(v.decrisToi());
//		System.out.println(v2.decrisToi()+"\n\n");
//		System.out.println(v1.comparer(v2));
//	}
//}

