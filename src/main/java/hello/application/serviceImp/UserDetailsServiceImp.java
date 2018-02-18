/**
 * 
 */
package hello.application.serviceImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import POJOs.UserDetails;
import hello.application.Repositories.UserDetailsRepository;
import hello.application.service.IUserDetailsService;

/**
 * @author Meet
 *
 */
@Service
@Transactional
public class UserDetailsServiceImp implements IUserDetailsService{
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Override
	public List<UserDetails> findAll() {
		return userDetailsRepository.findAll();
	}

	@Override
	public void save(UserDetails userDetails) {
			userDetailsRepository.save(userDetails);
	}

	@Override
	public void delete(UserDetails userDetails) {
		userDetailsRepository.delete(userDetails);
	}

	@Override
	public List<UserDetails> findByCompanyDetails_Name(String name) {
		return userDetailsRepository.findByCompanyDetails_Name(name);
	}
	
	
	
}
