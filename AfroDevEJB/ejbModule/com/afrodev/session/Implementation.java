package com.afrodev.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.afrodev.entities.Post;
import com.afrodev.entities.Profile;
import com.afrodev.entities.User;

/**
 * Session Bean implementation class Implementation
 */
@Stateless
public class Implementation implements ImplementationRemote, ImplementationLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em;
	
    public Implementation() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void  addUser(User u) {
		em.persist(u);
	}

	@Override
	public void addProfile(Profile p) {
		em.persist(p);
		
	}

	@Override
	public void addPost(Post pt) {
		em.persist(pt);
		
	}
    

}
