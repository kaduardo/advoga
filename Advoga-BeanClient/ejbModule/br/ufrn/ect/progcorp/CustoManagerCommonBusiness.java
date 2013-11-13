/**
 * 
 */
package br.ufrn.ect.progcorp;

import java.util.List;

import br.ufrn.ect.progcorp.model.Custo;

/**
 * @author hivana
 * 
 * Contains the contract for operations common to all business UserManagerEJB
 *
 */
public interface CustoManagerCommonBusiness {
	
	/**
	 * 
	 * @return 
	 * @throws CustoManagerException
	 */
	void createCusto(Custo custo) throws CustoManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws CustoManagerException
	 */
	Custo readCusto(int custoId) throws CustoManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws CustoManagerException
	 */
	Custo updateCusto(Custo custo) throws CustoManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws CustoManagerException
	 */
	void deleteCusto(Custo custo) throws CustoManagerException;
	
	/**
	 * 
	 * @return all users list
	 * @throws CustoManagerException
	 */
	List<Custo> getCustos() throws CustoManagerException;
	

}
