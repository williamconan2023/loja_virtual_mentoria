package jdev.mentoria.lojavirtual.enums;

public enum StatusContaReceber {

	COBRANCA("cobranca"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	QUITADA("quitada");
	
	private String descricao;
	
	StatusContaReceber(String descricao) {
		this.descricao = descricao;	}

	
	public String getDescricao() {
		return descricao;
	}
    
	@Override
	public String toString() {
		return this.descricao;
	}
	
	
}
