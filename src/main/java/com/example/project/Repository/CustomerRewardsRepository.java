package com.example.project.Repository;

import com.example.project.Entity.CustomerRewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRewardsRepository extends JpaRepository<CustomerRewards, Long> {
    Optional<CustomerRewards> findByCustomerId(Long customerId);
}
