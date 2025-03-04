package com.example.securingweb;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String userPassword = encoder.encode("123");
        String adminPassword = encoder.encode("1234");

        System.out.println("Encoded user password: " + userPassword);
        System.out.println("Encoded admin password: " + adminPassword);
    }
}