package fr.grizz.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.grizz.model.UserCompte;

@Repository
public interface UserCompteDAO extends CrudRepository<UserCompte, Long> {

    @Query(value = "SELECT u FROM UserCompte u where u.userName = ?1")
    Optional<UserCompte> login(String username);

    Optional<UserCompte> findByToken(String token);
}
