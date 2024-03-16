package br.edu.ifg;

import java.util.Arrays;

public class Equipe {
	private int pontuacao;
	private Jogador jogadores[] = new Jogador[24];
	private Tecnico tecnicos[] = new Tecnico[2];
	private String nome;
	
	public Equipe() {
		
	}

	public Equipe(int pontuacao, Jogador[] jogadores, Tecnico[] tecnicos, String nome) {
		
		this.pontuacao = pontuacao;
		this.jogadores = jogadores;
		this.tecnicos = tecnicos;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico[] getTecnico() {
		return tecnicos;
	}

	public void setTecnico(Tecnico[] tecnicos) {
		this.tecnicos = tecnicos;
	}

	@Override
	public String toString() {
		return " \n\nNome:" + nome + "\nPontuacao:" + pontuacao + "\n\nJogadores\n"
				+ imprimeJogadores(jogadores) + "\nTecnicos\n" + imprimeTecnicos(tecnicos) + "\n";
	}

	public String imprimeJogadores(Jogador jogadores[]) {
		String mensagem = "";
		for (int i = 0; i < jogadores.length; i++) {
			mensagem += "\nJogador " + (i + 1) + "\nNome:" + jogadores[i].getNome() + "\nNumero:"
					+ jogadores[i].getNumero() + "\nTitular:" + jogadores[i].isTitular() + "\nCPF:"
					+ jogadores[i].getCpf() + "\nSexo:" + jogadores[i].getSexo() + "\n";
		}

		return mensagem;
	}

	public String imprimeTecnicos(Tecnico[] tecnicos) {
		String mensagem = "";
		for (int i = 0; i < tecnicos.length; i++) {
			mensagem += "\nTecnico " + (i + 1) + "\nNome:" + tecnicos[i].getNome() + "\nCPF:" + tecnicos[i].getCpf()
					+ "\nSexo:" + tecnicos[i].getSexo() + "\nFunção:" + tecnicos[i].getFuncao() + "\n";
		}

		return mensagem;
	}

}
