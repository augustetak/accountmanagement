package com.augustetek.bank.accountmanagement.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("BUSINESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessAccount extends BankAccount {
    private BigDecimal creditLine;
    private String businessName;
}
