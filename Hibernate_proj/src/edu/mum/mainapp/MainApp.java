package edu.mum.mainapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.mum.dto.Address;
import edu.mum.dto.UserDetails;

public class MainApp {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
<<<<<<< HEAD
		UserDetails user2 = new UserDetails();
		
		Address homeAddress = new Address();
		homeAddress.setStreet("13 N 16th St");
		homeAddress.setCity("Brooklyn");
		homeAddress.setState("NY");
		homeAddress.setZipcode(11214);
		
		Address officeAddress = new Address();
		officeAddress.setStreet("Luren st");
		officeAddress.setCity("Middletown");
		officeAddress.setState("NJ");
		officeAddress.setZipcode(07701);
		
		user.setUserName("First User");
		user.setHomeAddress(homeAddress);
		user.setOfficeAddress(officeAddress);
		user.setJoinedDate(new Date());
		user.setDescription("New employee");
		user.setCitizenship(true);
		
		user2.setUserName("second User");
		user2.setJoinedDate(new Date());
		user2.setDescription("old employee");
		user2.setCitizenship(true);
=======
		user.setUserId(2);
		user.setUserName("second userr");
>>>>>>> refs/remotes/origin/master
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		session = sessionFactory.openSession();
		user = (UserDetails) session.get(UserDetails.class,1);
		System.out.println("User Name: "+user.getUserName());
	}

}
