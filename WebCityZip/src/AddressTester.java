
import java.util.List;

import controller.AddressHelper;
import model.Address;

/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 4, 2021
 */

/**
 * @author wuebk
 *
 */
public class AddressTester {
	public static void main(String[] args) {
		Address a1 = new Address("123 Free Ave.", "");
		AddressHelper ah = new AddressHelper();
		ah.insertAddress(a1);
		
		List<Address> allAddress = ah.showAllAddress();
		for(Address a: allAddress) {
			System.out.println(a.toString());
		}
	}
}
