package com.hibernate.project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.project.User;

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
User user = new User();
// Start transaction
session.beginTransaction();
// Perform operation
//*session.save(user);
//updating object
user.setUser_Fname("saba");


//delete
session.delete(user);

// Commit the transaction 
session.getTransaction().commit();
System.out.println(user);


} finally {
session.close();
factory.close();
}

}
}
