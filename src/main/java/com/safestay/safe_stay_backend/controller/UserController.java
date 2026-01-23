package com.safestay.safe_stay_backend.controller;

import com.safestay.safe_stay_backend.dto.UserRegistrationDTO;
import com.safestay.safe_stay_backend.dto.UserResponseDTO;
import com.safestay.safe_stay_backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public UserResponseDTO registerUser(@Valid @RequestBody UserRegistrationDTO registrationDTO) {
        return userService.registerUser(registrationDTO);
    }
}
