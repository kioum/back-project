package fr.grizz.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.grizz.DTOdb.UserCompte;

@Repository
public interface UserCompteDAO extends CrudRepository<UserCompte, Long> {
    Optional<UserCompte> findByUserName(String username);
    Optional<UserCompte> findByToken(String token);
}
