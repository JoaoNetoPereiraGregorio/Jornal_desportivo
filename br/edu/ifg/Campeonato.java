package br.edu.ifg;

import java.util.Arrays;

public class Campeonato {
	String nome;
	Equipe equipes[] = new Equipe[2];
	Rodada rodadas[] = new Rodada[2];
	String divisao;

	public Campeonato() {

	}

	public Campeonato(String nome, Equipe[] equipes, Rodada[] rodadas, String divisao) {

		this.nome = nome;
		this.equipes = equipes;
		this.rodadas = rodadas;
		this.divisao = divisao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Equipe[] getEquipes() {
		return equipes;
	}

	public void setEquipes(Equipe[] equipes) {
		this.equipes = equipes;
	}

	public Rodada[] getRodadas() {
		return rodadas;
	}

	public void setRodadas(Rodada[] rodadas) {
		this.rodadas = rodadas;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	@Override
	public String toString() {
		return "Campeonato \n\nNome:" + nome + "\nDivisão:" + divisao + "\n\nEquipes" + imprimeEquipe(equipes)
				+ "\nRodadas\n\n" + imprimeRodada(rodadas) + "\n";
	}

	public String imprimeEquipe(Equipe[] equipes) {
		String mensagem = "";
		for (int i = 0; i < equipes.length; i++) {
			mensagem += "\n\nEquipe " + (i + 1) + equipes[i].toString();
		}
		return mensagem;
	}

	public String imprimeRodada(Rodada[] rodadas) {
		String mensagem = "";
		for (int i = 0; i < rodadas.length; i++) {
			mensagem += "Rodada " + (i + 1) + rodadas[i].toString();

		}
		return mensagem;
	}
}
