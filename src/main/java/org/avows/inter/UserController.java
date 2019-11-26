package org.avows.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.avows.inter.client.CurdClient;
import org.avows.inter.model.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController extends CurdClient{

	@GetMapping("/getAllUsers")
	public List<UserDto> getAllUsers() {
		UserDto[] userArray = getCurdClient().getForObject(reportsURL+"/core/getAllUsers", UserDto[].class);
		
		List<UserDto> userList = new ArrayList<>();
		if(userList!=null && userArray.length>0) {
			userList = Arrays.asList(userArray);
		}
		return userList;
	}
	
}
