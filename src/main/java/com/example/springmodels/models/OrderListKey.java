package com.example.springmodels.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderListKey implements Serializable {
    @Column(name = "product_id")
    private int productID;

    @Column(name = "order_id")
    private int orderID;
}
