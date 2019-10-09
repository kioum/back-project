package fr.grizz.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;

import fr.grizz.DTOdb.UserCompte;

public interface UserCompteService {

    UserCompte login(String username, String password);
    Optional<User> findByToken(String token);
    UserCompte findById(Long id);
    
}
