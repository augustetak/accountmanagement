package com.augustetek.bank.accountmanagement.dto;

import com.augustetek.bank.accountmanagement.enums.AccountStatusEnum;
import lombok.Data;

@Data
public class BankAccountLightDTO {
    private String accountNumber; //IBAN
    private AccountStatusEnum status;
    private Long clientId;

}
