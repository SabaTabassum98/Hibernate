package com.hibernate.project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hirbenate.project.User;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

org.hibernate.Session session = factory.getCurrentSession();

try {
// Create object of entity class type
User user = new User( 3, "Mahima","Shah","sshah@tns.org");
// Start transaction
session.beginTransaction();
// Perform operation
session.save(user);


// Commit the transaction 
session.getTransaction().commit();
System.out.println("Row Added");


} finally {
session.close();
factory.close();
}

}
}
