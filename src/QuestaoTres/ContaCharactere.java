package QuestaoTres;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ContaCharactere {

	public static HashMap<Character, Integer> mapLetras = new HashMap<>();

	public static void verificarCharRepetidos(String palavra) {
		// ignorar os espacos
		String[] palavras = palavra.split(" ");

		for (String palavra1 : palavras) {
			// converter todas maiusculas
			String palavraMaiuscula = palavra1.toUpperCase();
			//convertendo a palavra digitada em um array de caracteres 
			//para inicializar seu conteudo a partir dos caracteres da string digitada
			char[] letras = palavraMaiuscula.toCharArray();
			for (char letra : letras) {
				// nessa parte do codigo iremos mapear se a letra especifica esta sendo mapeada pela 
				//coleção generica em questão ou não, no caso o HashMap, ele pega a letra em questão
				// como parametro e retorna true se estiver mapeando 
				if (mapLetras.containsKey(letra)) {
					int num = mapLetras.get(letra);
					//.put associa um valor a uma chave especifica 
					mapLetras.put(letra, num + 1);
				} else {
					mapLetras.put(letra, 1);
				}
			}
		}
		// retornando o set da palavra especifica no mapa
		Set<Character> letras = mapLetras.keySet();
		TreeSet<Character> sortedKeys = new TreeSet<>(letras);
		for (char chave : sortedKeys) {
			System.out.println("A letra " + chave + " repete-se " + mapLetras.get(chave) + " vezes.");
		}

	}
}
