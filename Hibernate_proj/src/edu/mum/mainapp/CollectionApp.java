package edu.mum.mainapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.mum.dto.Address;
import edu.mum.dto.DoctorDetails;

public class CollectionApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		DoctorDetails doctor = new DoctorDetails();
		
		Address brooklynAddress = new Address();
		brooklynAddress.setStreet("100 N 45 W");
		brooklynAddress.setCity("Jackson");
		brooklynAddress.setState("NY");
		brooklynAddress.setZipcode(12345);
		
		Address queensAddress = new Address();
		queensAddress.setStreet("124 R 45 Hou");
		queensAddress.setCity("Queens");
		queensAddress.setState("NY");
		queensAddress.setZipcode(12345);
		
		doctor.setDoctorName("Jonatho Rasel");
		doctor.setSpeciality("Medicine");
		doctor.getChamberAddresses().add(brooklynAddress);
		doctor.getChamberAddresses().add(queensAddress);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(doctor);
		session.getTransaction().commit();
		session.close();
		

	}

}
