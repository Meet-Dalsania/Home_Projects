/**
 * 
 */
package repository.crud;

import java.util.List;

import POJOs.Company;
import dummy.database.DataBaseForPOJOs;

/**
 * @author Meet
 *
 */
public class CompanyCrud {
	
	public static boolean response;

	public static boolean searchCompanyName(String companyName) {

		List<Company> listComapany = DataBaseForPOJOs.dataBaseForCompany();
		if (listComapany != null) {
			for (Company company : listComapany) {
				if (company.getName().equals(companyName)) {
					response = true;

				}
			}
		} else {
			response = false;
		}
		return response;
	}

	



}
