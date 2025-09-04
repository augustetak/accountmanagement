package com.augustetek.bank.accountmanagement.controller;

import com.augustetek.bank.accountmanagement.dto.BusinessAccountDTO;
import com.augustetek.bank.accountmanagement.service.adapter.BusinessAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/business-accounts")
@AllArgsConstructor
public class BusinessAccountController {
    private final BusinessAccountService businessAccountService;

    @PostMapping
    public ResponseEntity<BusinessAccountDTO> createBusinessAccount(@RequestBody BusinessAccountDTO businessAccountDTO) {
        return ResponseEntity.ok(businessAccountService.createBusinessAccount(businessAccountDTO));
    }
}
