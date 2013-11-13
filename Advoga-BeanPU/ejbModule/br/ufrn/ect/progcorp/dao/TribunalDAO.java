package br.ufrn.ect.progcorp.dao;

import br.ufrn.ect.progcorp.model.Tribunal;

@javax.ejb.Singleton
public class TribunalDAO extends GenericDAO<Tribunal> {

    public TribunalDAO() {
    	super(Tribunal.class);
    }
    
}