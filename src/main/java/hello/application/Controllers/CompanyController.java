 package hello.application.Controllers;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import POJOs.Company;
import POJOs.User;
import hello.application.service.ICompanyService;

@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyController {

  /*  private static List<Company> companyList = DataBaseForPOJOs.dataBaseForCompany();
    
    @RequestMapping(value="/details",method = RequestMethod.GET)
    public List<Company> companyNames(){
    	return companyList;
		}
    
    @RequestMapping(value="/saveDetails",method = RequestMethod.POST)
    public void saveCompanyName(@RequestBody Company company){
    	System.out.println("******************** Company Details **********************");
    	System.out.println("Company Name: "+company.getName());
    	System.out.println("Id: "+company.getId());
    	System.out.println("Domain : "+company.getDomain());
    	boolean response = CompanyCrud.searchCompanyName(company.getName());
    	System.out.println(response);
    	if(response != true){
			//companyList = DataBaseForPOJOs.dataBaseForCompany();
			companyList.add(company);
		}
    	}

    @RequestMapping(value="/deleteDetails", method=RequestMethod.POST)
    public void deleteCompanyName(@RequestBody Company company){
    	boolean response = CompanyCrud.searchCompanyName(company.getName());
    	if(response == true){
    		companyList.remove(company);
    		System.out.println(company.hashCode());
    	}
    }*/

	
	@Autowired
	ICompanyService companyService;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/details",method = RequestMethod.GET)
    public List<Company> companyNames(){
    	return companyService.findAll();
		}
	
	@RequestMapping(value="/saveDetails",method = RequestMethod.POST)
    public void saveCompanyName(@RequestBody Company company, @SessionAttribute("user") User user){
    	System.out.println("******************** Company Details Save **********************");
    	companyService.save(company);
	}
	
	 @RequestMapping(value="/deleteDetails", method=RequestMethod.POST)
	    public void deleteCompanyName(@RequestBody Company company){
		 System.out.println("******************** Company Details Delete **********************");
		 companyService.delete(company);
	    }
	 
	 @RequestMapping(value="/test", method=RequestMethod.POST)
	    public String test(@RequestBody User user, HttpSession session){
		 System.out.println("******************** Test controller **********************");
		 session.setAttribute("test", user);
		 return user.getName();
	    }
	 
	 @RequestMapping(value="/test2", method=RequestMethod.GET)
	    public String test2(@SessionAttribute(name = "test") User test2){
		 System.out.println("******************** Test2 controller **********************");
		 
		 return test2.getPassword();	
	    }
}
