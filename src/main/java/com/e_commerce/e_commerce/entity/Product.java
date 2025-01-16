package com.e_commerce.e_commerce.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @Column(name = "product_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @Column(name="product_name", length = 40)
    private String productName;

    @Column(name = "price", length = 20)
    private int price;

    @Column(name ="color", length = 20)
    private String color;

    @Column(name = "category", length = 20)
    private String category;

    @Column(name = "description")
    private String description;

}
