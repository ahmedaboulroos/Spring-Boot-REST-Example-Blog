package io.amin.blog.configs.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.amin.blog.models.Role;
import io.amin.blog.models.User;
import io.amin.blog.repositories.RoleRepository;
import io.amin.blog.repositories.UserRepository;

@Service
public class DBInitializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");

        Role dbAdminRole = roleRepository.save(adminRole);
        Role dbUserRole = roleRepository.save(userRole);

        User admin = new User("admin", passwordEncoder.encode("admin"));
        admin.getRoles().add(dbAdminRole);

        User user = new User("user", passwordEncoder.encode("user"));
        user.getRoles().add(dbUserRole);
        
        userRepository.save(admin);
        userRepository.save(user);
    }
    
}