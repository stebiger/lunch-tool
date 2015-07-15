package de.oc.bestellApp.registrierung;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import de.oc.bestellApp.controller.UserManager;
import de.oc.bestellApp.user.User;

@ManagedBean
@ViewScoped
public class RegisterUserBean {

	private User user;
	
	Logger logger = Logger.getLogger(RegisterUserBean.class);
	
	public RegisterUserBean() {
		logger.debug("Created RegisterUserBean");
		user = new User();
		if(user != null)
		logger.debug("Name: " + user.getName()
				+"\nEmail: " + user.getEmail());

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void registerUser() {
		logger.debug("registerUser called"
				+ "\n Name: " + user.getName()
				+"\nEmail: " + user.getEmail());
		
		UserManager um = new UserManager();
			um.addUser(user);
		logger.debug("registerUser end");
	}
	
	
}
