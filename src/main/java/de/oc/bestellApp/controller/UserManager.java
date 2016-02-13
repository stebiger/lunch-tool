package de.oc.bestellApp.controller;

import de.oc.bestellApp.database.dao.UserDAOImpl;
import de.oc.bestellApp.user.User;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class UserManager implements Serializable {


	private static final long serialVersionUID = 1520213630108557111L;
	private List<User> users;
	private UserDAOImpl userDAO;

	@PostConstruct
	public void init() {
		Logger.getLogger(UserManager.class).debug("Create UserManager");
		userDAO = new UserDAOImpl();
		users = userDAO.loadAll();
	}

	public List<User> getUsers() {
		users = userDAO.loadAll();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addUser(User user) {
		Logger.getLogger(UserManager.class).debug("Added User to userlist");
		UserDAOImpl udao = new UserDAOImpl();
		udao.persistUser(user);

	}
	
	
}
