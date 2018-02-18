/**
 * 
 */
package POJOs;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;

/**
 * @author Mit
 *
 */
@Entity
@Scope
public class User {
	
	public User() {}
	
	public User(User user) {
		super();
		this.id = user.getId();
		this.name = user.getName();
		this.password = user.getPassword();
		this.emailId = user.getEmailId();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	private String name;
	
	private String password;
	
	private String emailId;
	
	@OneToMany(mappedBy="user")
	private List<Roles> roles;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}

	/**
	 * @return the roles
	 */
	public List<Roles> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
}
