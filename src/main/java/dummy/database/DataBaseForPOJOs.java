/**
 * 
 */
package dummy.database;

import java.util.ArrayList;
import java.util.List;

import POJOs.Company;
import POJOs.UserDetails;

/**
 * @author Meet
 *
 */
public class DataBaseForPOJOs {
	
	public static List<Company> dataBaseForCompany(){
		
		List<Company> listCompany= new ArrayList<>();
		Company customer1 = new Company();
    	customer1.setId(836367);
    	customer1.setName("JLR");
    	customer1.setDomain("Automotive");
    	Company customer2 = new Company();
    	customer2.setId(234444);
    	customer2.setName("BMW");
    	customer2.setDomain("Oracle");
    	Company customer3 = new Company();
    	customer3.setId(453267);
    	customer3.setName("KPIT");
    	customer3.setDomain("Automotive");
    	Company customer4 = new Company();
    	customer4.setId(739847);
    	customer4.setName("Audi");
    	customer4.setDomain("Automation");
    	Company customer5 = new Company();
    	customer5.setId(836367);
    	customer5.setName("Posch");
    	customer5.setDomain("Automotive");
    	Company customer6 = new Company();
    	customer6.setId(234444);
    	customer6.setName("Bosch");
    	customer6.setDomain("Infotainment");
    	listCompany.add(customer1);
    	listCompany.add(customer2);
    	listCompany.add(customer3);
    	listCompany.add(customer4);
    	listCompany.add(customer5);
    	listCompany.add(customer6);
		return listCompany;
	}

		
		public static List<UserDetails> dataBaseForUserDetails(){
			
			List<UserDetails> listUsers= new ArrayList<>();
			UserDetails userDetails1 = new UserDetails();
			userDetails1.setCompany("KPIT");
			userDetails1.setId(2343);
			userDetails1.setCity("Ahmedabad");
			userDetails1.setName("Meet");
			UserDetails userDetails2 = new UserDetails();
			userDetails2.setCompany("BMW");
			userDetails2.setId(5343);
			userDetails2.setCity("Pune");
			userDetails2.setName("Trushank");
			UserDetails userDetails3 = new UserDetails();
			userDetails3.setCompany("Yantra");
			userDetails3.setId(7565);
			userDetails3.setCity("Banglore");
			userDetails3.setName("Ravi");
			UserDetails userDetails4 = new UserDetails();
			userDetails4.setCompany("JLR");
			userDetails4.setId(3343);
			userDetails4.setCity("Delhi");
			userDetails4.setName("Vinil");
			listUsers.add(userDetails1);
			listUsers.add(userDetails2);
			listUsers.add(userDetails3);
			listUsers.add(userDetails4);
			return listUsers;
}
}