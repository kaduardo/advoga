/**
 * 
 */
package br.ufrn.ect.progcorp;

import java.util.List;

import br.ufrn.ect.progcorp.model.Pessoa;

/**
 * @author arthur
 * 
 * Contains the contract for operations common to all business UserManagerEJB
 *
 */
public interface PessoaManagerCommonBusiness {
	
	/**
	 * 
	 * @return 
	 * @throws PessoaManagerException
	 */
	void createPessoa(Pessoa pessoa) throws PessoaManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws PessoaManagerException
	 */
	Pessoa readPessoa(int pessoaId) throws PessoaManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws PessoaManagerException
	 */
	Pessoa updatePessoa(Pessoa pessoa) throws PessoaManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws PessoaManagerException
	 */
	void deletePessoa(Pessoa pessoa) throws PessoaManagerException;
	
	/**
	 * 
	 * @return all users list
	 * @throws PessoaManagerException
	 */
	List<Pessoa> getPessoas() throws PessoaManagerException;
	

}
