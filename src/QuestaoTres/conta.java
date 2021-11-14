package QuestaoTres;

import java.util.Scanner;

public class conta {

	public static void main(String[] args) {
	
		try (Scanner ent = new Scanner(System.in)) {
			String S;
			int i, j, cont=0;
			System.out.println("Digite a frase/palavra\n");
			S = ent.nextLine();
   // Transforma em minusculas
			String s = S.toLowerCase();
			String v = "";
			
			for (i=0; i<s.length(); i++) {
			    for (j=0; j<s.length(); j++) {
			        if (s.charAt(i)==s.charAt(j)) {
			            cont++;
			        } 
			    }
			    
			    char c = s.charAt(i);
			    //contains eh a sequencia de carcteres a serem pesquisadas
			    // charAt retorna um valor char no numero de indice fornecido
			    if (c >= 'a' && c <= 'z' && !v.contains("" + c)) {
			        v = v + c;
			        System.out.println("A letra "+s.charAt(i)+" aparece "+cont+" vezes.");
			    }
			    cont=0;
			}
			ent.close();
		}
	}

}
