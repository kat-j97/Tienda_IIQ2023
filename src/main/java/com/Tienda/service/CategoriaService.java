package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Método que retorna la lista de Categoria
    public List<Categoria> getCategorias(boolean activos); //Siempre es plural porque devuelve listas
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
