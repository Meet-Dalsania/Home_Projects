/**
 * 
 */
package hello.application.service;

import java.util.List;

import POJOs.Company;

/**
 * @author Meet
 *
 */
public interface ICompanyService {
	
	List<Company> findAll();
	
	void save(Company company);
	
	void delete(Company company);
	
	boolean findByIdAndName(Long id, String name);

}
