package model;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
		if (getIdade()>150 || getIdade()<0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			this.dataNascimento = LocalDate.of(2024, 3, 19);
		}
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		int anoN = dataNascimento.getYear();
		int mesN = dataNascimento.getMonthValue();
		int diaN = dataNascimento.getDayOfMonth();
		int anoH = hoje.getYear();
		int mesH = hoje.getMonthValue();
		int diaH = hoje.getDayOfMonth();
		int diaI = diaH - diaN;
		if (diaI < 0) {
			mesH--;
			diaI+=30;
		}
		int mesI = mesH - mesN;
		if (mesI < 0) {
			anoH--;
			mesI+=12;
		}
		int anoI=anoH - anoN;
		return anoI;
	}
}
