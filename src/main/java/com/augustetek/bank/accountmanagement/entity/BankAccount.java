package com.augustetek.bank.accountmanagement.entity;

import com.augustetek.bank.accountmanagement.enums.AccountStatusEnum;
import com.augustetek.bank.accountmanagement.enums.AccountTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "BankAccounts")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "accountType", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor @AllArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(unique = true, nullable = false)
    private String accountNumber; //IBAN

    //@Enumerated(EnumType.STRING)
    //private AccountTypeEnum accountType;
    private BigDecimal balance;
    private String currency;
    private LocalDateTime openedAt = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private AccountStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client owner;

    @OneToMany(mappedBy = "sourceAccount",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Transaction> outgoingTransactions;

    @OneToMany(mappedBy = "destinationAccount",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Transaction> incomingTransactions;
}
