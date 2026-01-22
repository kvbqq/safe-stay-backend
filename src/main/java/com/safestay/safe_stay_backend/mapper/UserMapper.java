package com.safestay.safe_stay_backend.mapper;

import com.safestay.safe_stay_backend.dto.UserRegistrationDTO;
import com.safestay.safe_stay_backend.dto.UserResponseDTO;
import com.safestay.safe_stay_backend.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "role", ignore = true)
    User toEntity(UserRegistrationDTO dto);

    UserResponseDTO toResponseDto(User user);
}
