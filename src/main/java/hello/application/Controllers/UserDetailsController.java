package hello.application.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import POJOs.UserDetails;
import hello.application.service.IUserDetailsService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserDetailsController {

	/*
	 * public static List<UserDetails> userList=
	 * DataBaseForPOJOs.dataBaseForUserDetails();
	 * 
	 * @RequestMapping(value="/details",method = RequestMethod.GET) public
	 * List<UserDetails> userDetailsName(){ return userList; }
	 * 
	 * @RequestMapping(value="/saveDetails",method = RequestMethod.POST) public
	 * void saveUserDetails(@RequestBody UserDetails userDetails){ System.out.
	 * println("********************* User Details ************************");
	 * System.out.println("Id : "+userDetails.getId());
	 * System.out.println("User Name: "+userDetails.getName());
	 * System.out.println("City: "+userDetails.getCity());
	 * System.out.println("Company Name: "+userDetails.getCompany()); boolean
	 * response = UserDetailsCrud.searchUserName(userDetails.getName());
	 * if(response != true){ userList.add(userDetails); }
	 * System.out.println(response);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	@Autowired
	IUserDetailsService userDetailsService;

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public List<UserDetails> userDetailsName() {
		return userDetailsService.findAll();
	}

	@RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
	public void saveUserDetails(@RequestBody UserDetails userDetails) {
		System.out.println("********************* User Details Save************************");
		userDetailsService.save(userDetails);
	}
	
	@RequestMapping(value="/deleteDetails", method=RequestMethod.POST)
    public void deleteCompanyName(@RequestBody UserDetails userDetails){
		System.out.println("********************* User Details Delete************************");
		userDetailsService.delete(userDetails);
		
    }
	
	@RequestMapping(value="/findUser ", method=RequestMethod.GET)
    public List<UserDetails> findByCompanyName(@RequestParam String name){
		System.out.println("********************* User company name check ************************");
		List<UserDetails> users= userDetailsService.findByCompanyDetails_Name(name);
		return users;
    }
}
