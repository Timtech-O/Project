package com.example.project.Controller;

import com.example.project.Entity.CashbackHistory;
import com.example.project.Entity.CustomerRewards;
import com.example.project.Service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    @GetMapping("/balance")
    public ResponseEntity<?> getRewardsBalance(@RequestParam Long customerId) {
        CustomerRewards customerRewards = rewardsService.getCustomerRewards(customerId);
        return ResponseEntity.ok(customerRewards);
    }

    @GetMapping("/history")
    public ResponseEntity<?> getCashbackHistory(@RequestParam Long customerId) {
        List<CashbackHistory> cashbackHistory = rewardsService.getCashbackHistory(customerId);
        return ResponseEntity.ok(cashbackHistory);
    }
}
