package com.thanhdatpb.banking.bankingapplication.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}