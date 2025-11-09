package com.devsenior.caren.product_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsenior.caren.product_backend.entity.Producto;
import com.devsenior.caren.product_backend.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	public Optional<Producto> findById(Long id) {
		return productoRepository.findById(id);
	}

	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	public void deleteById(Long id) {
		productoRepository.deleteById(id);
	}

}

