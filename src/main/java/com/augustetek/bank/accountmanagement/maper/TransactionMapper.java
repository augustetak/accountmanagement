package com.augustetek.bank.accountmanagement.maper;

import com.augustetek.bank.accountmanagement.dto.TransactionDTO;
import com.augustetek.bank.accountmanagement.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDTO toDTO(Transaction transaction);
    //TODO inject accountService here for maaping sourceAccount
    Transaction toEntity(TransactionDTO dto);
}
