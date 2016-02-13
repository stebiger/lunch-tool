package de.oc.bestellApp.register;

import de.oc.bestellApp.controller.UserManager;
import de.oc.bestellApp.user.User;
import org.apache.log4j.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by stefanbilleb on 14.11.15.
 */
@Named
@SessionScoped
public class RegisterController implements Serializable {

    private static final long serialVersionUID = 5609405267467345717L;
    @Inject
    private UserManager userManager;
    private User user;

    private Logger logger = Logger.getLogger(RegisterController.class);

    public RegisterController() {

    }

    public void init() {
        logger.debug("Created RegisterController");
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

    public String registerUser() {
        logger.debug("registerUser called"
                + "\n Name: " + user.getName()
                +"\nEmail: " + user.getEmail());


        userManager.addUser(user);
        logger.debug("registerUser end");
        return "benutzer.jsf";
    }
}
