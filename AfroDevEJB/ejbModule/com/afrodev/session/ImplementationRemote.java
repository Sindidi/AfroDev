package com.afrodev.session;

import javax.ejb.Remote;

import com.afrodev.entities.Post;
import com.afrodev.entities.Profile;
import com.afrodev.entities.User;

@Remote
public interface ImplementationRemote {
	public void  addUser(User u);
	public void  addProfile(Profile p);
	public void addPost(Post pt);

}
