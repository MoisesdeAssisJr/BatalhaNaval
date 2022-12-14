package br.ada.app.enumeration;

public enum MarcacaoEnum {
	NAVIO_POS("N"),
	TIRO_CERTEIRO("*"),
	TIRO_AGUA("-"),
	TIRO_CERTEIRO_NAVIO("X"),
	TIRO_AGUA_NAVIO("n");
	
	private String marca;
	
	MarcacaoEnum(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
}
