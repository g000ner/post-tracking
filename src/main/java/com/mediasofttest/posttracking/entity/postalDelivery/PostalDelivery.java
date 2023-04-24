package com.mediasofttest.posttracking.entity.postalDelivery;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "postal_delivery")
public class PostalDelivery {
    @Id
    @SequenceGenerator(name = "postal_delivery_sequence", sequenceName = "postal_delivery_sequence", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postal_delivery_sequence")
    private Long id;
    @Enumerated(EnumType.STRING)
    private PostalDeliveryType type;
    private String recipientIndex;
    private String recipientAddress;
    private String recipientName;
}
