package com.project.razorpay.merchant.entity;

import com.project.razorpay.common.enums.BusinessType;
import com.project.razorpay.common.enums.MerchantStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "merchant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(length = 20)
    private String contactNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private BusinessType businessType;

    @Column(length = 200)
    private String businessName;

    @Column(length = 255)
    private String websiteUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private MerchantStatus status;

    @Column(length = 15)
    private String gstId;

    @Column(length = 10)
    private String panId;

    @Column(length = 30)
    private String settlementBankAccount;

    @Column(length = 11)
    private String settlementBankIfsc;

    @Column(length = 150)
    private String settlementBankAccountHolderName;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(length = 100, updatable = false)
    private String createdBy;

    @Column(length = 100)
    private String updatedBy;
}
