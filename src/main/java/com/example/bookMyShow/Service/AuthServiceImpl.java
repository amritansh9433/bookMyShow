package com.example.bookMyShow.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.bookMyShow.Entity.Role;
import com.example.bookMyShow.Entity.User;
import com.example.bookMyShow.Repository.RoleRepository;
import com.example.bookMyShow.Repository.UserRepository;
import com.example.bookMyShow.payload.LoginDto;
import com.example.bookMyShow.payload.RegisterDto;

@Service
public class AuthServiceImpl implements AuthService{

    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public AuthServiceImpl(AuthenticationManager authenticationManager,
                           UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public String login(LoginDto loginDto) {
        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsernameOrEmail(), loginDto.getPassword()));
        
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "user logged-in successfully";
    }

    @Override
    public String register(RegisterDto registerDto) {
                
                User user = new User();
                user.setName(registerDto.getName());
                user.setUsername(registerDto.getUsername());
                user.setEmail(registerDto.getEmail());
                user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        
                Set<Role> roles = new HashSet<>();
                Role userRole = roleRepository.findByName("ROLE_USER").get();
                roles.add(userRole);
                user.setRoles(roles);
        
                userRepository.save(user);
        
                return "User registered successfully!.";
    }

    
    
}
