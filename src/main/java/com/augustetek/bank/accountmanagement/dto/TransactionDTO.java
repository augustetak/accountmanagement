package com.augustetek.bank.accountmanagement.dto;

import com.augustetek.bank.accountmanagement.enums.TransactionStatusEnum;
import com.augustetek.bank.accountmanagement.enums.TransactionTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionDTO {
    private Long transactionId;
    private TransactionTypeEnum transactionType;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private Long sourceAccountId;
    private Long destinationAccountId;
    private TransactionStatusEnum status;
}
