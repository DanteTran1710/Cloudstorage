package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mapper.UserMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;

@Service
public class AuthenticationService implements AuthenticationProvider {
    private UserMapper userMapper;
    private EncryptionService encryptionService;

    public AuthenticationService(UserMapper userMapper, EncryptionService encryptionService) {
        this.userMapper = userMapper;
        this.encryptionService = encryptionService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        User user = userMapper.getUser(username);
        if (user != null) {
            String encodedKey = user.getEncodedkey();
            String encryptedPassword = encryptionService.encryptValue(password, encodedKey);
            String decryptedPassword = encryptionService.decryptValue(encryptedPassword, encodedKey);
            if (encryptionService.decryptValue(user.getPassword(),encodedKey).equals(decryptedPassword)) {
                return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
            }
        }
        return null;
    }

    public Authentication authenticate(User user) throws AuthenticationException {
            String encodedKey = user.getEncodedkey();
            User userAuthenticated = userMapper.getUser(user.getUsername());
            String encryptedPassword = encryptionService.encryptValue(user.getPassword(), encodedKey);
            String decryptedPassword = encryptionService.decryptValue(encryptedPassword, encodedKey);
            return new UsernamePasswordAuthenticationToken(userAuthenticated.getUsername(), user.getPassword(), new ArrayList<>());
    }



    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
