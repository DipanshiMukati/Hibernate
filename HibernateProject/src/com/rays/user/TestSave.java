package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSave {

	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName("Bharti");
		dto.setLastName("Patel");
		dto.setLoginId("Bharti@gmail.com");
		dto.setPassword("134");
		dto.setDob(new Date());
		dto.setAddress("Delhi");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(dto);
		
		tx.commit();
		session.close();
	}
}
