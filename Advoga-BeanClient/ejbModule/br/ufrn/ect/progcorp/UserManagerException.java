/**
 * 
 */
package br.ufrn.ect.progcorp;

/**
 * @author hivana
 *
 */

@ApplicationException
public class UserManagerException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public UserManagerException() {
		super();
	}
	
	public UserManagerException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserManagerException(String message) {
		super(message);
	}
	
	public UserManagerException(Throwable cause) {
		super(cause);
	}

}
