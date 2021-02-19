package com.jcg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	private static final EntityManagerFactory emFactoryObj;
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";	

	static {
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	// This Method Is Used To Retrieve The 'EntityManager' Object
	public static EntityManager getEntityManager() {
		return emFactoryObj.createEntityManager();
	}

	public static void main(String[] args) {

		EntityManager entityMgr = getEntityManager();
		entityMgr.getTransaction().begin();

		User user1 = new User("Ousseynou", "Diop", "Sindidi_job", "sindididiop@gmail.com", "12345", "Ma_photo");
		User user2 = new User("Moustapha", "Fall", "Fall_js", "falljs@gmail.com", "12345", "Ma_photo");
		User user3 = new User("Moustapha", "Sock", "Sock_linux", "socklinux@gmail.com", "12345", "Ma_photo");
		User user4 = new User("Khadim", "Séck", "séck_cos", "seckcos@gmail.com", "12345", "Ma_photo");
		User user5 = new User("Inssa", "Sarr", "Sarr_prince", "sarrprince@gmail.com", "12345", "Ma_photo");
		entityMgr.persist(user1);
		entityMgr.persist(user2);
		entityMgr.persist(user3);
		entityMgr.persist(user4);
		entityMgr.persist(user5);
		
		Profile profile1 = new Profile("Developer", "AfroDev", "www.afrodev.com", "Dakar", "Java, JavaScript, Python", "gitUser", "Je suis dev", "twitter", "facebook", "youtube", "linkedin", "instagram", user1);
		Profile profile2 = new Profile("Developer", "AfroDev", "www.afrodev.com", "Dakar", "Java, JavaScript, Python", "gitUser", "Je suis dev", "twitter", "facebook", "youtube", "linkedin", "instagram", user2);
		Profile profile3 = new Profile("Developer", "AfroDev", "www.afrodev.com", "Dakar", "Java, JavaScript, Python", "gitUser", "Je suis dev", "twitter", "facebook", "youtube", "linkedin", "instagram", user3);
		Profile profile4 = new Profile("Developer", "AfroDev", "www.afrodev.com", "Dakar", "Java, JavaScript, Python", "gitUser", "Je suis dev", "twitter", "facebook", "youtube", "linkedin", "instagram", user4);
		Profile profile5 = new Profile("Developer", "AfroDev", "www.afrodev.com", "Dakar", "Java, JavaScript, Python", "gitUser", "Je suis dev", "twitter", "facebook", "youtube", "linkedin", "instagram", user5);

		entityMgr.persist(profile1);
		entityMgr.persist(profile2);
		entityMgr.persist(profile3);
		entityMgr.persist(profile4);
		entityMgr.persist(profile5);
		entityMgr.getTransaction().commit();

		entityMgr.clear();
		System.out.println("Enregistrement Successfully Inserted In The Database");
	}
}