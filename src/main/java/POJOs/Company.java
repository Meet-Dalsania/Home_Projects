package POJOs;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

 private String name;
 @Id
 private long id;
 
 private String domain;
 
 @OneToMany(mappedBy="companyDetails")
 private List<UserDetails> userDetails;
 

/**
 * @return the domain
 */
public String getDomain() {
	return domain;
}

/**
 * @param domain the domain to set
 */
public void setDomain(String domain) {
	this.domain = domain;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the id
 */
public long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}

/*public List<UserDetails> getUserDetails() {
	return userDetails;
}

public void setUserDetails(List<UserDetails> userDetails) {
	this.userDetails = userDetails;
}*/




 
}
