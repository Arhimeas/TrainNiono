package basic;

public class train_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
//		double tableauDouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
//		char tableauCaractere[] = {'a','b','c','d','e','f','g'};
//		String tableauChaine[] = {"chaine1", "chaine2", "chaine3" , "chaine4"};
//		
//		int tableauEntier[] = new int[6];
//		//Ou encore
//		int[] tableauEntier2 = new int[6];
//		
//		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
		
//		char tableauCaractere[] = {'a','b','c','d','e','f','g'};
//	       
//		for(int i = 0; i < tableauCaractere.length; i++)
//		{
//		  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauCaractere[i]);
//		}
		
		
		
//		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
//		 
//		while (i < 2)
//		{
//		  j = 0;
//		  while(j < 5)
//		  {
//		    System.out.print(premiersNombres[i][j]);
//		    j++;
//		  }
//		  System.out.println("");
//		  i++;
//		}
	
	
	
	int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
	 
	for(int i = 0; i < 2; i++)
	{    
	  for(int j = 0; j < 5; j++)
	  {
	    System.out.print(premiersNombres[i][j]);       
	  }
	  System.out.println("");     
	}
	}

}
