package br.ufrn.ect.progcorp;

import java.util.List;

import javax.ejb.*;

import br.ufrn.ect.progcorp.CustoManagerException;
import br.ufrn.ect.progcorp.CustoManagerRemoteBusiness;
import br.ufrn.ect.progcorp.dao.CustoDAO;
import br.ufrn.ect.progcorp.model.Custo;


@Stateless(name = CustoBeanFacade.EJB_NAME)
@Remote(CustoManagerRemoteBusiness.class)
public class CustoBeanFacade implements CustoManagerRemoteBusiness {
	
	/**
	 * Name we'll assign to this EJB, will be referenced in the corresponding
	 * META-INF/ejb-jar.xml file
	 */
	static final String EJB_NAME = "CustoEJB";
	
	@EJB
	CustoDAO dao;

	@Override
	public void createCusto(Custo custo) throws CustoManagerException {
		dao.save(custo);
	}

	@Override
	public Custo readCusto(int custoId) throws CustoManagerException {
		return dao.find(custoId);
	}

	@Override
	public Custo updateCusto(Custo custo) throws CustoManagerException {
		return dao.update(custo);
	}

	@Override
	public void deleteCusto(Custo custo) throws CustoManagerException {
		dao.delete(custo);
	}

	@Override
	public List<Custo> getCustos() throws CustoManagerException {
		return dao.findAll();
	}





}
