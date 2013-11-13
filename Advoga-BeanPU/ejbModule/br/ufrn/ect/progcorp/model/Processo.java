package br.ufrn.ect.progcorp.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Processo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Status status;
	
	private int numeroProcesso;
	
	private Date dataInicio;

	private Date dataConclusao;
	
	@OneToMany
	private Collection<Audiencia> audiencias;
	
	@OneToMany
	private Collection<Custo> custos;
	
	@OneToOne
	private Pessoa cliente;
	
	@OneToOne
	private Pessoa parteContraria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public Collection<Audiencia> getAudiencias() {
		return audiencias;
	}

	public void setAudiencias(Collection<Audiencia> audiencias) {
		this.audiencias = audiencias;
	}

	public Collection<Custo> getCustos() {
		return custos;
	}

	public void setCustos(Collection<Custo> custos) {
		this.custos = custos;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(Pessoa parteContraria) {
		this.parteContraria = parteContraria;
	}

	public int getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(int numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	
}
