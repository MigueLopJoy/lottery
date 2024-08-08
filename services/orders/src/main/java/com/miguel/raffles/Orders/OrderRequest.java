package com.miguel.raffles.Orders;

import com.miguel.raffles.Customers.CustomerInfo;
import com.miguel.raffles.Tickets.OrderTicketRequest;

import java.util.Set;

public record OrderRequest (
        Set<OrderTicketRequest> tickets,
        
        Double total,

        CustomerInfo customerInfo
) {
}
