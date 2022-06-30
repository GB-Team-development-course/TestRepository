package com.geekbrains.spring.web.core.services;
/* 
30.06.2022: Alexey created this file inside the package: com.geekbrains.spring.web.core.services 
*/

import com.geekbrains.spring.web.core.entities.Wallet;
import com.geekbrains.spring.web.core.repositories.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {
    private final WalletRepository walletRepository;

    @Override
    public List<Wallet> findAll() {
        return walletRepository.findAll();
    }

    @Override
    public Wallet findById(Long id) {
        return walletRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        walletRepository.deleteById(id);
    }

    @Override
    public Wallet save(Wallet wallet) {
        return walletRepository.save(wallet);
    }
}
