package com.augustetek.bank.accountmanagement.entity;

import com.augustetek.bank.accountmanagement.enums.TransactionStatusEnum;
import com.augustetek.bank.accountmanagement.enums.TransactionTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Transactions")
@AllArgsConstructor @NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Enumerated(EnumType.STRING)
    private TransactionTypeEnum transactionType;
    private BigDecimal amount;
    private LocalDateTime transactionDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "sourceAccountId", nullable = false)
    private BankAccount sourceAccount;

    @ManyToOne
    @JoinColumn(name = "destinationAccountId", nullable = false)
    private BankAccount destinationAccount;

    @Enumerated(EnumType.STRING)
    private TransactionStatusEnum status;
}
