package com.project.razorpay.merchant.service.impl;

import com.project.razorpay.common.enums.MerchantStatus;
import com.project.razorpay.merchant.dto.request.MerchantSignUpRequest;
import com.project.razorpay.merchant.dto.response.MerchantResponse;
import com.project.razorpay.merchant.entity.Merchant;
import com.project.razorpay.merchant.repository.AppUserRepository;
import com.project.razorpay.merchant.repository.MerchantRepository;
import com.project.razorpay.merchant.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final AppUserRepository appUserRepository;
    private final MerchantRepository merchantRepository;

    @Override
    public MerchantResponse signup(MerchantSignUpRequest request) {

        if(merchantRepository.existByEmail(request.email())) {
            throw new RuntimeException("Merchant with email already exists: "+ request.email());
        }

        Merchant merchant = Merchant.builder()
                .businessName(request.businessName())
                .businessType(request.businessType())
                .name(request.name())
                .email(request.email())
                .status(MerchantStatus.PENDING)
                .build();

        return null;
    }
}
