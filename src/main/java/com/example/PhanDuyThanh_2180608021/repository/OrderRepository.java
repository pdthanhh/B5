package com.example.ToNguyenDuongHieuNghia_2180609492.repository;

import com.example.ToNguyenDuongHieuNghia_2180609492.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
