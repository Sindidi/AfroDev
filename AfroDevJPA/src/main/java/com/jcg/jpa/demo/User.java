package com.jcg.jpa.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdUser")
	private Long id;
	@Column(length = 30)
	private String prenom;
	@Column(length = 30)
	private String nom;
	@Column(length = 20)
	private String username;
	@Column(length = 50)
	private String email;
	@Column(length = 255)
	private String password;
	private String avatar;
	
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	 private List <Profile> profile = new ArrayList<Profile>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String prenom, String nom, String username, String email, String password, String avatar) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.username = username;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public List<Profile> getProfile() {
		return profile;
	}
	public void setProfile(List<Profile> profile) {
		this.profile = profile;
	}
	
}
