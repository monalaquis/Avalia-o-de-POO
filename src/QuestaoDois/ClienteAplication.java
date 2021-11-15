package QuestaoDois;


import java.util.Scanner;

public class ClienteAplication {

	public static void main(String[] args) {
		boolean playProgran = true;

		int id, idade;
		String nome, telefone;


		System.out.println("--------------Cadastro de cliente--------------");

		System.out.println();
		System.out.println();

		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("ID do cliente: ");
			id = entrada.nextInt();
			if (id < 0) {
				playProgran = false;
				System.out.println("Voce digitou um numero negativo, e esta encerrando o programa!");
			} else {

				System.out.println("Informe o Nome do cliente: ");
				nome = entrada.next();

				System.out.println("Informe a idade do cliente: ");
				idade = entrada.nextInt();

				System.out.println("Informe o telefone do cliente: ");
				telefone = entrada.next();

				new Cliente(id, nome, idade, telefone);
			}

		} while (playProgran);

		System.out.println("CLIENTES CADASTRADOS");
		System.out.println("---------------------");
		Cliente.mostraClinCadastrado();
		
		entrada.close();
	

	}

}
