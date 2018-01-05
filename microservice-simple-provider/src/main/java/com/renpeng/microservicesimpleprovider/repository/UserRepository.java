package com.renpeng.microservicesimpleprovider.repository;

import com.renpeng.microservicesimpleprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
