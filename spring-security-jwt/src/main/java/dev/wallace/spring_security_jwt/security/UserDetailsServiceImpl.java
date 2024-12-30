package dev.wallace.spring_security_jwt.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import dev.wallace.spring_security_jwt.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

    private UserRepository userRepository;
    
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       return userRepository.findByusername(username)
               .map(UserAuthenticated::new)
               .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
