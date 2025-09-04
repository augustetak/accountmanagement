package com.augustetek.bank.accountmanagement.maper;

import com.augustetek.bank.accountmanagement.dto.BankAccountDTO;
import com.augustetek.bank.accountmanagement.entity.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TransactionMapper.class})
public interface BankAccountMapper {

    BankAccountDTO toDTO(BankAccount account);
    BankAccount toEntity(BankAccountDTO bankAccountDTO);
}
