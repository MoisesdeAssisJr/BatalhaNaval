package br.ada.app.modelo;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

	Scanner scan = new Scanner(System.in);


	public static String[][] getTabuleiro() {
		return tabuleiro;
	}

	public static void setTabuleiro(String[][] tabuleiro) {
		Tabuleiro.tabuleiro = tabuleiro;
	}

	public static String[][] tabuleiro = new String[11][11];

	public Jogador tipoJogador;

	// Um tabuleiro tem 11 x 11
	// Na primeira linha, indicar numeros de 0 a 9
	// Na primeira coluna, indicar letras de A a J


	public Tabuleiro(Jogador tipoJogador) {
		this.tipoJogador = tipoJogador;

	}

	private static final String JOGADOR = "Jogador 1";
	private static final String MAQUINA = "Máquina";
	private static final String TITULO = "---------------------------------------------\n"
										+ "				  %s\n"
										+ "---------------------------------------------\n";
	
	public void carregarTabuleiro(String[][] tabuleiroNovo, Jogador jogador) {
		String tipo = jogador instanceof Humano ? JOGADOR : MAQUINA;
		String tabela = TITULO;
		int indiceLinha = 0;
		String indiceColuna;
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 11; j++) {
				tabuleiroNovo[i][j] = " ";
				tabuleiroNovo[0][1] = "0";
				tabuleiroNovo[0][2] = "1";
				tabuleiroNovo[0][3] = "2";
				tabuleiroNovo[0][4] = "3";
				tabuleiroNovo[0][5] = "4";
				tabuleiroNovo[0][6] = "5";
				tabuleiroNovo[0][7] = "6";
				tabuleiroNovo[0][8] = "7";
				tabuleiroNovo[0][9] = "8";
				tabuleiroNovo[0][10] = "9";
				tabuleiroNovo[1][0] = "A";
				tabuleiroNovo[2][0] = "B";
				tabuleiroNovo[3][0] = "C";
				tabuleiroNovo[4][0] = "D";
				tabuleiroNovo[5][0] = "E";
				tabuleiroNovo[6][0] = "F";
				tabuleiroNovo[7][0] = "G";
				tabuleiroNovo[8][0] = "H";
				tabuleiroNovo[9][0] = "I";
				tabuleiroNovo[10][0] = "J";
				tabela += "| " + tabuleiroNovo[i][j]+ " ";
			}
			tabela += "|\n---------------------------------------------\n";

		}
		//System.out.printf(tabela, tipo);
	}

	public void imprimirTabuleiro(String[][] marcacoes, Jogador jogador) {
		String tipo = jogador instanceof Humano ? JOGADOR : MAQUINA;
		String tabela = TITULO;
		int indiceLinha = 0;
		String indiceColuna;
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 11; j++) {
				marcacoes[0][1] = "0";
				marcacoes[0][2] = "1";
				marcacoes[0][3] = "2";
				marcacoes[0][4] = "3";
				marcacoes[0][5] = "4";
				marcacoes[0][6] = "5";
				marcacoes[0][7] = "6";
				marcacoes[0][8] = "7";
				marcacoes[0][9] = "8";
				marcacoes[0][10] = "9";
				marcacoes[1][0] = "A";
				marcacoes[2][0] = "B";
				marcacoes[3][0] = "C";
				marcacoes[4][0] = "D";
				marcacoes[5][0] = "E";
				marcacoes[6][0] = "F";
				marcacoes[7][0] = "G";
				marcacoes[8][0] = "H";
				marcacoes[9][0] = "I";
				marcacoes[10][0] = "J";
				tabela += "| " + marcacoes[i][j] + " ";
			}
			tabela += "|\n---------------------------------------------\n";

		}
		System.out.printf(tabela, tipo);
	}





}
