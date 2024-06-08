package com.example.ToNguyenDuongHieuNghia_2180609492.repository;

import com.example.ToNguyenDuongHieuNghia_2180609492.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
