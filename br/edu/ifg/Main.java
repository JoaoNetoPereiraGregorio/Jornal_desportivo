package br.edu.ifg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        //Criando Primeira Equipe
		Jogador jogador1Palmeiras = new Jogador("Dudu", "1111", "Masculino", true, 7);
		Jogador jogador2Palmeiras = new Jogador("João", "5555", "Masculino", false, 11);
		Jogador jogadoresPalmeiras[] = { jogador1Palmeiras, jogador2Palmeiras };
		Tecnico tecnicoPalmeiras = new Tecnico("Abel", "2222", "Masculino", "Tecnico");
		Tecnico auxTecnicoPalmeiras = new Tecnico("João Martins", "3658", "Masculino", "Auxiliar Tecnico");
		Tecnico tecnicosPalmeiras[] = { tecnicoPalmeiras, auxTecnicoPalmeiras };
		Equipe palmeiras = new Equipe(12, jogadoresPalmeiras, tecnicosPalmeiras, "palmeiras");
		

		//Criando segunda equipe
		Jogador jogador1Cori = new Jogador("Casio", "6789", "Masculino", true, 1);
		Jogador jogador2Cori = new Jogador("Renato Augusto", "3568", "Masculino", true, 7);
		Jogador jogadoresCori[] = { jogador1Cori, jogador2Cori };
		Tecnico tecnicoCori = new Tecnico("Luxa", "3457", "Masculino", "Tecnico");
		Tecnico auxTecnicoCori = new Tecnico("Mateus", "3579", "Masculino", "Auxiliar Tecnico");
		Tecnico tecnicosCori[] = { tecnicoCori, auxTecnicoCori };
		Equipe cori = new Equipe(8, jogadoresCori, tecnicosCori, "coringa");
		Equipe equipes[]= {palmeiras,cori};
		
		
		//Criando Arbitros
		Arbitro arbitroCampo = new Arbitro("Daronco", "2345", "Masculino", "Arbitro de campo", "Minas Gerais");
		Arbitro arbitroBandeira = new Arbitro("Jose", "3478", "Masculino", "Arbitro de canto", "Minas Gerais");
		Arbitro arbitros[] = { arbitroCampo, arbitroBandeira };
		
		
		//Criando Jogos
		Jogo jogo1 = new Jogo(palmeiras, cori, "06/09/2023", "21:00", "Neo Quimica Arena", arbitros);
		Jogo jogo2 = new Jogo(cori, palmeiras, "13/09/2023", "21:45", "Allianz Parque", arbitros);
		Jogo jogosRodada1[]= {jogo1};
		Jogo jogosRodada2[]= {jogo2};
		
		//Criando Rodadas
		Rodada rodada1= new Rodada(jogosRodada1);
		Rodada rodada2= new Rodada(jogosRodada2);
		Rodada rodadas[]= {rodada1,rodada2};
		
		//Criando Campeonato
		Campeonato brasileirao=new Campeonato("Brasileirão", equipes, rodadas, "Primeira Divisão");
		System.out.println(brasileirao.toString());
		

	}

}
