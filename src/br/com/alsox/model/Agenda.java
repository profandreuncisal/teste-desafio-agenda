package br.com.alsox.model;

import java.time.LocalDate;

public class Agenda {

	// Atributos da agenda
	private int codigo;
	private String evento;
	private LocalDate data;
	private String hora;
	private String local;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Agenda [codigo=" + codigo + ", evento=" + evento + ", data=" + data + ", hora=" + hora + ", local="
				+ local + ", descricao=" + descricao + "]";
	}

	
	
	
}
