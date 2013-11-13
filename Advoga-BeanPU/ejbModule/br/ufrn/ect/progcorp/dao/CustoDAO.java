package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Custo;

@javax.ejb.Singleton
public class CustoDAO extends GenericDAO<Custo> {
	
	public CustoDAO() {
		super(Custo.class);
	}	

}
