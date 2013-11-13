package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Pessoa;

@javax.ejb.Singleton
public class PessoaDAO extends GenericDAO<Pessoa> {
	
	public PessoaDAO() {
		super(Pessoa.class);
	}

}
