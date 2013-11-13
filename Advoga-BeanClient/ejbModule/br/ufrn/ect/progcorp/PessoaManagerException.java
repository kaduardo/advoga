/**
 * 
 */
package br.ufrn.ect.progcorp;

import javax.ejb.ApplicationException;

/**
 * @author arthur
 *
 */

@ApplicationException
public class PessoaManagerException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public PessoaManagerException() {
		super();
	}
	
	public PessoaManagerException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PessoaManagerException(String message) {
		super(message);
	}
	
	public PessoaManagerException(Throwable cause) {
		super(cause);
	}

}
