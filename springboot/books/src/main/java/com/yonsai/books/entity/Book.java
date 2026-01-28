package com.yonsai.books.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor @ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;          // title 컬럼 매핑

    private String author;         // author 컬럼 매핑
    
    private String publishDate;    // publish_date 컬럼과 자동 매핑
    
    private int price;             // price 컬럼 매핑
    
    private int originalPrice;     // original_price 컬럼 매핑
    
    private int discountRate;      // discount_rate 컬럼 매핑
    
    private int point;             // point 컬럼 매핑
    
    @Column(columnDefinition = "TEXT")
    private String description;    // description 컬럼 매핑
    
    private String deliveryDate;   // delivery_date 컬럼 매핑
    
    private double rating;         // rating 컬럼 매핑
    
    private String imageUrl;       // image_url 컬럼 매핑
}