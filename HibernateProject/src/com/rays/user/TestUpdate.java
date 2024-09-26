package com.rays.user;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestUpdate {

	public static void main(String[] args) {
		UserDTO dto = new UserDTO();
		
		dto.setId(2);
		dto.setFirstName("Dipanshi");
		dto.setLastName("Mukati");
		dto.setLoginId("Dipanshi@gmail.com");
		dto.setPassword("9876");
		dto.setDob(new Date());
		dto.setAddress("Mumbai");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();
		
	}
}
