/**
 * 
 */
package repository.crud;

import java.util.List;

import POJOs.UserDetails;
import dummy.database.DataBaseForPOJOs;

/**
 * @author Meet
 *
 */
public class UserDetailsCrud {
	
	public static boolean response;
	
	public static boolean searchUserName(String userName){
	List<UserDetails> listUser = DataBaseForPOJOs.dataBaseForUserDetails();
	if ( listUser != null) {
		for (UserDetails user : listUser) {
			if (user.getName().equals(userName)) {
				response = true;

			}
		}
	} else {
		response = false;
	}
	return response;
}

}
