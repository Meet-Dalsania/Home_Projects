package hello.application.service;

import java.util.List;

import POJOs.UserDetails;

public interface IUserDetailsService {
	
	List<UserDetails> findAll();
	
	void save(UserDetails company);
	
	void delete(UserDetails company);
	
	List<UserDetails> findByCompanyDetails_Name(String company);
	
}
