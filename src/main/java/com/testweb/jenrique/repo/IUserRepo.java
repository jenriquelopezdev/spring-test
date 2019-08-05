package com.testweb.jenrique.repo;

import com.testweb.jenrique.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
    User findByName(String name);
}
