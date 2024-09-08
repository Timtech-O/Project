package com.example.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashbackHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long transactionId;
    private LocalDate transactionDate;
    private Double amountEarned;
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_rewards_id")
    private CustomerRewards customerRewards;
}
