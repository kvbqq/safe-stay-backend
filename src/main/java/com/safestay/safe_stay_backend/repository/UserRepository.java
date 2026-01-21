package com.safestay.safe_stay_backend.repository;

import com.safestay.safe_stay_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
