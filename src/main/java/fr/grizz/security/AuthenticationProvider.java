package fr.grizz.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import fr.grizz.service.UserCompteService;

@Component
public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	@Autowired
	UserCompteService customerService;

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {
		//
	}

	@Override
	protected UserDetails retrieveUser(String userName, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

		Object token= usernamePasswordAuthenticationToken.getCredentials();
		return Optional
				.ofNullable(token)
				.map(String::valueOf)
				.flatMap(customerService::findByToken)
				.orElseThrow(() -> new UsernameNotFoundException("Cannot find user with authentication token=" + token));
	}
}
