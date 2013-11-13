package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Audiencia;

@javax.ejb.Singleton
public class AudienciaDAO extends GenericDAO<Audiencia>{
	
	public AudienciaDAO() {
		super(Audiencia.class);
	}

}
