/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 4, 2021
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Address;

/**
 * @author wuebk
 *
 */
public class AddressHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CityZipCodeJPA");
	
	public void insertAddress(Address a) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Address> showAllAddress(){
		EntityManager em = emfactory.createEntityManager();
		List<Address> allAddress = em.createQuery("SELECT a FROM Address a").getResultList();
		return allAddress;
	}
}
