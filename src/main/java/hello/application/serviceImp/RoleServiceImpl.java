/**
 * 
 */
package hello.application.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import POJOs.Roles;
import hello.application.Repositories.RoleRepository;
import hello.application.service.IRoleService;

/**
 * @author Mit
 *
 */
@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Roles> findByUserName(String name) {
		return roleRepository.findByUser_Name(name);
	}
	
}
