package QuestaoUm;

import java.util.Scanner;

public class CampAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha;
		Scanner sc = new Scanner(System.in);
		CompArea aerea = new CompArea();
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
				System.out.println("Escolha sua poltrona do [1] ao [5]\n");
				System.out.printf("[1]\t[2]\t[3]\t[4]\t[5]\n");
				aerea.mostrarPoltronasPrimeiraClasse();
				escolha = sc.nextInt();
				
				//! estou negando o que está dentroe da expressao
				if(!aerea.verficaPoltronaPrimeira(escolha)) {
					System.out.println("Assento já está reservado!");
					if(aerea.primeiraClasseOcup()) {
						System.out.println("A primeira classe está cheia!");
						System.out.println("Deseja uma poltrona na classe economica?");
						System.out.println("1 sim");
						System.out.println("2 não");
						escolha = sc.nextInt();
						switch(escolha) {
						case 1:
							System.out.println("Escolha sua poltrona do [6] ao [10]\n");
							System.out.printf("[6]\t[7]\t[8]\t[9]\t[10]\n");
							aerea.mostrarPoltronasClasseEconomica();
							
							escolha = sc.nextInt();
							if(!aerea.verficaPoltronaClasseEconomica(escolha)) {
								System.out.println("Assento reservado");
								
							}
							break;
						default:
							System.out.println("Desculpa o incoveniente, o proximo voo sai em 3 horas!");
							playProgran = false;
							break;
						}
					}
				}
				
				break;
			case 2:
				System.out.println("Reservas dos assentos da classe economica!");
				System.out.println("Escolha sua poltrona do [6] ao [10]\n");
				System.out.printf("[6]\t[7]\t[8]\t[9]\t[10]\n");
				aerea.mostrarPoltronasClasseEconomica();
				escolha = sc.nextInt();
				if(!aerea. verficaPoltronaClasseEconomica(escolha)) {
					System.out.println("Assento já está reservado!");
					if(aerea.EconomicaClasseOcup()) {
						System.out.println("A classe economica está cheia!");
						System.out.println("Deseja uma poltrona na primeira classe ?");
						System.out.println("1 sim");
						System.out.println("2 não");
						escolha = sc.nextInt();
						switch(escolha) {
						case 1:
							System.out.println("Escolha sua poltrona do [1] ao [5]\n");
							System.out.printf("[1]\t[2]\t[3]\t[4]\t[5]\n");
							aerea.mostrarPoltronasPrimeiraClasse();
							
							escolha = sc.nextInt();
							if(!aerea.verficaPoltronaPrimeira(escolha)) {
								System.out.println("Assento reservado");
								
							}
							break;
						default:
							System.out.println("Desculpa o incoveniente, o proximo voo sai em 3 horas!");
							playProgran = false;
							break;
						}
					}
				}
				break;
			case 0:
			
				playProgran = false;
			default:
				System.out.println("Opção invalida");
				break;
			}

		} while (playProgran);
		
		System.out.println("Saindo");
		sc.close();
	}
}
