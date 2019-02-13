package br.com.alsox.view;

import java.text.ParseException;
import java.util.Scanner;

import br.com.alsox.controller.AgendaDAO;

public class AgendaView {

	private AgendaDAO agendaDao = new AgendaDAO();
	private int opcao = 0;

	@SuppressWarnings("resource")
	public void menu() {

		System.out.println("agenda v1.0                                        ");
		System.out.println("                                                   ");
		System.out.println("                   MENU DE OPÇÕES                  ");
		System.out.println("===================================================");
		System.out.println("[1] - N O V O  E V E N T O.........................");
		System.out.println("[2] - E V E N T O POR  C O D I G O.................");
		System.out.println("[3] - L I S T A R   T O D O S   E V E N T O S......");
		System.out.println("[4] - E X C L U I R  E V E N T O ..................");
		System.out.println("[5] - S A I R  D O  S I S T E M A .................");
		System.out.println("===================================================");

		Scanner ler = new Scanner(System.in);
		
		while (opcao != 5) {

			System.out.printf("\nESCOLHA UMA OPERAÇÃO ! -> ");
			opcao = ler.nextInt();

			if (opcao == 1) {

				try {

					System.out.println(" -*- Marcar evento -*-");
					agendaDao.marcarEvento();
					System.out.println("\n=======================================================");
					System.out.println("E V E N T O  A G E N D A D O  C O M  S U C E S S O !");
					System.out.println("=======================================================");

				} catch (ParseException e) {

					System.err.println(e.getMessage());
				}

			} else if (opcao == 2) {

			} else if (opcao == 3) {
				
				System.out.println(" -*- Listando todos eventos -*-");
				agendaDao.listarEventos();
				System.out.println("\n=======================================================");
				System.out.println("E V E N T O S  L I S T A D O S !");
				System.out.println("=======================================================");

			} else if (opcao == 4) {

			} else if (opcao == 5) {

				System.out.println("S A I N D O  D O  S I S T E M A .....tchau :)");
				break;

			} else {

				System.err.println("O P Ç Ã O  I N V Á L I D A !");
			}
		}
	}


}
