package com.augustetek.bank.accountmanagement.maper;

import com.augustetek.bank.accountmanagement.dto.BankAccountDTO;
import com.augustetek.bank.accountmanagement.dto.BusinessAccountDTO;
import com.augustetek.bank.accountmanagement.entity.BankAccount;
import com.augustetek.bank.accountmanagement.entity.BusinessAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {TransactionMapper.class})
public interface BusinessAccountMapper {

    BusinessAccountDTO toDTO(BusinessAccount account);

    // Ignore client here (we’ll set it manually in service)
    @Mapping(target = "owner", ignore = true)
    @Mapping(target = "accountId", ignore = true)
    @Mapping(target = "openedAt", expression = "java(java.time.LocalDateTime.now())")
    BusinessAccount toEntity(BusinessAccountDTO source);
}
