package POJOs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserDetails {
	
	
	@Id
	public int id;
	
	public String name;
	
	public String company;
	
	public String city;
	
	@ManyToOne
	@JoinColumn(name="company_details")
	private Company companyDetails;
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the companyDetails
	 */
	public Company getCompanyDetails() {
		return companyDetails;
	}

	/**
	 * @param companyDetails the companyDetails to set
	 */
	public void setCompanyDetails(Company companyDetails) {
		this.companyDetails = companyDetails;
	}
	

}
