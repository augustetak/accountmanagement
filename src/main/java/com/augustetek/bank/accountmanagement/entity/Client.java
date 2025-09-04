package com.augustetek.bank.accountmanagement.entity;

import com.augustetek.bank.accountmanagement.enums.ClientTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "Clients")
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;

    @Column(unique = true, nullable = false)
    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private ClientTypeEnum clientType;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private User user;

    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BankAccount> accounts;
}
