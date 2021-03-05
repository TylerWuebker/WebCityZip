/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 4, 2021
 */
package model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author wuebk
 *
 */

@Entity
@Table(name="details")
public class ListDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LIST_ID")
	private int id;
	@Column(name="LIST_NAME")
	private String listName;
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private CityZip cityZip;

	private List<Address> listOfAddress;
	
	public ListDetails() {
		super();
	}
	
	public ListDetails(int id, String listName, CityZip cityZip, List<Address> listOfAddress) {
		this.id = id;
		this.listName = listName;
		this.cityZip = cityZip;
		this.listOfAddress = listOfAddress;
	}
	
	public ListDetails(String listName, CityZip cityZip, List<Address> listOfAddress) {
		this.listName = listName;
		this.cityZip = cityZip;
		this.listOfAddress = listOfAddress;
	}
	
	public ListDetails(String listName) {
		this.listName = listName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public CityZip getCityZip() {
		return cityZip;
	}
	public void setCityZip(CityZip cityZip) {
		this.cityZip = cityZip;
	}
	public List<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
}
