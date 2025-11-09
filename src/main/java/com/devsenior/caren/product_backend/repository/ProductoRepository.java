package com.devsenior.caren.product_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsenior.caren.product_backend.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}

