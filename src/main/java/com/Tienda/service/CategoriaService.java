package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Método que retorna la lista de Categoria
    public List<Categoria> getCategorias(boolean activos); //Siempre es plural porque devuelve listas
}
