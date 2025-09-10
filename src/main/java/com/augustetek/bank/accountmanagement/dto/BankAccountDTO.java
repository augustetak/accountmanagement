package com.augustetek.bank.accountmanagement.dto;

import com.augustetek.bank.accountmanagement.enums.AccountStatusEnum;
import com.augustetek.bank.accountmanagement.enums.AccountTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BankAccountDTO extends BankAccountLightDTO {
    private BigDecimal balance;
    private String currency;
    private LocalDateTime openedAt;
    private AccountStatusEnum status;
    private List<TransactionDTO> transactions;
}
