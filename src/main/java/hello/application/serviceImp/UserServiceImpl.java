/**
 * 
 */
package hello.application.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import POJOs.User;
import hello.application.Repositories.UserRepository;
import hello.application.service.ILoginService;

/**
 * @author Mit
 *
 */
@Service
public class UserServiceImpl implements ILoginService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

}
