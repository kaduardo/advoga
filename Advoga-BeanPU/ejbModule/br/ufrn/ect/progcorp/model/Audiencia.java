package br.ufrn.ect.progcorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Audiencia {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String data;
	
	private String recomenda��o;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRecomenda��o() {
		return recomenda��o;
	}

	public void setRecomenda��o(String recomenda��o) {
		this.recomenda��o = recomenda��o;
	}
	
	
}
