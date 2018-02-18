/**
 * 
 */
package hello.application.service;

import java.util.List;

import POJOs.Roles;

/**
 * @author Mit
 *
 */
public interface IRoleService {
	
	List<Roles> findByUserName(String name);

}
