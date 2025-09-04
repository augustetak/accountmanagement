package com.augustetek.bank.accountmanagement.entity;

import com.augustetek.bank.accountmanagement.enums.UserStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false)
    private String userName;

    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;


    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime lastLogin;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @ManyToMany(fetch = FetchType.LAZY) // or EAGER if preferred
    @JoinTable(
            name = "UserRoles", // join table
            joinColumns = @JoinColumn(name = "userId"), // FK to User
            inverseJoinColumns = @JoinColumn(name = "roleId") // FK to Role
    )
    private Set<UserRole> roles = new HashSet<>();
}
