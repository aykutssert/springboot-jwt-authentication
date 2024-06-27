package com.SpringBoot.messagingapp;

import org.springframework.stereotype.Service;

@Service
public interface JwtService {
    public String extractUserEmail(String jwt);

}
