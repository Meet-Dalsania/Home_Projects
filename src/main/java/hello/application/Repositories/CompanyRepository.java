/**
 * 
 */
package hello.application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import POJOs.Company;

/**
 * @author Mit
 *
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	public boolean findByIdAndName(Long id, String name);

}
