package com.safestay.safe_stay_backend.service;

import com.safestay.safe_stay_backend.dto.UserRegistrationDTO;
import com.safestay.safe_stay_backend.dto.UserResponseDTO;
import com.safestay.safe_stay_backend.mapper.UserMapper;
import com.safestay.safe_stay_backend.model.User;
import com.safestay.safe_stay_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDTO registerUser(UserRegistrationDTO registrationDTO) {
        User user = userMapper.toEntity(registrationDTO);
        return userMapper.toResponseDto(userRepository.save(user));
    }
}
