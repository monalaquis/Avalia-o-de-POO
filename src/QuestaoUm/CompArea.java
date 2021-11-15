package QuestaoUm;

public class CompArea {

	private boolean[] assentos = new boolean[10];

	public boolean[] getAssetentos() {
		return assentos;
	}

	public void setAssetentos(boolean[] assetentos) {
		this.assentos = assetentos;
	}

	void mostrarPoltronasPrimeiraClasse() {
		for (int i = 0; i < 5; i++) {
			if (this.assentos[i] == true) {
				System.out.print("[X]\t");
			} else {
				System.out.print("[ ]\t");
			}
		}
		System.out.println();
	}

	public boolean verficaPoltronaPrimeira(int poltronaEscolhida) {
		if (poltronaEscolhida >= 1 && poltronaEscolhida <= 5) {
			if (assentos[poltronaEscolhida - 1] == false) {
				this.assentos[poltronaEscolhida - 1] = true;
				System.out.printf("Poltrona de numero %d está reservada!\n", poltronaEscolhida);
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean primeiraClasseOcup() {
		for (int i = 0; i < 5; i++) {
			if (this.assentos[i] == false) {
				return false;
			}
		}
		return true;
	}

	
	public boolean verficaPoltronaClasseEconomica(int poltronaEscolhida) {
		if (poltronaEscolhida >= 6 && poltronaEscolhida <= 10) {
			if (assentos[poltronaEscolhida - 1] == false) {
				this.assentos[poltronaEscolhida - 1] = true;
				System.out.printf("Poltrona de numero %d está reservada!\n", poltronaEscolhida);
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
	void mostrarPoltronasClasseEconomica() {
		for (int i = 5; i < 10; i++) {
			if (this.assentos[i] == true) {
				System.out.print("[X]\t");
			} else {
				System.out.print("[ ]\t");
			}
		}
		System.out.println();
	}
	public boolean EconomicaClasseOcup() {
		for (int i = 5; i < 10; i++) {
			if (this.assentos[i] == false) {
				return false;
			}
		}
		return true;
	}



}
