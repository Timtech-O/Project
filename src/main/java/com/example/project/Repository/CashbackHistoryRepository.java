package com.example.project.Repository;

import com.example.project.Entity.CashbackHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashbackHistoryRepository extends JpaRepository<CashbackHistory, Long> {
    List<CashbackHistory> findByCustomerRewards_CustomerId(Long customerId);
}
