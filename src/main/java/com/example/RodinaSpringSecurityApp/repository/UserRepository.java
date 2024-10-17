package com.example.RodinaSpringSecurityApp.repository;

import com.example.RodinaSpringSecurityApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Query(value = "SELECT nextval(pg_get_serial_sequence('t_user', 'id'))", nativeQuery = true)
    Long getNextId();
}
