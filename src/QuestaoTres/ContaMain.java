package QuestaoTres;

import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a palavra: ");
		String Texto = sc.nextLine();
		
		ContaCharactere.verificarCharRepetidos(Texto);
		sc.close();

	}

}
