package basic;

import java.util.Scanner;

public class kjrgbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est ton nom ?");
		String str = sc.nextLine();
		
		switch (str)
		{
		case "Niono" :
			System.out.println(str + " c'est trop bien !");
			break;
		default :
			System.out.println("Ooooh, " +str+ " c'est vraiment un joli nom ... pas comme Niono !");

		}
			

	}

}
