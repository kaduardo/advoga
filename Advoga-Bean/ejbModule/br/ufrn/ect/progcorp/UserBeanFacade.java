package br.ufrn.ect.progcorp;

import java.util.List;

import javax.ejb.*;

import br.ufrn.ect.progcorp.UserManagerException;
import br.ufrn.ect.progcorp.UserManagerRemoteBusiness;
import br.ufrn.ect.progcorp.dao.UserDAO;
import br.ufrn.ect.progcorp.model.User;


@Stateless(name = UserBeanFacade.EJB_NAME)
@Remote(UserManagerRemoteBusiness.class)
public class UserBeanFacade implements UserManagerRemoteBusiness {
	
	/**
	 * Name we'll assign to this EJB, will be referenced in the corresponding
	 * META-INF/ejb-jar.xml file
	 */
	static final String EJB_NAME = "UserEJB";
	
	@EJB
	UserDAO dao;

	@Override
	public void createUser(User user) throws UserManagerException {
		dao.save(user);
	}

	@Override
	public User readUser(int userId) throws UserManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws UserManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User user) throws UserManagerException {
		// TODO Auto-generated method stub
	}

	@Override
	public List<User> getUsers() throws UserManagerException {
		// TODO Auto-generated method stub
		return null;
	}





}
