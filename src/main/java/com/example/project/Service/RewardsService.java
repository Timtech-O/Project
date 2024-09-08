package com.example.project.Service;

import com.example.project.Entity.CashbackHistory;
import com.example.project.Entity.CustomerRewards;
import com.example.project.Repository.CashbackHistoryRepository;
import com.example.project.Repository.CustomerRewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardsService {

    @Autowired
    private CustomerRewardsRepository customerRewardsRepository;

    @Autowired
    private CashbackHistoryRepository cashbackHistoryRepository;

    public CustomerRewards getCustomerRewards(Long customerId) {
        return customerRewardsRepository.findByCustomerId(customerId)
                .orElseThrow();
    }

    public List<CashbackHistory> getCashbackHistory(Long customerId) {
        return cashbackHistoryRepository.findByCustomerRewards_CustomerId(customerId);
    }
}
