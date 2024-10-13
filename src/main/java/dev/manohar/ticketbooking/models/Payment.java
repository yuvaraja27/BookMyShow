package dev.manohar.ticketbooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime payemntTime;
    @Enumerated(EnumType.STRING)
    private PaymentMode modeOfPayment;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
