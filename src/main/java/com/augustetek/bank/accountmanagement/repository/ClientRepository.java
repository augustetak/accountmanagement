package com.augustetek.bank.accountmanagement.repository;

import com.augustetek.bank.accountmanagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
