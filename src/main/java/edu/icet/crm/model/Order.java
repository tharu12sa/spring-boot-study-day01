package edu.icet.crm.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderName;
    private Integer orderQuontity;
    private Double orderPrice;
}
