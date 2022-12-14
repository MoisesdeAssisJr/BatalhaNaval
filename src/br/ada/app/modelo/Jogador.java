package br.ada.app.modelo;

public abstract class Jogador {
	/*Automaticamente cada jogador, seja humano ou maquina, ter� um tabuleiro*/
	protected Tabuleiro tabuleiro;




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
}
