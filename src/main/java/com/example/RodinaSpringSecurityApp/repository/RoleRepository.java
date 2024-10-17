package com.example.RodinaSpringSecurityApp.repository;

import com.example.RodinaSpringSecurityApp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
