package com.example.ToNguyenDuongHieuNghia_2180609492;

import jakarta.persistence.*;
import lombok.*;
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String description;
    private String thumbnail;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
