package com.safestay.safe_stay_backend.dto;

public record UserRegistrationDTO(
        String email,
        String password,
        String firstName,
        String lastName
) {
}
