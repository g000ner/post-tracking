package com.mediasofttest.posttracking.entity.postalDelivery.postalDeliveryRoutePoint;

import com.mediasofttest.posttracking.entity.postOffice.PostOffice;
import com.mediasofttest.posttracking.entity.postalDelivery.PostalDelivery;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostalDeliveryRoutePointId {
    PostalDelivery delivery;
    PostOffice office;
}
