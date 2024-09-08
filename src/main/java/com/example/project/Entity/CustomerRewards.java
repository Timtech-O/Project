package com.example.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRewards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Double totalCashback;
    private Double currentBalance;

    @OneToMany(mappedBy = "customerRewards", cascade = CascadeType.ALL)
    private List<CashbackHistory> cashbackHistoryList;
}
