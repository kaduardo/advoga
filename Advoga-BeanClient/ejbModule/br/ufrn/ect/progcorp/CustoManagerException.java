/**
 * 
 */
package br.ufrn.ect.progcorp;

import javax.ejb.ApplicationException;

/**
 * @author hivana
 *
 */

@ApplicationException
public class CustoManagerException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public CustoManagerException() {
		super();
	}
	
	public CustoManagerException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CustoManagerException(String message) {
		super(message);
	}
	
	public CustoManagerException(Throwable cause) {
		super(cause);
	}

}
