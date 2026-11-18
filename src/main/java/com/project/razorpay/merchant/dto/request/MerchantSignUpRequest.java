package com.project.razorpay.merchant.dto.request;

import com.project.razorpay.common.enums.BusinessType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MerchantSignUpRequest(
        @NotNull(message = "Name should be provided")
        @Size(max = 50, message = "Name should not be more than 50 characters long")
        String name,

        @Email
        @NotNull(message = "Email is required")
        String email,

        @NotNull(message = "Password is required")
        @Size(min = 8, message = "Password should be at least 8 character long")
        String password,

        @Size(max = 50, message = "Business Type should not be more than 50 characters")
        String businessName,

        BusinessType businessType
) {
}
