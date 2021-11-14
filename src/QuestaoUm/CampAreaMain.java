package QuestaoUm;

import java.util.Scanner;

public class CampAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int escolha;
		boolean playProgran = true;
		do {
			System.out.println("Companhia UFERSA!");
			System.out.println("Realize sua reserva!");
			System.out.println("1 Primeira Classe");
			System.out.println("2 Classe Economica");
			System.out.println("0 Sair");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Reservas dos assentos da primeira classe!");
				break;
			case 2:
				System.out.println("Reservas dos assentos da classe economica!");
				break;
			case 0:
				System.out.println("Saindo");
				playProgran = false;
			default:
				System.out.println("Opção invalida");
				break;
			}

		} while (playProgran);
		sc.close();
	}
}
