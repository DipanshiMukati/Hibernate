package com.rays.user;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestDelete {

	public static void main(String[] args) {
		UserDTO dto = new UserDTO();
		
		dto.setId(3);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
		
	}
}
