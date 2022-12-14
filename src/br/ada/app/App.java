package br.ada.app;

import br.ada.app.modelo.Humano;
import br.ada.app.modelo.Jogador;
import br.ada.app.modelo.Maquina;
import br.ada.app.modelo.Tabuleiro;


public class App {

	public static void main(String[] args) {

		// Imprimir instruções

		instrucoes();

		Jogador humano = new Humano();
		Jogador maquina = new Maquina();
		Tabuleiro tabuleiroHumano = new Tabuleiro(humano);
		Tabuleiro tabuleiroMaquina = new Tabuleiro(maquina);
		String[][] tabuleiroNovo = new String[11][11];
		String [][] marcacoes;

		tabuleiroHumano.carregarTabuleiro(tabuleiroNovo, humano);

		// Jogador Humano faz a indicação de dez slots para posicionar os seus navios
		marcacoes = tabuleiroHumano.setMarcacoesAtaques(tabuleiroNovo, humano);

		tabuleiroHumano.imprimirTabuleiro(marcacoes, humano);

		// Maquina faz marcações de dez navios aleatoriamente no tabuleiroMaquina


		// Em cada rodada:
			// Jogador Humano indica coordenadas do ataque
			// Coordenadas do ataque são enviadas para o tabuleiroMaquina
			// Coordenadas são utilizadas para fazer anotações no tabuleiroHumano, com verificações do tipo de marcação
			// Maquina dispara aleatoriamente
			// Coordenadas do ataque são enviadas para o tabuleiroJogador
			// Coordenadas são utilizadas para fazer anotações no tabuleiroHumano, com verificações do tipo de marcação

		// Verifica se há ganhador
			// Se não houve ganhador:
				// Imprime tabuleiroHumano com marcações
				// Inicia nova rodada.
			// Se houve ganhador:
				// Imprime mensagem de game over
				// Imprime os dois tabuleiros com marcações

		// Pergunta se deseja iniciar nova partida

	}

	private static void instrucoes() {

		System.out.println("Batalha Naval.");
		System.out.println("Neste jogo de tabuleiro, o objetivo é acertar os navios inimigos.");
		System.out.println("Cada jogador posicionará 10 navios em qualquer coordenada do seu tabuleiro de 10x10.");
		System.out.println("A cada rodada, cada jogador informa as coordenadas de seu ataque.");
		System.out.println("Para realizar ataques informe as coordenadas no formato letra e numero. Ex. A1, H3, etc.");
		System.out.println("Vencerá o jogo quem acertar primeiro todas as 10 embarcações inimigas.");
		System.out.println("Boa sorte!");

	}
}


