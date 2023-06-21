package com.Tienda.service.imp;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Siempre poner esta anotación
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired //Crear una variable sin instancia + conecta a la base de datos
    private CategoriaDao categoriaDao;
    @Override
    @Transactional(readOnly=true) //Springframework (Es unicamente para lectura)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();
        
        if (activos){
        lista.removeIf(x -> !x.isActivo()); // remover de la lista los elementos o categorias donde activo "isactivo" es falso.
        }
        
        return lista;
    }

}
