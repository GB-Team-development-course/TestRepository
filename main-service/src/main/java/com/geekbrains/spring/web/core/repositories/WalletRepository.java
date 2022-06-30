package com.geekbrains.spring.web.core.repositories;/* 
30.06.2022: Alexey created this file inside the package: com.geekbrains.spring.web.core.repositories 
*/

import com.geekbrains.spring.web.core.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long>, JpaSpecificationExecutor<Wallet> {
}
