package com.proyecto_final_hlc.repositories;

import com.proyecto_final_hlc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
