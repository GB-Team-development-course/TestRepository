package com.geekbrains.spring.web.core.services;

import com.geekbrains.spring.web.core.entities.Product;
import com.geekbrains.spring.web.core.entities.User;
import com.geekbrains.spring.web.core.repositories.ProductsRepository;
import com.geekbrains.spring.web.core.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Optional<User> findById(Long id) {
        return usersRepository.findById(id);
    }

    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }

    public User save(User user) {
        return usersRepository.save(user);
    }

    public List<User> findAll(){
        return usersRepository.findAll();
    }
}
