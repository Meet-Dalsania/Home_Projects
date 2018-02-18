/**
 * 
 */
package hello.application.serviceImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import POJOs.Company;
import hello.application.Repositories.CompanyRepository;
import hello.application.service.ICompanyService;

/**
 * @author Meet
 *
 */
@Service
@Transactional
public class CompanyServiceImp implements ICompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

	@Override
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	@Override
	public void save(Company company) {
		companyRepository.save(company);
	}

	@Override
	public void delete(Company company) {
		companyRepository.delete(company);
	}

	@Override
	public boolean findByIdAndName(Long id, String name) {
		return companyRepository.findByIdAndName(id, name);
	}
	
	
	
	
	
}
