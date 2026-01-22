package com.safestay.safe_stay_backend.dto;

import com.safestay.safe_stay_backend.model.enums.Role;

import java.time.OffsetDateTime;

public record UserResponseDTO(
        Long id,
        String email,
        String firstName,
        String lastName,
        Role role,
        OffsetDateTime createdAt
) {
}
