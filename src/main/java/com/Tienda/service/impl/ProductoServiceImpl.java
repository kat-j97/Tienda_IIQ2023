package com.Tienda.service.impl;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Siempre poner esta anotación
public class ProductoServiceImpl implements ProductoService {

    @Autowired    //crea la cantidad de objetos que necesite sin tener que usar el =new ProductoDao...
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> lista = productoDao.findAll();

        if (activos) {
            //Se usa para ELIMINAR las CATEGORIAS que sean ACTIVO=FALSE
            lista.removeIf(x -> !x.isActivo());
        }

        return lista;
    }

    //PASA MUCHO EN EL EXAMEN: Para que se pueda comunicar con la interface de "ProductoService" se necesita el @Service 
    //SI NO VA A BAJAR PunToS
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

}