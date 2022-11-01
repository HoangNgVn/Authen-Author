//package com.example.authentication.config;
//
//import com.example.authentication.entity.User;
//import com.example.authentication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class demoUserDetail implements UserDetailsService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        List<User> user = userRepository.findByUserName(username);
//        if(user.size() == 0) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        String userName = user.get(0).getUsername();
//        String password = user.get(0).getPassword();
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(user.get(0).getRole()));
//        return new org.springframework.security.core.userdetails.User(userName, password, authorities);
//    }
//}
