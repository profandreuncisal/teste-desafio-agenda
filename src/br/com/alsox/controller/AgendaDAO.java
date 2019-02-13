package br.com.alsox.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.alsox.model.Agenda;

public class AgendaDAO {

	private List<Agenda> eventos = new ArrayList<>();
	
	public void marcarEvento() throws ParseException {
		
		eventos.add(coletaEvento());
	
	}
	
	public void desmarcarEvento() {
		
	}
	
	public void listarEventos() {
		
		
		for (Agenda agenda : eventos) {
			System.out.println(agenda.toString());
		} 
		
		/*
		for (int x=0; x <= eventos.size()-1; x++) {
			System.out.println(eventos.get(x).toString());
		}*/
		
	}
	
	public void eventoPorId(int codigo) {
		
	}
	
	private Agenda coletaEvento() throws ParseException {

		int codigo;
		String evento;
		String data;
		String hora;
		String local;
		String descricao;

		@SuppressWarnings("resource")
		Scanner agendamento = new Scanner(System.in);

		System.out.printf("QUAL O CÓDIGO DO EVENTO   ?  -> ");
		codigo = agendamento.nextInt();

		agendamento.nextLine(); // esvaziando o buffer

		System.out.printf("\nQUAL NOME DO EVENTO     ?  -> ");
		evento = agendamento.nextLine();

		System.out.printf("\nQUAL DATA SERÁ O EVENTO ?  -> ");
		data = agendamento.nextLine();

		System.out.printf("\nQUAL O HORARIO DO EVENTO ? -> ");
		hora = agendamento.nextLine();

		System.out.printf("\nONDE  SERÁ  O  EVENTO  ?   -> ");
		local = agendamento.nextLine();

		System.out.printf("\nDESCREVA O  EVENTO  ?   -> ");
		descricao = agendamento.nextLine();
	
		Agenda agenda = new Agenda();

		agenda.setCodigo(codigo);
		agenda.setEvento(evento);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataRecebida = LocalDate.parse(data, formato);
		agenda.setData(dataRecebida);

		agenda.setHora(hora);
		agenda.setLocal(local);
		agenda.setDescricao(descricao);
		
		return agenda;
	}

	
}
