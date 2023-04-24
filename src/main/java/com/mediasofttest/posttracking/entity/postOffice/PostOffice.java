package com.mediasofttest.posttracking.entity.postOffice;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "post_office")
public class PostOffice {
    @Id
    private String index;
    private String name;
    private String address;
}
