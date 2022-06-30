package com.geekbrains.spring.web.core.entities;
/* 
30.06.2022: Alexey created this file inside the package: com.geekbrains.spring.web.core.entities 
*/

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "WALLET")
@Data
@NoArgsConstructor
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private BigDecimal value;

    public Wallet(Long id, String name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
