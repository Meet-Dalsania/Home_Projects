/**
 * 
 */
package hello.application.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import POJOs.Roles;
import POJOs.User;
import hello.application.service.ILoginService;
import hello.application.service.IRoleService;

/**
 * @author Mit
 *
 */
@CrossOrigin
@RestController
public class UserController {

	@Autowired
	ILoginService userLoginService;
	
	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Boolean> getUserLogin(@RequestBody User loginUser) {
		System.out.println("******************** User Login **********************");
		User user = userLoginService.findByName(loginUser.getName());
		if (null == user) {
			return new ResponseEntity<Boolean>(false, HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Boolean getTest(@RequestBody User loginUser) {
		System.out.println("******************** Test Login **********************");
		List<Roles> response= roleService.findByUserName(loginUser.getName());
		if (response.isEmpty()) {
			return false;
		}
		return true;
		
	}

}
