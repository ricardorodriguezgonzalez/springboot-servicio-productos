package com.formacion.app.productos.models.service;

import com.formacion.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
}
