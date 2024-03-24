package view;

import java.time.LocalDate;

import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Alberto");
		p.setProfissao("Cozinheiro");
		//O set de idade maior que o máximo deve disparar uma mensagem e definir a idade como 0 (inserindo a data de hoje)
		p.setDataNascimento(LocalDate.of(1500, 10, 15));
		System.out.println(p.getNome()+", o(a) "+p.getProfissao()+" tem "+p.getIdade()+" anos");
		
		System.out.println();
		p.setDataNascimento(LocalDate.of(2004, 3, 25));
		System.out.println(p.getNome()+", o(a) "+p.getProfissao()+" tem "+p.getIdade()+" anos");
		
		
		
		
		
	}

}
