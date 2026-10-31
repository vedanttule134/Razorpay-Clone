package com.project.razorpay.payment.entity;

import com.project.razorpay.common.entity.Money;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "merchant_id", nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;
}
