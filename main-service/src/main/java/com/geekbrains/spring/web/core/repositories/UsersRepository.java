package com.geekbrains.spring.web.core.repositories;

import com.geekbrains.spring.web.core.entities.Product;
import com.geekbrains.spring.web.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
