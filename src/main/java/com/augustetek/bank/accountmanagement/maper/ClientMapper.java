package com.augustetek.bank.accountmanagement.maper;

import com.augustetek.bank.accountmanagement.dto.ClientDTO;
import com.augustetek.bank.accountmanagement.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    //@Mapping(source = "userAccount.accountId",target = "accountId")
    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO dto);
}
