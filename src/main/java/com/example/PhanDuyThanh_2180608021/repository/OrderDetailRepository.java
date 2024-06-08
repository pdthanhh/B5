package com.example.ToNguyenDuongHieuNghia_2180609492.repository;

import com.example.ToNguyenDuongHieuNghia_2180609492.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
