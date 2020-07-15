package POO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu;

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		System.out.println("Informe o valor 1 - cachorro 2- cavalo 3- preguica (Qualquer outro numero) aparece os 3 ");
		menu = sc.nextInt();

		switch (menu) {
		case 1:
			cachorro.emitirSom();
			cachorro.acao();
			break;
		case 2:
			cavalo.emitirSom();
			cavalo.acao();
			break;
		case 3:
			preguica.emitirSom();
			preguica.acao();
			break;
			default:
			System.out.println("Sons de todos os animais: ");
			System.out.printf("Cachorro: ");	cachorro.emitirSom();
			System.out.printf("Cavalo: ");	cavalo.emitirSom();
			System.out.printf("Preguica: "); preguica.emitirSom();
				break;
			
		}
		
	}

}
