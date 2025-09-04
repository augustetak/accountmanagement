package com.augustetek.bank.accountmanagement.dto;

import lombok.Data;

@Data
public class BusinessAccountDTO extends BankAccountLightDTO {
    private Double creditLine;
    private String businessName;
}
