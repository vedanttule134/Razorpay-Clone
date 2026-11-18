package com.project.razorpay.merchant.dto.response;

import com.project.razorpay.common.enums.BusinessType;
import com.project.razorpay.common.enums.MerchantStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record MerchantResponse(
        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {
}
