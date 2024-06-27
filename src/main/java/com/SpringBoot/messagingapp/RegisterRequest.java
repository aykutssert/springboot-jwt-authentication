package com.SpringBoot.messagingapp;

import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String first_name;
    private String last_name;
    private String email;
    private String password;
}
