package com.augustetek.bank.accountmanagement.dto;

import com.augustetek.bank.accountmanagement.entity.BankAccount;
import com.augustetek.bank.accountmanagement.enums.ClientTypeEnum;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ClientDTO {
    private Long clientId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String email;
    private String phoneNumber;
    private ClientTypeEnum clientType;
    private LocalDateTime createdAt;
    private Long accountId; // private Long accountId;
    private List<BankAccount> accounts;
}
