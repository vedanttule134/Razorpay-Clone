package com.project.razorpay.payment.entity;

import com.project.razorpay.common.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "merchant_id", nullable = false)
    private UUID merchantId;

    private OrderStatus orderStatus;

    private Integer attempts;

    private Map<String, Object> notes;

    private LocalDateTime expiresAt;
}
