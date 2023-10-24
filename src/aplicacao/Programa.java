package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;
import entidades.Quarto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Quarto quartos[] = new Quarto [10];
		int quantidadeDePessoasQueVaoAlugarUmQuarto, quardoDesejado;
		
		for (int i=0; i<quartos.length; i++) { quartos[i] = new Quarto(i); }
		do {
			System.out.print("Digite a quantidade de pessoas que vao alugar os quartos: ");
			quantidadeDePessoasQueVaoAlugarUmQuarto = sc.nextInt();
			sc.nextLine();
			if (quantidadeDePessoasQueVaoAlugarUmQuarto < 1 || 
					quantidadeDePessoasQueVaoAlugarUmQuarto > 10)
			System.out.println("Quantidade invalida!");
		} while (quantidadeDePessoasQueVaoAlugarUmQuarto < 1 || 
				quantidadeDePessoasQueVaoAlugarUmQuarto > 10);
		
		for (int i=1; i<=quantidadeDePessoasQueVaoAlugarUmQuarto; i++) {
			do {
			System.out.print("Digite o numero do quarto na qual gostaria de alugar: ");
			quardoDesejado = sc.nextInt();
			sc.nextLine();
			if (quartos[quardoDesejado].getOcupado())
				System.out.println("Quarto indisponivel no momento!");
			} while (quartos[quardoDesejado].getOcupado());
			quartos[quardoDesejado].setOcupado(true);
			System.out.print("\nPor favor digite seus dados abaixo\nNome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			quartos[quardoDesejado].setPessoa(new Pessoa(nome,email));
			System.out.println("Quarto alugado com sucesso!\n");
		}
		
		System.out.println("--------------------------------");
		
		for (int i=0; i<quartos.length; i++) { System.out.println(quartos[i]); }
		sc.close();
	}
}
