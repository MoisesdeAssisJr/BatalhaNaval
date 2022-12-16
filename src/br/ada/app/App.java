package br.ada.app;

import br.ada.app.modelo.*;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		// Imprimir instruções

		instrucoes();
		executarJogo();


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

	private static void executarJogo() {
		Jogador humano = new Humano();
		Jogador maquina = new Maquina();
		Tabuleiro tabuleiroHumano = new Tabuleiro(humano);
		Tabuleiro tabuleiroMaquina = new Tabuleiro(maquina);
		String[][] tabuleiroNovo = new String[11][11];
		String[][] marcacoesHumano = new String[11][11];
		String[][] marcacoesMaquina = new String[11][11];

		tabuleiroHumano.carregarTabuleiro(tabuleiroNovo, humano);
		tabuleiroHumano.carregarTabuleiro(marcacoesHumano, humano);
		tabuleiroHumano.carregarTabuleiro(marcacoesMaquina, maquina);

		// Jogador Humano faz a indicação de dez slots para posicionar os seus navios

		opcaoDeMarcacaoDeNavios(marcacoesHumano, humano);

		// Maquina faz marcações de dez navios aleatoriamente no tabuleiroMaquina
		Maquina.setMarcacoesAtaquesAleatorio(marcacoesMaquina, maquina);

		// Imprime tabuleiro de marcações do jogador humano
		tabuleiroHumano.imprimirTabuleiro(marcacoesHumano, humano);


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
		desejaJogarNovamente();
	}

	private static void opcaoDeMarcacaoDeNavios(String[][] marcacoes, Jogador humano) {
		System.out.println("Jogador 1 deve posicionar os seus 10 navios.");
		System.out.println("Deseja posicionar os navios aleatória ou manualmente?");
		int decisao = Utils.getNumeroInt("Digite 1 para aleatória ou 2 para manual.");
		if (decisao == 1) {
			Humano.setMarcacoesAtaquesAleatorio(marcacoes, humano);
		} else if (decisao == 2) {
			Humano.setMarcacoesAtaques(marcacoes, humano);
		} else {
			System.out.println("Opção inválida. Tente novamente.");
			opcaoDeMarcacaoDeNavios(marcacoes, humano);
		}
	}

	private static void desejaJogarNovamente() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Deseja jogar uma nova partida?");
		int resposta = Utils.getNumeroInt("Digite 1 para Sim e 2 para não.");

		if (resposta == 1) {
			executarJogo();
		} else if (resposta == 2) {
			System.out.println("Encerrando programa.");
		} else {
			System.out.println("Opção inválida. Tente novamente.");
			desejaJogarNovamente();
		}
	}
}


