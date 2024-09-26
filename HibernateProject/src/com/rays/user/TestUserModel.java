package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) {
		 //testadd();
//		testupdate();
//		testdelete();
//		testauthenticate();
		testsearch();
	}

	private static void testsearch() {

		UserDTO dto = new UserDTO();
		
		UserModel model = new UserModel();
		
		List list = model.search(dto, 1, 5);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			dto = (UserDTO)it.next();
			
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}
	}

	private static void testauthenticate() {

		UserModel model = new UserModel();
		UserDTO dto = model.authenticate("Prachi@gmail.com", "1234");
		
		if(dto != null ) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}else {
			System.out.println("Authentication Failed ........!!!");
		}
	}

	private static void testdelete() {

		UserDTO dto = new UserDTO();
		
		dto.setId(3);
		
		UserModel model = new UserModel();
		model.delete(dto);
	}

	private static void testupdate() {

		UserDTO dto = new UserDTO() ;
		 
		dto.setId(3);
		dto.setFirstName("Sagar");
		dto.setLastName("Patel");
		dto.setLoginId("Sagar@gmail.com");
		dto.setPassword("9768");
		dto.setDob(new Date());
		dto.setAddress("Delhi");
		
		UserModel model = new UserModel();
		model.update(dto);
		
	}
	

	private static void testadd() {
		
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName("Sonali");
		dto.setLastName("Patel");
	    dto.setLoginId("Sonali@gmail.com");
	    dto.setPassword("12345");
	    dto.setDob(new Date());
	    dto.setAddress("Pune");

	    UserModel model = new UserModel();
	    model.add(dto);
	    
	}
}
