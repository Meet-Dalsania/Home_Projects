/**
 * 
 */
package hello.application.service;

import POJOs.User;

/**
 * @author Mit
 *
 */
public interface ILoginService {
	
	User findByName(String name);

}
