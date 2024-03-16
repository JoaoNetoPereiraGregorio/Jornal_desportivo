package br.edu.ifg;

import java.util.Arrays;

public class Rodada {
	Jogo jogos[] = new Jogo[2];

	public Rodada() {

	}

	public Rodada(Jogo[] jogos) {

		this.jogos = jogos;
	}

	public Jogo[] getJogos() {
		return jogos;
	}

	public void setJogos(Jogo[] jogos) {
		this.jogos = jogos;
	}

	@Override
	public String toString() {
		return   imprimeJogos(jogos) + "\n";
	}
	
	public String imprimeJogos(Jogo[] jogos) {
		String mensagem="";
		for(int i=0;i<jogos.length;i++) {
			mensagem+="\n\nJogo "+(i+1)+ jogos[i].toString();
		}
		
		return mensagem;
	}
	

}
