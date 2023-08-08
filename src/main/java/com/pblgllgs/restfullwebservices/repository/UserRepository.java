package com.pblgllgs.restfullwebservices.repository;

import com.pblgllgs.restfullwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
