package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Metodo que retorna la lista de productos
    public List<Producto> getProductos(boolean activos); // se tiene que poner en plural el nombre del "Get" porque es una lista 
    //A esto se le conoce como "firma del metodo" es como el contrato diciendo que eso se va a ofrecer

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);  //Aqui se pone en SINGULAR, porque solo devuelve solo 1 uno
    //BAJA PUNTOS EN EXAMEN SI NO ESTAN EN PLURAL O EN SINGULAR, RESPECTIVAMENTE

    // SI id del producto != VACIO, entonces CREAR un registro
    // SI id del producto  = VACIO, entonces ACTUALIZA el registro
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

}