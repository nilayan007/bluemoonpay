package com.bluemoon.bluemoonpay.merchant.repository;

import com.bluemoon.bluemoonpay.merchant.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
