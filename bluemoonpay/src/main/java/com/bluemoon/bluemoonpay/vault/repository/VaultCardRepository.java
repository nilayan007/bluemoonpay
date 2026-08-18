package com.bluemoon.bluemoonpay.vault.repository;

import com.bluemoon.bluemoonpay.vault.entity.VaultCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VaultCardRepository extends JpaRepository<VaultCard, UUID> {
}
