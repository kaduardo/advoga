/**
 * 
 */
package br.ufrn.ect.progcorp;

import java.util.List;

/**
 * @author hivana
 * 
 * Contains the contract for operations common to all business UserManagerEJB
 *
 */
public interface UserManagerCommonBusiness {
	
	/**
	 * 
	 * @return 
	 * @throws UserManagerException
	 */
	void createUser(User user) throws UserManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws UserManagerException
	 */
	User readUser(int userId) throws UserManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws UserManagerException
	 */
	User updateUser(User user) throws UserManagerException;
	
	/**
	 * 
	 * @return 
	 * @throws UserManagerException
	 */
	void deleteUser(User user) throws UserManagerException;
	
	/**
	 * 
	 * @return all users list
	 * @throws UserManagerException
	 */
	List<User> getUsers() throws UserManagerException;
	

}
