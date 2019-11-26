package org.avows.inter.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.avows.inter.client.CurdClient;
import org.avows.inter.model.AccountDto;
import org.avows.inter.model.UserBalance;
import org.avows.inter.model.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController extends CurdClient{

	@GetMapping("/getAllUsers")
	public List<UserBalance> getAllUsers() {
		UserDto[] userArray = getCurdClient().getForObject(reportsURL+"/core/getAllUsers", UserDto[].class);
		
		List<UserDto> userList = new ArrayList<>();
		
		List<UserBalance> userBalanceList = new ArrayList<>();
		
		ModelMapper mapper = new ModelMapper();
		
		if(userList!=null && userArray.length>0) {
			userList = Arrays.asList(userArray);
			
			for(UserDto user : userList) {
				
				Set<AccountDto> accounts = user.getAccounts();
				
				UserBalance userBalance = mapper.map(user, UserBalance.class);
				
				if(accounts!=null) {
					
					BigDecimal balance = BigDecimal.ZERO;
					
					
					for(AccountDto account : accounts) {
						balance = balance.add(account.getBalance());
					}
					userBalance.setBalance(balance);
					
				}
				
				userBalanceList.add(userBalance);
			}
		}
		return userBalanceList;
	}
	
}
