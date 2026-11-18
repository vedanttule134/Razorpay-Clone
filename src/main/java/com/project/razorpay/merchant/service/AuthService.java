package com.project.razorpay.merchant.service;

import com.project.razorpay.merchant.dto.request.MerchantSignUpRequest;
import com.project.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {

    MerchantResponse signup(MerchantSignUpRequest request);
}
