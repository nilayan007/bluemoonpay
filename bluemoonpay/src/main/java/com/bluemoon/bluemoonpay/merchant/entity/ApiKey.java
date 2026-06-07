package com.bluemoon.bluemoonpay.merchant.entity;


import com.bluemoon.bluemoonpay.common.enums.Environment;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "api_keys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiKey {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @Column(length = 100, nullable = false, unique = true)
    private String keyId;

    @Column(length = 500, nullable = false)
    private String keySecretHash;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private Environment environment;

    @Column(nullable = false)
    private boolean enabled = true;


    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime rotatedAt;
    private java.time.LocalDateTime gracePeriodEndAt;

}
