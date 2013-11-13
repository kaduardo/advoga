package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Processo;

@javax.ejb.Singleton
public class ProcessoDAO extends GenericDAO<Processo> {
	
	public ProcessoDAO() {
		super(Processo.class);
	}

}
