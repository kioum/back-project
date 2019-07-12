package fr.grizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.grizz.model.UserCompte;
import fr.grizz.service.UserCompteService;

@RestController
public class TokenController {

    @Autowired
    private UserCompteService userService;

    @PostMapping("/token")
    public ResponseEntity<UserCompte> getToken(@RequestParam("username") final String username, @RequestParam("password") final String password){
       UserCompte user = userService.login(username, password);
       
       if(StringUtils.isEmpty(user)){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
