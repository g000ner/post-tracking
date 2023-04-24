package com.mediasofttest.posttracking.entity.postalDelivery.postalDeliveryRoutePoint;

import com.mediasofttest.posttracking.entity.postOffice.PostOffice;
import com.mediasofttest.posttracking.entity.postalDelivery.PostalDelivery;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "postal_delivery_route_point")
@IdClass(PostalDeliveryRoutePointId.class)
public class PostalDeliveryRoutePoint {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    PostalDelivery delivery;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    PostOffice office;
    LocalDateTime deliveredDate;
    LocalDateTime sentDate;
}
