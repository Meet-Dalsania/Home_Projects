/**
 * 
 */
package hello.application.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import POJOs.UserDetails;

/**
 * @author Mit
 *
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{
	
	List<UserDetails> findByCompanyDetails_Name(String name);

}
