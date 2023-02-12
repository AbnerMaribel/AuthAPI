package com.bank.authorization.AuthAPI.controller;

import com.bank.authorization.AuthAPI.entity.Auth;
import com.bank.authorization.AuthAPI.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/authorization")
public class AuthController {

    private AuthService authService;


    @PostMapping
    public ResponseEntity<Auth> createAuth(@RequestBody Auth auth) {
        Auth savedAuth = authService.createAuth(auth);
        return new ResponseEntity<>(savedAuth, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Auth> getUserById(@PathVariable("id") Long id) {
        Auth auth = authService.getUserById(id);
        return new ResponseEntity<>(auth, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Auth>> getAllRoles() {
        List<Auth> roles = authService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Auth> updateAuth(@PathVariable("id") Long id, @RequestBody Auth auth) {
        auth.setProfile_id(id);
        Auth updatedAuth = authService.updateAuth(auth);
        return new ResponseEntity<>(updatedAuth, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAuth(@PathVariable("id") Long id) {
        authService.deleteAuth(id);
        return new ResponseEntity<>("Auth deleted!", HttpStatus.OK);
    }
}
