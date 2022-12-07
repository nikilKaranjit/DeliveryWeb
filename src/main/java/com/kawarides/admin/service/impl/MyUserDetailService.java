package com.kawarides.admin.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.User;
import com.kawarides.admin.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
		{
		User user =userRepository.findUserByName(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("This"+username+"found");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),getGrantedAuthority(user));
		}
 
			private Collection<GrantedAuthority> getGrantedAuthority(User user)
			{
			Collection<GrantedAuthority> grantedAuthorities= new ArrayList<>();
			if(user.getRole().getRoleType().equals("admin"))
			{
				grantedAuthorities.add( new SimpleGrantedAuthority("ROLE_ADMIN"));
			}
				grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			return grantedAuthorities;
			}

	

}
