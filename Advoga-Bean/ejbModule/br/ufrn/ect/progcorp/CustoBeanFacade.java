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
	static final String EJB_NAME = "UserEJB";
	
	@EJB
	CustoDAO dao;

	@Override
	public void createCusto(Custo custo) throws CustoManagerException {
		dao.save(custo);
	}

	@Override
	public Custo readCusto(int custoId) throws CustoManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Custo updateCusto(Custo custo) throws CustoManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCusto(Custo custo) throws CustoManagerException {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Custo> getCustos() throws CustoManagerException {
		// TODO Auto-generated method stub
		return null;
	}





}
