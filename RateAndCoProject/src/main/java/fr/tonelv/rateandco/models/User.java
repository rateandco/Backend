package fr.tonelv.rateandco.models;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userModel") // donne le nom pour faire lien avec JSF
@SessionScoped
public class User {

	private Integer Id;
	private String firstName;
	private String lastName;
	private String username;
	private String hash;
	private String message;
//	private boolean isActive;
//	private String role;

	public User() {
	}

	public User(Integer id, String firstName, String lastName, String username, String hash) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.hash = hash;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct // méthode init OK au démarrage
	private void init() {
		message = "Welcome from Rate And Co !!";
	}
	
	public String valider() {
		System.out.println("Votre formulaire a été envoyé");
		return "inscriptionOk.xhtml";
	}

}
