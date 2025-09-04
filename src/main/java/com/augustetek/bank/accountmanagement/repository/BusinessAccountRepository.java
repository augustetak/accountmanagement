package com.augustetek.bank.accountmanagement.repository;

import com.augustetek.bank.accountmanagement.entity.BusinessAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessAccountRepository extends JpaRepository<BusinessAccount, Long> {
}
