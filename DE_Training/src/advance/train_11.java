package advance;

public class train_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La m�thode avec un tableau de String sera invoqu�e
		parcourirTableau(tabStr);
		//La m�thode avec un tableau d'int sera invoqu�e
		parcourirTableau(tabInt);
		//La m�thode avec un tableau de String � deux dimensions sera invoqu�e
		parcourirTableau(tabStr2);
	}

	static void parcourirTableau(String[] tab)
	{
		for(String str : tab)
			System.out.println(str);
	}

	static String toString(String[] tab)
	{
		System.out.println("M�thode toString() !\n----------");
		String retour = "";

		for(String str : tab)
			retour += str + "\n"; 

		return retour;
	}

	static void parcourirTableau(int[] tab)
	{
		for(int str : tab)
			System.out.println(str);
	}

	static void parcourirTableau(String[][] tab)
	{
		for(String tab2[] : tab)
		{
			for(String str : tab2)
				System.out.println(str);
		}
	}

}
