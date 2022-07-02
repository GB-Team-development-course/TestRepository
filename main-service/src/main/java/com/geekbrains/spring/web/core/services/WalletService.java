package com.geekbrains.spring.web.core.services;/* 
30.06.2022: Alexey created this file inside the package: com.geekbrains.spring.web.core.services 
*/

import com.geekbrains.spring.web.core.entities.Wallet;

import java.util.List;

public interface WalletService {
    List<Wallet> findAll();

    Wallet findById(Long id);

    void deleteById(Long id);

    Wallet save(Wallet wallet);
}
