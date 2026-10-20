package edu.icet.crm.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String name;

    private String contacNumber;

    private Integer age;

    boolean isActive;


}
