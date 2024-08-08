package com.miguel.raffles.Orders;

import com.miguel.raffles.OrderLines.OrderLine;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String customerId;

    @OneToMany(mappedBy = "order")
    private Set<Integer> ticketsIds;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdDate;

}
