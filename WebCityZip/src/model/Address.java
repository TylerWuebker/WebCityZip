/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 4, 2021
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wuebk
 *
 */
@Entity
@Table(name="addresses")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	
	public Address() {
		super();
	}
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	public Address(int id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street+"]";
	}
	
	

}
