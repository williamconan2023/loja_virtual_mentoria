package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pessoa_fisica")
@PrimaryKeyJoinColumn(name="id")
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	private Date dataNasc;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

	
}
