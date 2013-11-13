package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Vara;

@javax.ejb.Singleton
public class VaraDAO extends GenericDAO<Vara> {
	public VaraDAO() {
		super(Vara.class);
	}
}
