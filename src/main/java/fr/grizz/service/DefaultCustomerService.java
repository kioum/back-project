package fr.grizz.service;

import java.util.Optional;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.grizz.model.UserCompte;
import fr.grizz.persistence.UserCompteDAO;

@Service("customerService")
public class DefaultCustomerService implements UserCompteService {

    @Autowired
    UserCompteDAO userCompteDAO;
    
    Logger logger = LogManager.getLogger(DefaultCustomerService.class);

    @Override
    public UserCompte login(String username, String password) {
        Optional<UserCompte> userOpt = userCompteDAO.login(username);
        if(userOpt.isPresent()){
            String token = UUID.randomUUID().toString();
            UserCompte user = userOpt.get();
            
        	if(!new BCryptPasswordEncoder().matches(user.getPassword(), password)) {
        		return null;
        	}

            user.setToken(token);
            userCompteDAO.save(user);
            return user;
        }

        return null;
    }

    @Override
    public Optional<User> findByToken(String token) {
        Optional<UserCompte> customer= userCompteDAO.findByToken(token);
        if(customer.isPresent()){
        	UserCompte customer1 = customer.get();
            User user= new User(customer1.getUserName(), customer1.getPassword(), true, true, true, true,
                    AuthorityUtils.createAuthorityList("USER"));
            return Optional.of(user);
        }
        return  Optional.empty();
    }

    @Override
    public UserCompte findById(Long id) {
        Optional<UserCompte> customer= userCompteDAO.findById(id);
        return customer.orElse(null);
    }
}
