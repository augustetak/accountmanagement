package com.augustetek.bank.accountmanagement.service.impl;

import com.augustetek.bank.accountmanagement.dto.BusinessAccountDTO;
import com.augustetek.bank.accountmanagement.entity.BusinessAccount;
import com.augustetek.bank.accountmanagement.entity.Client;
import com.augustetek.bank.accountmanagement.exception.ClientNotFoundException;
import com.augustetek.bank.accountmanagement.maper.BusinessAccountMapper;
import com.augustetek.bank.accountmanagement.repository.BusinessAccountRepository;
import com.augustetek.bank.accountmanagement.repository.ClientRepository;
import com.augustetek.bank.accountmanagement.service.adapter.BusinessAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class BusinessAccountServiceImpl implements BusinessAccountService {

    private final BusinessAccountRepository businessAccountRepository;
    private final BusinessAccountMapper businessAccountMapper;
    private final ClientRepository clientRepository;

    @Override
    public BusinessAccountDTO createBusinessAccount(BusinessAccountDTO dto) {
        //Map dto to entity
        BusinessAccount businessAccount = businessAccountMapper.toEntity(dto);

        //Fetch client
        Client client = clientRepository.findById(dto.getClientId()).orElseThrow(() -> new ClientNotFoundException("Client not found"));

        //Set relation
        businessAccount.setOwner(client);

        //Save
        BusinessAccount account = businessAccountRepository.save(businessAccount);

        return businessAccountMapper.toDTO(account);
    }
}
