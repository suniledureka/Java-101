package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Product;
import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();				
		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product product = new Product();
		product.setProductId(88547);
		product.setProductName("Mobile Phone");
		product.setProductPrice(68900f);
		
		session.save(product);
		System.out.println("-------------------------------------------------------------------");
		
		tx.commit();
		System.out.println("Product Details are saved to Stock");
		session.close();
		sfactory.close();
	}

}
