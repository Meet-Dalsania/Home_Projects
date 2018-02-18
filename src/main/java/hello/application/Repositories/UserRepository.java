/**
 * 
 */
package hello.application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import POJOs.User;

/**
 * @author Mit
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String userName);

}
