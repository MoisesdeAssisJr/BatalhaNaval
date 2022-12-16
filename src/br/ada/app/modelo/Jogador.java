package br.ada.app.modelo;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public abstract class Jogador {
	/*Automaticamente cada jogador, seja humano ou maquina, ter� um tabuleiro*/
	protected Tabuleiro tabuleiro;
	static Scanner scan = new Scanner(System.in);



	public void setNavios() {

	}

	public abstract void atirar(int x, int y, Tabuleiro tabuleiro);
	public abstract void marcar(int x, int y, Tabuleiro tabuleiro);

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}



	public static String[][] setMarcacoesAtaques(String[][] marcacoes, Jogador jogador) {
		String coordenadasAtaque;
		String linhaAtaqueLetra = null;
		int colunaAtaque = 0;
		int linhaAtaque = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe as coordenadas da localização dos seus navios: ");
			coordenadasAtaque = scan.next();
			linhaAtaqueLetra = coordenadasAtaque.substring(0, 1);

			if (linhaAtaqueLetra.equals("a")) {
				linhaAtaque = 1;
			} else if (linhaAtaqueLetra.equals("b")) {
				linhaAtaque = 2;
			} else if (linhaAtaqueLetra.equals("c")) {
				linhaAtaque = 3;
			} else if (linhaAtaqueLetra.equals("d")) {
				linhaAtaque = 4;
			} else if (linhaAtaqueLetra.equals("e")) {
				linhaAtaque = 5;
			} else if (linhaAtaqueLetra.equals("f")) {
				linhaAtaque = 6;
			} else if (linhaAtaqueLetra.equals("g")) {
				linhaAtaque = 7;
			} else if (linhaAtaqueLetra.equals("h")) {
				linhaAtaque = 8;
			} else if (linhaAtaqueLetra.equals("i")) {
				linhaAtaque = 9;
			} else if (linhaAtaqueLetra.equals("j")) {
				linhaAtaque = 10;
			}
			colunaAtaque = 1 + Integer.parseInt(coordenadasAtaque.substring(1));

			marcacoes[linhaAtaque][colunaAtaque] = "N";
		}
		return marcacoes;


//		System.out.println(linhaAtaqueLetra);
//		System.out.println(linhaAtaque);
//		System.out.println(colunaAtaque);
	}

	public static String[][] setMarcacoesAtaquesAleatorio(String[][] marcacoes, Jogador jogador) {
		int naviosPosicionados = 0;
		while(naviosPosicionados < 11) {
			Random random = new Random();
			int coordenadaX = random.nextInt(1, 11);
			int coordenadaY = random.nextInt(1, 11);

			if (marcacoes[coordenadaX][coordenadaY].equals(" ")) {
				marcacoes[coordenadaX][coordenadaY] = "N";
				naviosPosicionados++;
			}
		}
		return marcacoes;
	}




	public int setCoordenadaX(String coordenadasAtaque) {
		String linhaAtaqueLetra = coordenadasAtaque.substring(0, 1);
		int linhaAtaque = 0;

		if (linhaAtaqueLetra.equals("a")) {
			linhaAtaque = 1;
		} else if (linhaAtaqueLetra.equals("b")) {
			linhaAtaque = 2;
		} else if (linhaAtaqueLetra.equals("c")) {
			linhaAtaque = 3;
		} else if (linhaAtaqueLetra.equals("d")) {
			linhaAtaque = 4;
		} else if (linhaAtaqueLetra.equals("e")) {
			linhaAtaque = 5;
		} else if (linhaAtaqueLetra.equals("f")) {
			linhaAtaque = 6;
		} else if (linhaAtaqueLetra.equals("g")) {
			linhaAtaque = 7;
		} else if (linhaAtaqueLetra.equals("h")) {
			linhaAtaque = 8;
		} else if (linhaAtaqueLetra.equals("i")) {
			linhaAtaque = 9;
		} else if (linhaAtaqueLetra.equals("j")) {
			linhaAtaque = 10;
		}
		return linhaAtaque;
	}


	public int setCoordenadaY(String coordenadasAtaque) {
		int colunaAtaque = 0;

		colunaAtaque = 1 + Integer.parseInt(coordenadasAtaque.substring(1));
		return colunaAtaque;

	}
}

