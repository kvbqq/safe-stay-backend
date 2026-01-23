package com.safestay.safe_stay_backend.service;

import com.safestay.safe_stay_backend.dto.UserRegistrationDTO;
import com.safestay.safe_stay_backend.dto.UserResponseDTO;
import com.safestay.safe_stay_backend.mapper.UserMapper;
import com.safestay.safe_stay_backend.model.User;
import com.safestay.safe_stay_backend.model.enums.Role;
import com.safestay.safe_stay_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDTO registerUser(UserRegistrationDTO registrationDTO) {
        if (userRepository.existsByEmail(registrationDTO.email())) {
            throw new RuntimeException("Email address is already in use");
        }
        User user = userMapper.toEntity(registrationDTO);
        user.setPassword(passwordEncoder.encode(registrationDTO.password()));
        user.setRole(Role.USER);
        return userMapper.toResponseDto(userRepository.save(user));
    }
}
