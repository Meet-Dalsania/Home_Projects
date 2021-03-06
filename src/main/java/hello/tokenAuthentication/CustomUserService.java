/**
 * 
 */
package hello.tokenAuthentication;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import POJOs.User;
import hello.application.Repositories.RoleRepository;
import hello.application.Repositories.UserRepository;

/**
 * @author Mit
 *
 */
@Service
public class CustomUserService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	public CustomUserService(UserRepository userRepository,RoleRepository roleRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
			User user = userRepository.findByName(userName);
			if(null == user) {
				throw new UsernameNotFoundException("User is not found!!");
			}
			else {
					return new CustomUserDetails(user);
			}
	}

}
