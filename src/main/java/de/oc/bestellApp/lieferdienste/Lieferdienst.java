package de.oc.bestellApp.lieferdienste;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("lieferdienst")
@SessionScoped
public class Lieferdienst implements Serializable {

	private int id;
	private String name;
	private String website;
	
	public Lieferdienst() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
}
