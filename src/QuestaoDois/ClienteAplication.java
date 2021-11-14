package QuestaoDois;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteAplication {

	public static void main(String[] args) {

		System.out.println("--------------Cadastro de cliente--------------");

		

		System.out.println();
		System.out.println();

		ArrayList<Cliente> cadastroCliente = new ArrayList<Cliente>();

		try (Scanner entrada = new Scanner(System.in)) {
			int id, idade;
			String nome, telefone;
			

			while (true) {
				System.out.println("ID do cliente: ");
				id = entrada.nextInt();
				if (id < 0) {
					break;
				}
				System.out.println("Informe o Nome do cliente: ");
				nome = entrada.next();

				System.out.println("Informe a idade do cliente: ");
				idade = entrada.nextInt();

				System.out.println("Informe o telefone do cliente: ");
				telefone = entrada.next();

				cadastroCliente.add(new Cliente(id, nome, idade, telefone));

			}
		}
		System.out.println("--------------Cadastro Realizado--------------");
		
		System.out.println("--------------Relatório de clientes--------------");
		System.out.println(String.format("*Número total de clientes: %d", cadastroCliente.size()));
		System.out.println("--------------Relatório de clientes--------------");
		for (int i = 0; i < cadastroCliente.size(); i++) {
			System.out.println(cadastroCliente.get(i).toString());
			System.out.println("---------------------------------------------");
		}


	}

}
