package com.jcg.jpa.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Profile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfile;
	private String statu;
	private String company;
	private String siteWeb;
	private String adresse;
	private String langage;
	private String gitUser;
	private String bio;
	private String twitter;
	private String facebook;
	private String youtube;
	private String linkedin;
	private String instagram;
		
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Profile(String statu, String company, String siteWeb, String adresse, String langage, String gitUser,
			String bio, String twitter, String facebook, String youtube, String linkedin, String instagram, User user) {
		super();
		this.statu = statu;
		this.company = company;
		this.siteWeb = siteWeb;
		this.adresse = adresse;
		this.langage = langage;
		this.gitUser = gitUser;
		this.bio = bio;
		this.twitter = twitter;
		this.facebook = facebook;
		this.youtube = youtube;
		this.linkedin = linkedin;
		this.instagram = instagram;
		this.user = user;
	}



	public Long getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	public String getGitUser() {
		return gitUser;
	}
	public void setGitUser(String gitUser) {
		this.gitUser = gitUser;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
