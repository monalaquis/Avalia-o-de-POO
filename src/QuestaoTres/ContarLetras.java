package QuestaoTres;

import java.util.ArrayList;

public class ContarLetras {

	
	private ArrayList <Character> caractere;
	private ArrayList <Integer> qtd;
	
	public static void main(String[] args) {
		new ContarLetras();
	}
	
	public ContarLetras() {
		contar("HELLO THERE");
		mostrarResultado();
	}

	private void mostrarResultado() {
		System.out.println("-----------------------");
		for (Character i: caractere) {
			System.out.println(i+" - "+ qtd.get(caractere.indexOf(i)));
		}
	}
	
	private void contar(String texto) {
		caractere = new ArrayList<Character>();
		qtd = new ArrayList<Integer>();
		
		for(Character i: texto.toCharArray()){
			//transfor todos em maiusculos 
			i = Character.toUpperCase(i);
			// se não tiver o carctere dentro do array 
			if(!caractere.contains(i)) {
				//colocando o caracter na posição zero do array
				caractere.add(i);
				qtd.add(1);
				//se encontrar o carctere existente o meu contador daquela variavel irá alterar o valor
			}else {
				int indice = caractere.indexOf(i);
				qtd.set(indice, qtd.get(indice)+1);
				
			}
		}
	}

}
