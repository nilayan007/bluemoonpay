package com.bluemoon.bluemoonpay.merchant.service.impl;

import com.bluemoon.bluemoonpay.common.enums.MerchantStatus;
import com.bluemoon.bluemoonpay.common.enums.UserRole;
import com.bluemoon.bluemoonpay.common.exception.DuplicateResourceException;
import com.bluemoon.bluemoonpay.merchant.dto.request.MerchantSignupRequest;
import com.bluemoon.bluemoonpay.merchant.dto.response.MerchantResponse;
import com.bluemoon.bluemoonpay.merchant.entity.AppUser;
import com.bluemoon.bluemoonpay.merchant.entity.Merchant;
import com.bluemoon.bluemoonpay.merchant.mapper.MerchantMapper;
import com.bluemoon.bluemoonpay.merchant.repository.AppUserRepository;
import com.bluemoon.bluemoonpay.merchant.repository.MerchantRepository;
import com.bluemoon.bluemoonpay.merchant.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final AppUserRepository appUserRepository;
    private final MerchantRepository merchantRepository;
    private final MerchantMapper merchantMapper;

    @Override
    @Transactional
    public MerchantResponse signup(MerchantSignupRequest request) {
        if (merchantRepository.existsByEmail(request.email())) {
            throw new DuplicateResourceException("DUPLICATE_MERCHANT_EMAIL",
                    "Merchant with email already exists: " + request.email());
        }

        Merchant merchant = merchantMapper.toEntityFromSignUp(request);
        merchant.setStatus(MerchantStatus.PENDING_KYC);

        merchant = merchantRepository.save(merchant);

        AppUser appUser = AppUser.builder()
                .email(request.email())
                .merchant(merchant)
                .passwordHash(request.password()) //  TODO: encrypt using Bcrypt
                .role(UserRole.OWNER)
                .build();
        appUserRepository.save(appUser);

        return merchantMapper.toResponse(merchant);
    }
}