package de.oc.bestellApp.user;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	private Long id;
	private String name;
	private String email;
	
	public User() {
		
	}
	
	public User(String Name, String Email) {
		this.name = Name;
		this.email = Email;
		setId(new Long(0)); // set unsaved-value
	}

	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
