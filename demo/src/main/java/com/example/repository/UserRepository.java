package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.*;
import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}