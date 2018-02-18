/**
 * 
 */
package hello.application.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import POJOs.Roles;

/**
 * @author Mit
 *
 */
public interface RoleRepository extends JpaRepository<Roles, Long> {
	
	List<Roles> findByUser_Name(String name);

}
