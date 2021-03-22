package com.example.gatewayservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    DiscoveryClient discoveryClient;

    //private ArrayList<Utilisateur> Utilisateurs;

    public WebSecurityConfig() {
        Utilisateur user1 = new Utilisateur("maryse","tresor","USER");
        Utilisateur user2 = new Utilisateur("mike","bita","USER");
        //this.Utilisateurs.add(user1);
        //this.Utilisateurs.add(user2);
    }
    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        Utilisateur user3 = new Utilisateur("koko","kanty","USER");
        UserDetails user = User.withDefaultPasswordEncoder().username(user3.getUsername()).password(user3.getPassword()).roles(user3.getRole()).build();
        return new InMemoryUserDetailsManager(user);
    }
}