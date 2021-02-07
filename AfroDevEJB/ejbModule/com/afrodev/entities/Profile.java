package com.afrodev.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Profile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfile;
	@Column(length = 20)
	private String statu;
	@Column(length = 30)
	private String company;
	@Column(length = 30)
	private String siteWeb;
	@Column(length = 30)
	private String adresse;
	private String langage;
	@Column(length = 30)
	private String gitUser;
	private String bio;
	@Column(length = 50)
	private String twitter;
	@Column(length = 50)
	private String facebook;
	@Column(length = 50)
	private String youtube;
	@Column(length = 50)
	private String linkedin;
	@Column(length = 50)
	private String instagram;
	
	
	@OneToOne
	private User user;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String statu, String company, String siteWeb, String adresse, String langage, String gitUser,
			String bio, String twitter, String facebook, String youtube, String linkedin, String instagram) {
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
	
}
